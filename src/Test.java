import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入用户名：");

        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        System.out.println("你输入的用户名是："+username);

        System.out.println("请输入密码：");
        String password=sc.next();
        System.out.println("你输入的密码是：" + password);

    }
}