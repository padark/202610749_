import java.util.Scanner;

class Homework1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("정수를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sum = (sum + num);
            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
        }
    }
}