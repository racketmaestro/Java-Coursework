import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Calculator calc = new Calculator(0);
//        calc.AC();
//        int i;
//        for(i=0;i<=10;i++){
//            calc.add(i);
//        }
//        calc.AC();
//        for(i=10;i>0;i=i-2){
//            calc.add(i);
//        }
//
//        calc.AC();
//        calc.add(1);
//        int j;
//        for(j = 7; j<=15; j++){
//            if (j%2 != 0){
//                calc.multiply(j);
//            }
//        }
//
//        calc.AC();
//        int n;
//        for(n = 2; n<=100; n++){
//            if(n%6 != 0){
//                calc.add(n);
//            }
//        }
        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("John Barking", 65, 60));
        patients.add(new Patient("Samantha Olives", 65, 70));
        patients.add(new Patient("Paul Ball", 90, 45));


        ArrayList<Drug> drugs = new ArrayList<Drug>();
        drugs.add(new Drug("Paracetamol", 10));
        drugs.add(new Drug("Benadryl", 5));

        DrugDosageCalculator calc = new DrugDosageCalculator();
        for(Patient p: patients){ //for each loop
            for(Drug d: drugs) {
                double totalDosage;
                totalDosage = calc.calculateTotalDosage(p.getAge(), d.getDosage(), p.getWeight());
                System.out.println(p.getName() + " Requires " + totalDosage + " of " + d.getDrugName());
            }
        }


    }
}


