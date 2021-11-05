package pt.iade.Hello.world.Modules;


public class CurricularUnits {

    private String  name;
    private double grade;
    private int semester;
    private int Ects;
    public CurricularUnits(String name, double grade, int semester, int ects) {
        this.name = name;
        this.grade = grade;
        this.semester = semester;
        Ects = ects;
    }
    public String getName() {
        return name;
    }
    
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public int getSemester() {
        return semester;
    }
    
    public int getEcts() {
        return Ects;
    }
    
    public boolean isApproved(){
        return grade >= 9.5;
    }
 
}
    

