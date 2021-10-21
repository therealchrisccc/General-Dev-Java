public class Data {
    private static final int COLLEGE = 0;
    private final CollegeDemographics[] collegeDemographics = { new CollegeDemographics("NS", "Natural Sciences"),
            new CollegeDemographics("EG", "Engineering") };

    private static final int GENDER = 5;
    private static final int PRIMARY_MAJOR_DESC = 3;
    private final String term;
    private static final int TERM = 4;

    public Data(String term){
        this.term = term;

    }

    public void loadData(String filename) {

    }

    public CollegeDemographics[] getCollegeDemographics() {
    }

    public void printStats() {

    }
}
