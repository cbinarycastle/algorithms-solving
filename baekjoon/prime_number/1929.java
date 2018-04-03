import java.util.Scanner;
import java.util.TreeSet;

/**
 * 1929번
 * 소수 구하기
 *
 * https://www.acmicpc.net/problem/1929
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        TreeSet<Integer> compositeNumberSet = new TreeSet<>();

        if (min == 1) {
            compositeNumberSet.add(1);
        }

        for (int i = 2; i <= max / 2; i++) {
            for (int j = 2; i * j <= max; j++) {
                int multiple = i * j;
                if (multiple >= min) {
                    compositeNumberSet.add(multiple);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            if (compositeNumberSet.isEmpty() || i != compositeNumberSet.first()) {
                System.out.println(i);
            } else {
                compositeNumberSet.remove(i);
            }
        }
    }
}
