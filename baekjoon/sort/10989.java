import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 10989번
 * 수 정렬하기 3
 *
 * https://www.acmicpc.net/problem/10989
 */
class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        int numberCnt = Integer.parseInt(reader.readLine());
        
        int[] numbers = new int[numberCnt];
        int max = 0;
        
        for (int i = 0; i < numberCnt; i++) {
        	int number = Integer.parseInt(reader.readLine());
        	numbers[i] = number;
        	if (number > max) {
        		max = number;
        	}
        }
        reader.close();
        
        countingSort(numbers, max);
    	
        for (int number : numbers) {
        	writer.write(String.valueOf(number));
        	writer.newLine();
        }
        writer.close();
    }
    
    private static void countingSort(int[] numbers, int max) {
    	int[] countArr = new int[max + 1];
    	
    	for (int number : numbers) {
    		countArr[number]++;
    	}
    	
    	int index = 0;
    	for (int number = 0; number < countArr.length; number++) {
    		for (int count = countArr[number]; count > 0; count--) {
    			numbers[index++] = number;
    		}
    	}
    }
}
