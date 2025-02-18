package academic.driver;

import java.util.ArrayList;
import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

/**
 * @author 12S23036 Jopel Simarmata
 * @author 12S23024 Eska Silaen
 */
public class Driver2 {

    public static void main(String[] _args) {

        Scanner scn = new Scanner(System.in);
        Boolean cek = true;
        
        ArrayList<Course> daftarMataKuliah = new ArrayList<>();
        ArrayList<Student> daftarMahasiswa = new ArrayList<>();
        ArrayList<Enrollment> daftarEnrollments = new ArrayList<>();




        while(true){
            String command = scn.nextLine();

            if(command.equalsIgnoreCase("---")){
                break;
            } 
            String[] temp = new String[5];
            //split command
            String[] splitCommand = command.split("#");

            temp[0] = splitCommand[0];
            temp[1] = splitCommand[1];
            temp[2] = splitCommand[2];
            temp[3] = splitCommand[3];
            temp[4] = splitCommand[4];

            if(temp[0].equals("course-add")){
                Course course = new Course(temp[1], temp[2], temp[3], temp[4]);
                daftarMataKuliah.add(course);
            } else if(temp[0].equals("student-add")){
                Student student = new Student(temp[1], temp[2], temp[3], temp[4]);
                daftarMahasiswa.add(student);
            } else if(temp[0].equals("enrollment-add")){
                Enrollment enrollment = new Enrollment(temp[1], temp[2], temp[3], temp[4]);
                daftarEnrollments.add(enrollment);
            }
        }










        for(int i = 0; i < daftarEnrollments.size(); i++){
            for(int j = 0; j < daftarMahasiswa.size(); j++){
            if(!daftarEnrollments.get(i).getNim().equals(daftarMahasiswa.get(j).getNim())){
                System.out.println("invalid student|"+ daftarMahasiswa.get(j).getNim());
                break;
            }
            }
        }



        for(int i = 0; i < daftarEnrollments.size(); i++){
            for(int j = 0; j < daftarMataKuliah.size(); j++){
                if(!daftarEnrollments.get(i).getCodeCourse().equals(daftarMataKuliah.get(j).getCodeCourse())){
                    System.out.println("invalid course|"+ daftarMataKuliah.get(j).getCodeCourse());
                    break;
                }
            }
        }

        for(int i = 0; i < daftarMataKuliah.size(); i++){
            daftarMataKuliah.get(i).DisplayCourse();
        }

        for(int i = 0; i < daftarMahasiswa.size(); i++){
            daftarMahasiswa.get(i).DisplayStudent();
        }

        for(int i = 0; i < daftarEnrollments.size(); i++){
            daftarEnrollments.get(i).DisplayEnrollment();
        }


        

        // codes

    }

}