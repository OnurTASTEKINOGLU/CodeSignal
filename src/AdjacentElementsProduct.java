final class AdjacentElementsProduct {
    int solution(int[] inputArray) {


        int minValue= Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length - 1; i++) {
            int multiply = inputArray[i] * inputArray[i + 1];
            if (multiply > minValue) {
                minValue = multiply;
            }
        }

        return minValue;
    }
}
