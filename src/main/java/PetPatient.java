public class PetPatient extends AbstractPatient {


    public PetPatient(int patientID, String patientName) {
        super(patientID, patientName);
    }

    public PetPatient(int patientID, String patientName, String problemName) {
        super(patientID, patientName, problemName);
        System.out.println("Pet patient "+patientName+", suffering from "+
                problemName+", has been added. Get well dear "+patientName+"!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PetPatient{");
        sb.append("patientID=").append(patientID);
        sb.append(", patientName='").append(patientName).append('\'');
        sb.append(", problemName='").append(problemName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
