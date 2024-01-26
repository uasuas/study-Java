public class Main {
    public static void main(String[] args) {
        int targetValue = 444444444;
        int closestCube = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i < 444444444; i++) {
            int result = (int) Math.pow(i, 3);
            int difference = Math.abs(targetValue - result);

            if (difference < minDifference) {
                minDifference = difference;
                closestCube = i;
            }
        }

        System.out.println("指定された値 " + targetValue + " に最も近い整数の三乗: " + closestCube);
    }
}