import java.util.Scanner;

class MM {
    int max, min, n;
    int[] arr = {};
    Scanner sc = new Scanner(System.in);
    void getSize() {
        System.out.printf("몇개의 수를 입력하시겠습니까?: ");
        n = sc.nextInt();
        arr = new int[n];
    }
    void addArr() {
        System.out.printf("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = min = arr[0];
    }
    void compare() {
        for(int i = 0; i < n; i++) {
            if(max < arr[i]) { max = arr[i]; }
            if(min > arr[i]) { min = arr[i]; }
        }
    }
    void show() {
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}

public class Homework3 {
    void main() {
        MM test = new MM();
        test.getSize();
        test.addArr();
        test.compare();
        test.show();
    }
}
