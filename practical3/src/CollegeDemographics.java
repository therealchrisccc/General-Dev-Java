public class CollegeDemographics {
    private final String code;
    private int majorCount;
    private final MajorDemographics[] majorDemographics;
    private final String name;

    public CollegeDemographics(String code, String name) {

    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void addGenderDemographic(String major, String gender) {

    }

    private MajorDemographics findMajor(String major) {

    }

    public String getTable() {

    }

    public static void main(String[] args) {
        // Notice we built a CollegeDemographics object to help with tests
        // this essentially tests the constructor also
        CollegeDemographics demo = new CollegeDemographics("NS", "Natural Sciences");
        System.out.println("TEST: getCode() returns NS - " + demo.getCode());

        // create an empty MajorDemographic - does need it implemented with
        // constructor and accessor
        MajorDemographics major1 = new MajorDemographics("Major1");

        // force adding a major, and incrementing count.
        demo.majorDemographics[0] = major1;
        demo.majorCount = 1;

        MajorDemographics majorTest = demo.findMajor("Major1");
        System.out.println("TEST: findMajor, set value - " + majorTest.getName());

        // now trying with auto add
        majorTest = demo.findMajor("Major2");
        System.out.println("TEST: findMajor, add value - " + majorTest.getName());

        // min tests
        // System.out.println("TEST: getCode() returns NS - NS");
        // System.out.println("TEST: getName() returns Natural Sciences - Natural
        // Sciences");
        // System.out.println(" TEST: findMajor, set value - Major1");
        // System.out.println("TEST: findMajor, add value - " + Major2);
    }

}
