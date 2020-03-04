package loops.loopsTask;

public class Hospital {
    final private int maxPatientsNumber = 10;
    private Patient[] patients = new Patient[maxPatientsNumber];
   private int regPatients = 0;
   void addPatients(Patient patient){
       if(regPatients<maxPatientsNumber){
           patients[regPatients]=patient;
           regPatients++;
       } else {
           System.out.println("max na dziś");
       }
   }
  public void printPatients(){
       for (int i = 0; i < regPatients; i++) {
           System.out.println(patients[i].getFirstName()
                   + " "+ patients[i].getLastName()+
                   " " + patients[i].getPESEEL() );
       }
   }
}
