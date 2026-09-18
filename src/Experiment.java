public class Experiment {

    private String summary;
    private static int counter;
    private int id;
    private Measurement[] measurements = new Measurement[10];

    public Experiment() {
        this("New Experiment");
    }

    public Experiment(String summary) {
        id = ++counter;
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void addMeasurement(String note, double value, String unit){
        for (int i = 0; i < measurements.length; i++) {
            if (measurements[i] == null){
                measurements[i] = new Measurement(note,value,unit);
                break;
            }
        }
    }

    @Override
    public String toString(){
        String result = "\nExperiment #"+id+"\n"+summary+"\nMeasurements:";
        for (int i = 0; i < measurements.length; i++) {
            if (measurements[i] == null){break;}
            result += "\n\t" + (i+1) + " " + measurements[i];
        }
        return result;
    }
}
