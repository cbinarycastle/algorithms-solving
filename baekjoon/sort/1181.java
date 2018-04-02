import java.util.*;

/**
 * 1181번
 * 단어 정렬
 *
 * https://www.acmicpc.net/problem/1181
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> wordSet = new TreeSet<>((word1, word2) -> {
            int result = word1.length() - word2.length();
            if (result == 0) {
                result = word1.compareTo(word2);
            }
            return result;
        });

        int wordCnt = sc.nextInt();
        for (int i = 0; i < wordCnt; i++) {
            wordSet.add(sc.next());
        }

        for (String word : wordSet) {
            System.out.println(word);
        }
    }
}
