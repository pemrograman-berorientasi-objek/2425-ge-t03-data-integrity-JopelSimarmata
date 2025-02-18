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
    Boolean cek = false;


    Student student;
    Course course;

    public Enrollment(String CodeCourse, String Nim, String TahunAjaran, String Semester){
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

    public void cekValid(Boolean cek){
        this.cek = cek;
    }

    public Boolean getValid(){
        return this.cek;
    }

    public void DisplayEnrollment(){
        System.out.println(this.CodeCourse+"|"+this.Nim + "|" + this.TahunAjaran + "|" + this.Semester + "|" + this.nilai);
    }


    public void setStudents(Student student){
        this.student = student;
    }





    // class definition

}