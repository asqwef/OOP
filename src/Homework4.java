import java.util.Scanner;

class Gcd {
    Scanner sc = new Scanner(System.in);
    int m, n, r;
    
    int getInt() {
        System.out.printf("두 수를 입력하세요: ");
        m = sc.nextInt();
        n = sc.nextInt();
        if (n == 0) { return m; }
        return 0;
    }
    int gcd(int a, int b) {
        if (a > b) {
            r = a % b;
            if (r == 0) { return b; }
            else { return gcd(b, r); }
        }
        else {
            r = b % a;
            if (r == 0) { return a; }
            else { return gcd(a, r); }
        }
    }
    void printGcd() {
        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd(m, n));
    }
    //반복문 스타일
    int loopgcd(int a, int b) {
        while (true) {
            if (a > b) {
                r = a % b;
                if (r == 0) { return b;}
            }
            else {
                r = b % a;
                if ( r == 0 ) { return a; }
            }
        }
    }
            
    void run() {
        getInt();
        printGcd();
    }

}

class Homework4 {
    void main() {
        Gcd test = new Gcd();
    test.run();
    }
}



