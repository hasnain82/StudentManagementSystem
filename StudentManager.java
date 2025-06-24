import java.io.*;
import java.util.*;


public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.txt";

    public StudentManager(){
        loadFromFile();
    }
    public void addStudent(Student student){
        students.add(student);
        saveToFile();
    }
    public void deleteStudent(int rollno){
        students.removeIf(s -> s.getRollNo() == rollno );
        saveToFile();
    }
    public void viewAllStudents(){
        for(Student s : students){
            System.out.println("Roll No: "+ s.getRollNo()+", Name: "+s.getName()+", Course: "+s.getCourse());
        }
    }
    public void searchStudent(int rollno){
        for(Student s: students){
            if(s.getRollNo() == rollno){
                System.out.println("Found "+s.getName()+", "+s.getCourse());
                return;
            }
        }
        System.out.println("Student not Found!");
    }

    
    private void saveToFile(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Student s: students){
                    bw.write(s.toString());
                    bw.newLine();
                }
            
        } catch (IOException e){
            System.out.println("Error to save file.");
        }
    }

    private void loadFromFile(){
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line = br.readLine()) != null){
                students.add(Student.fromString(line));
            }
        }
        catch(IOException e){

        }
    }
}
