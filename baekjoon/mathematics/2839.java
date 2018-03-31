import java.util.Scanner;

/**
 * 2839번
 * 설탕 배달
 *
 * https://www.acmicpc.net/problem/2839
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        int bagCnt = calcBagCount(weight);

        System.out.println(bagCnt);
    }

    private static int calcBagCount(int weight) {
        int minBagCnt = -1;

        for (int i = weight; i >= 0; i -= 3) {
            if (i % 5 == 0) {
                int bagCnt = ((weight - i) / 3) + (i / 5);
                if (minBagCnt == -1 || bagCnt < minBagCnt) {
                    minBagCnt = bagCnt;
                }
            }
        }

        return minBagCnt;
    }
}
