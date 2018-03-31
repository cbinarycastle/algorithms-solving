import java.util.Scanner;

/**
 * 1157번
 * 단어 공부
 *
 * https://www.acmicpc.net/problem/1157
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char mostUsedLetter = getMostUsedLetter(word);

        System.out.println(mostUsedLetter);
    }

    private static char getMostUsedLetter(String word) {
        word = word.toUpperCase();

        int[] usedCnts = new int[36];

        char[] letters = word.toCharArray();
        for (char letter : letters) {
            usedCnts[((int) letter) - 65]++;
        }

        int mostUsedCnt = 0;
        char mostUsedLetter = '\0';

        for (int i = 0; i < usedCnts.length; i++) {
            int usedCnt = usedCnts[i];

            if (usedCnt != 0 && usedCnt == mostUsedCnt) {
                mostUsedLetter = '?';
            } else if (usedCnt > mostUsedCnt) {
                mostUsedCnt = usedCnt;
                mostUsedLetter = (char) (i + 65);
            }
        }

        return mostUsedLetter;
    }
}
