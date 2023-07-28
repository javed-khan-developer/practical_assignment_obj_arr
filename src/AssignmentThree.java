public class AssignmentThree {
    // Write a Java program to calculate the sum of all elements in an integer array
    public int findSum(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        AssignmentThree aThree = new AssignmentThree();
        int result = aThree.findSum(arr);
        System.out.println("sum of all elements: " + result);

    }
}
