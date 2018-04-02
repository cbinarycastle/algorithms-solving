import java.util.Scanner;

/**
 * 11654번
 * 아스키 코드
 *
 * https://www.acmicpc.net/problem/11654
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letter = sc.next();
        System.out.println((int) letter.charAt(0));
    }
}
