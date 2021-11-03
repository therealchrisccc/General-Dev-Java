public class MajorDemographics {
    private int femaleCount;
    private int maleCount;
    private final String name;
    private int nonBinaryCount;

    public MajorDemographics(String name) {

    }

    public String getName() {
        return name;
    }

    public void addGenderDemographic(String gender) {
        if (gender == "M") {
            maleCount++;
        } else if (gender == "F") {
            femaleCount++;
        } else {
            nonBinaryCount++;
        }
    }

    public double[] getPercents() {
        double malePercent;
        double femalePercent;
        double nonBinaryPercent;
        double[] out = new double[3];
        out[0] = malePercent;
        out[1] = femalePercent;
        out[2] = nonBinaryPercent;
        return out;
    }

    public static void main(String[] args) {
        MajorDemographics major = new MajorDemographics("Basket Weaving");
        major.addGenderDemographic("M");
        major.addGenderDemographic("F");
        major.addGenderDemographic("N");
        major.addGenderDemographic("");

    }

}
