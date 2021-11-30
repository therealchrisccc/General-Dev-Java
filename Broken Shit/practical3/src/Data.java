public class Data {
    private static final int COLLEGE = 0;
    private final CollegeDemographics[] collegeDemographics = { new CollegeDemographics("NS", "Natural Sciences"),
            new CollegeDemographics("EG", "Engineering") };

    private static final int GENDER = 5;
    private static final int PRIMARY_MAJOR_DESC = 3;
    private final String term;
    private static final int TERM = 4;

    public Data(String term) {
        this.term = term;

    }

    public void loadData(String filename) {
        CSVReader in = new CSVReader(filename, true);
        int i = 1;

        while (CSVReader.hasNext()) {
            String[] currentLine = in.getNext();
            if (!currentLine[TERM].equals(term) || currentLine.length <= 5) {
                continue;
            }
            if (currentLine[COLLEGE].equals("NS")) {
                i = 0;
            } else {
                i = 1;
            }
            collegeDemographics[i].addGenderDemographic(currentLine[PRIMARY_MAJOR_DESC], currentLine[GENDER]);

        }

    }

    public CollegeDemographics[] getCollegeDemographics() {
        return collegeDemographics;
    }

    public void printStats() {
        for (int i = 0; i < collegeDemographics.length; i++) {
            CollegeDemographics print = collegeDemographics[i];
            String output = print.getTable();
            System.out.println(output);

        }
    }
}
