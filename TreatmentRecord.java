public class TreatmentRecord {

    private int patientId;
    private String patientName;
    private String treatment;
    private String doctorName;

    public TreatmentRecord(int patientId,
                           String patientName,
                           String treatment,
                           String doctorName) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.treatment = treatment;
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {

        return "Patient ID: " + patientId +
                ", Name: " + patientName +
                ", Treatment: " + treatment +
                ", Doctor: " + doctorName;
    }
}