import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID ?");
        String id = scanner.next();
        System.out.println("비밀번호 ?");
        String password = scanner.next();
        System.out.println("비번 확인 ?");
        String verifypassword = scanner.next();
        System.out.println("이름 ?");
        String name = scanner.next();
        System.out.println("주민번호 ?");
        String socialsecuritynumber = scanner.next();
        System.out.println("전화번호 ?");
        String phonenumber = scanner.next();
        System.out.println("주소 ?");
        String address = scanner.next();
        System.out.println("직업 ?");
        String job = scanner.next();
        System.out.println("ID : " +id);
        System.out.println("비밀번호 : " +password);
        System.out.println("비번 확인 : " +verifypassword);
        System.out.println("이름 : " +name);
        System.out.println("주민번호 : " +socialsecuritynumber);
        System.out.println("전화번호 : " +phonenumber);
        System.out.println("주소 : " +address);
        System.out.println("직업 : " +job);

    }
}