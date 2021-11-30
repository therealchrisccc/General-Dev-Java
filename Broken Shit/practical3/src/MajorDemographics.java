import java.util.Arrays;

public class MajorDemographics {
    private int femaleCount;
    private int maleCount;
    private final String name;
    private int nonBinaryCount;

    public MajorDemographics(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MajorDemographics major = new MajorDemographics("Basket Weaving");
        major.addGenderDemographic("M");
        major.addGenderDemographic("F");
        major.addGenderDemographic("N");
        major.addGenderDemographic("");
        System.out.println("TEST: " + Arrays.toString(major.getPercents()));
    }

    public String getName() {
        return this.name;
    }

    public void addGenderDemographic(String gender) {
        if (gender.equals("M")) {
            maleCount = maleCount + 1;
        } else if (gender.equals("F")) {
            femaleCount = femaleCount + 1;
        } else {
            nonBinaryCount = nonBinaryCount + 1;
        }
    }

    public double[] getPercents() {
        double total = maleCount + femaleCount + nonBinaryCount;
        double[] out = new double[3];
        out[0] = maleCount / total;
        out[1] = maleCount / total;
        out[2] = nonBinaryCount / total;
        return out;
    }

}
