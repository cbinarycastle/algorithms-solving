import java.util.Scanner;

/**
 * 10250번
 * ACM 호텔
 *
 * https://www.acmicpc.net/problem/10250
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loopCnt = sc.nextInt();

        Input[] inputs = new Input[loopCnt];

        for (int i = 0; i < loopCnt; i++) {
            int floorCnt = sc.nextInt();
            int roomCnt = sc.nextInt();
            int order = sc.nextInt();

            inputs[i] = new Input(floorCnt, roomCnt, order);
        }

        for (Input input : inputs) {
            String roomNum = assignRoom(input.floorCnt, input.order);
            System.out.println(roomNum);
        }
    }

    private static String assignRoom(int floorCnt, int order) {
        int floor = order % floorCnt;
        if (floor == 0) {
            floor = floorCnt;
        }

        int num = ((order - 1) / floorCnt) + 1;

        return floor + String.format("%02d", num);
    }

    private static class Input {
        int floorCnt;
        int roomCnt;
        int order;

        Input(int floorCnt, int roomCnt, int order) {
            this.floorCnt = floorCnt;
            this.roomCnt = roomCnt;
            this.order = order;
        }
    }
}
