package academic.model;

/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Course {
    String codeCourse;
    String namaMK;
    String sks;
    String grade;

    public Course(String codeCourse, String namaMK, String sks, String grade){
        this.codeCourse = codeCourse;
        this.namaMK = namaMK;
        this.sks = sks;
        this.grade = grade;
    }

    public String getNamaMK(){
        return this.namaMK;
    }

    public String getCodeCourse(){
        return this.codeCourse;
    }

    public String getSks(){
        return this.sks;
    }

    public String getGrade(){
        return this.grade;
    }

    public void DisplayCourse(){
        System.out.println(this.codeCourse+"|"+this.namaMK + "|" + this.sks + "|" + this.grade);
    }











    // class definition

}