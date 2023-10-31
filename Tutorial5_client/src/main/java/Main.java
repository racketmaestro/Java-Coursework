import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args)  {
        try {
            makeGetRequest();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void makeGetRequest() throws IOException {
        URL myURL = null;
        try {
            myURL = new URL("https://www.w3schools.com/java/java_variables.asp"); // create a new URL object
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "text/html");
        conn.setRequestProperty("charset", "utf-8");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(myURL.openStream()));

        String inputLine;
        // Read the body of the response
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();


    }
}
