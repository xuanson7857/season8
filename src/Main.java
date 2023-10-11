import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Student studient  = new Student("xuanson","dadas","12");
     Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao ten");
        String name;
        String passs;
        name = scanner.nextLine();
        System.out.println(" nhao vao mk");
        passs= scanner.nextLine();
        if(studient.login(name,passs)){
            System.out.println("dang nhap k thanh cong");
        }else {
            System.out.println(" moi nhap laij");
        }







    }
}