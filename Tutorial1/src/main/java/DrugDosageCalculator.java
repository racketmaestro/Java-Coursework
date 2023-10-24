public class DrugDosageCalculator {

    public double calculateTotalDosage(int age, double dosage, double weight) {
        boolean isAgeOver65 = age > 65;
        double totalDosage;
        if(!isAgeOver65) {
            totalDosage = dosage * weight;
        } else {
            totalDosage = (1 - (age - 65)*0.02)* dosage * weight;
        }

        return totalDosage;
    }
}