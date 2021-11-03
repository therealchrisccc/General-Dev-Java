public class CollegeDemographics {
    private final String code;
    private int majorCount;
    private final MajorDemographics[] majorDemographics = new MajorDemographics[100];
    private final String name;

    public CollegeDemographics(String code, String name) {
        this.code = code;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void addGenderDemographic(String major, String gender) {
        MajorDemographics demo = findMajor(major);
        demo.addGenderDemographic(gender);
    }

    private MajorDemographics findMajor(String major) {
        for(int i = 0; i < majorCount; i++){
            String major1 = majorDemographics[i].getName();
            if(major1.equalsIgnoreCase(major)){
                return majorDemographics[i];
            }
        }
        MajorDemographics major2 = new MajorDemographics(major);
        majorDemographics[majorCount] = major2;
        majorCount++;
        return major2;
    }

    public String getTable() {
        StringBuilder firstLine = new StringBuilder(String.format("%-25s%-11s%-11s%-11s%n", getName() + ":", "Major", "Male", "Female"));

        for (int i = 0; i < majorCount; i++){
            double[] percent = majorDemographics[i].getPercents();
            firstLine.append(String.format("%30s%10.2f%%%10.2f%%%n", majorDemographics[i].getName(), (percent[0] * 100), (percent[1] * 100)));
        }
        return firstLine.toString();
    }

    public static void main(String[] args) {
        // Notice we built a CollegeDemographics object to help with tests
        // this essentially tests the constructor also
        CollegeDemographics demo = new CollegeDemographics("NS", "Natural Sciences");
        System.out.println("TEST: getCode() returns NS - " + demo.getCode());
        System.out.println("TEST: getName() returns Natural Sciences - " + demo.getName());

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
