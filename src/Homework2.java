import java.util.Scanner;
class Student {
    Scanner sc = new Scanner(System.in);
    String temp = "";
    String[] arr = new String[3];
    String major = "";
    String name = "";
    int phone = 0;
    int id = 0;

    void setInfo() {
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        setId();
        setName();
        setMajor();
        setPhone();
    }
    void getInfo() { System.out.printf("%d %s %s %s\n", getId(), getName(), getMajor(), getPhone()); }

    void setId() { id = Integer.parseInt(sc.next()); }
    void setName() { name = sc.next(); }
    void setMajor() { major = sc.next(); }
    void setPhone() { phone = Integer.parseInt(sc.next()); }
    
    String getMajor() { return major;}
    String getName() { return name; }
    String getPhone() {
        temp = "0" + Integer.toString(phone);
        arr[0] = temp.substring(0, 3);
        arr[1] = temp.substring(3, 7);
        arr[2] = temp.substring(7, 11);
        return (arr[0] + "-" + arr[1] + "-" + arr[2]);
    }
    int getId() { return id; }
}

public class Homework2 {
    void main() {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setInfo();
        s2.setInfo();
        s3.setInfo();
        
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("1번째 학생: "); s1.getInfo();
        System.out.printf("2번째 학생: "); s2.getInfo();
        System.out.printf("3번째 학생: "); s3.getInfo();
    }
}
