public class Patient {
    private String name;
    private double weight;
    private int age;

    public Patient(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public String getName(){return name;}
}
