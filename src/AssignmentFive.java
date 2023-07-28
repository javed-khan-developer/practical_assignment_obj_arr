public class AssignmentFive {
    //Write a Java program to print an entire array
    public void printArray(int[]arr){
        for(int element:arr){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        AssignmentFive aFive = new AssignmentFive();
        int [] arr={9,54,6,6,3,322,56};
        aFive.printArray(arr);
    }
}
