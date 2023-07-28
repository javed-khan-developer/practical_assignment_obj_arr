public class AssignmentFour {
    // Write a Java program to find the index of a specific element in an integer
    // array
    public int findIndex(int[] arr, int element) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 3, 4 };
        int element = 8;
        AssignmentFour aFour = new AssignmentFour();
        int result = aFour.findIndex(arr, element);
        System.out.println("index of " + element + " is " + result);
    }
}
