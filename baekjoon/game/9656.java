import java.util.Scanner;

/**
 * 9656번
 * 돌 게임 2
 *
 * https://www.acmicpc.net/problem/9656
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stoneCnt = sc.nextInt();
        
        if (stoneCnt % 2 == 0) {
        	System.out.println("SK");
        } else {
        	System.out.println("CY");
        }
    }
}
