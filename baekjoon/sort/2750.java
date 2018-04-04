import java.util.Arrays;
import java.util.Scanner;

/**
 * 2750번
 * 수 정렬하기
 *
 * https://www.acmicpc.net/problem/2750
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberCnt = sc.nextInt();

        int[] numbers = new int[numberCnt];
        for (int i = 0; i < numberCnt; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
