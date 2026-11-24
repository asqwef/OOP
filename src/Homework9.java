import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

class login {
    Map<String, String> db = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public login() {
        try (Scanner f = new Scanner( new File("db.txt"))) {
            String key, data;
            key = f.nextLine();
            data = f.nextLine();
            do {
                db.put(key, data);
                key = f.nextLine();
                data = f.nextLine();
            } while(key != null);
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch (NoSuchElementException e) {
            System.out.println("파일 읽기 종료");
        }
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
public class Homework9 {
    void main() {
        login test = new login();
        test.logIn();
    }
}
