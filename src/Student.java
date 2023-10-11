import java.util.Scanner;

public class Student extends User {
    private String subject;


    public Student(String userName, String passWord, String studentId) {
        super(userName, passWord);
        this.subject = studentId;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("subject"+subject);
    }
}
