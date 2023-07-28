public class AssignmentTwo {
    /*
     * Write a program to create an object of an class which contain a method
     * and call that class method in main method.
     */
    public void show() {
        System.out.println("method called");
    }

    public static void main(String[] args) {
        AssignmentTwo aTwo = new AssignmentTwo();
        aTwo.show();
    }
}
