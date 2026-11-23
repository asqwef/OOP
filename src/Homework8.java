import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Login {
    Map<String, String> db = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public Login() {
        db.put("myId", "myPass");
        db.put("myId2", "myPass2");
        db.put("myId3", "myPass3");
    }
    public void logIn() {
        while(true) {
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id : ");
            String id = sc.nextLine();
            if(db.containsKey(id.trim())) {
                System.out.print("password : ");
                String ps = sc.nextLine();
                if (db.get(id).equals(ps.trim())) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    return ;
                }
                else {
                    System.out.println("비밀번호가 일치하지 않습니다 다시 입력해주세요.");
                }
            }
            else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
public class Homework8 {
    void main() {
        Login test = new Login();
        test.logIn();
    }
}
