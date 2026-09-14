public class Experiment {

    String summary;
    Measurement[] measurements = new Measurement[10];

    public void addMeasurement(String note,double value,String unit){
        for (int i = 0; i < measurements.length; i++) {
            if (measurements[i] == null){
                measurements[i] = new Measurement();
                measurements[i].setMeasurementDetails(note,value,unit);
                break;
            }
        }
    }

    public String experimentReport(){
        String result = "\n"+summary+"\nMeasurements:";
        for (int i = 0; i < measurements.length; i++) {
            if (measurements[i] == null){break;}
            result += "\n\t" + (i+1) +
                    " " + measurements[i].note+
                    "\t" + measurements[i].value+
                    " " + measurements[i].unit;
        }
        return result;
    }
}
