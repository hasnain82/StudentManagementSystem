import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n -- Student Management System --");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose Options: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                System.out.print("Enter Roll No: ");
                int rollNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Course: ");
                String course = sc.nextLine();
                sm.addStudent(new Student(rollNo, name, course));
                break;

                case 2:
                sm.viewAllStudents();
                break;

                case 3:
                System.out.print("Enter Roll No to Search: ");
                int searchRollNo=sc.nextInt();
                sm.searchStudent(searchRollNo);
                break;

                case 4:
                System.out.print("Enter Roll No. to delete: ");
                int deleteRollNo = sc.nextInt();
                sm.deleteStudent(deleteRollNo);
                break;

                case 5:
                System.out.print("Exit...");
                System.exit(0);
                break;

                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
