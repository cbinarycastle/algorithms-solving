import java.util.Scanner;

/**
 * 1152번
 * 단어의 개수
 *
 * https://www.acmicpc.net/problem/1152
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int wordsCnt = countWords(input);

        System.out.println(wordsCnt);
    }

    private static int countWords(String input) {
        String[] words = input.split(" ");

        int wordsCnt = words.length;
        if (wordsCnt > 0) {
            if (words[0].equals("")) wordsCnt--;
            if (words[words.length - 1].equals("")) wordsCnt--;
        }

        return wordsCnt;
    }
}
