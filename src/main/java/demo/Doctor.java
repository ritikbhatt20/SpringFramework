package demo;

public class Doctor implements Staff{

//    properties
    private String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }
//    adding the object itself

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
