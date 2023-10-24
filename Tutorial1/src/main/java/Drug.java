public class Drug {
    private String drugName;
    private double dosage;
    public Drug(String drugName, double dosage) {
        this.drugName = drugName;
        this.dosage = dosage;
    }
    public String getDrugName() {
        return drugName;
    }
    public double getDosage() {
        return dosage;
    }

}
