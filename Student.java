public class Student{
    private int rollno;
    private String name;
    private String course;

    public Student(int rollno, String name, String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    public int getRollNo(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }

    public String toString(){
        return rollno+", "+name+", "+course;
    }
    public static Student fromString(String line){
        String[] parts = line.split(",");
        return new Student(Integer.parseInt(parts[0]),parts[1],parts[2]);
    }
}
