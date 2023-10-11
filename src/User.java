import java.util.Scanner;

public class User {
    private String userName;
    private String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public boolean login(String inputUserName, String inputPassword) {
        if (userName.equals(inputUserName) && passWord.equals(inputPassword)) {
            System.out.println("Đăng nhập thành công");
            return true;
        } else {
            System.out.println("Đăng nhập thất bại");
            return false;
        }
    }

    public void displayData() {
        System.out.println("User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}');
    }
}