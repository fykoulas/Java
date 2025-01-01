package gr.aueb.cf.Project02;

public class MaximumSubarray {
    public static class Result {
        int maxSum;
        int start;
        int end;

        public Result(int maxSum, int start, int end) {
            this.maxSum = maxSum;
            this.start = start;
            this.end = end;
        }
    }

    public static Result findMaxSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return new Result(maxSum, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Result result = findMaxSubarray(arr);

        System.out.println("Maximum Sum: " + result.maxSum);
        System.out.println("Start Index: " + result.start);
        System.out.println("End Index: " + result.end);

        System.out.print("Subarray: {");
        for (int i = result.start; i <= result.end; i++) {
            System.out.print(arr[i]);
            if (i < result.end) System.out.print(", ");
        }
        System.out.println("}");
    }
}