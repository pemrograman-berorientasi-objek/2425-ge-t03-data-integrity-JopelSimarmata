package academic.model;

/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Enrollment {
    String Nim;
    String CodeCourse;
    String TahunAjaran;
    String Semester;
    String nilai = "None";

    Student student;
    Course course;

    public Enrollment(String Nim, String CodeCourse, String TahunAjaran, String Semester){
        this.Nim = Nim;
        this.CodeCourse = CodeCourse;
        this.TahunAjaran = TahunAjaran;
        this.Semester = Semester;
    }

    public String getNim(){
        return this.Nim;
    }

    public String getCodeCourse(){
        return this.CodeCourse;
    }

    public String getTahunAjaran(){
        return this.TahunAjaran;
    }

    public String getSemester(){
        return this.Semester;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public void DisplayEnrollment(){
        System.out.println(this.Nim+"|"+this.CodeCourse + "|" + this.TahunAjaran + "|" + this.Semester + "|" + this.nilai);
    }

    public void setCourse(this.){
        
    }

    public void setStudents(Student student){
        this.student = student;
    }




    // class definition

}