public class AssignmentOne {
    //1. Write a program to demonstrate method overloading with 3 different parameters.
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }
    public double add(double n1, int n2, int n3) {
        double result = n1 + n2 + n3;
        return result;
    }

    public static void main(String[] args) throws Exception {
        AssignmentOne aOne = new AssignmentOne();
       int result= aOne.add(5, 5);
        System.out.println(result);
      int result2=  aOne.add(5, 5, 5);
      System.out.println(result2);
      double result3=  aOne.add(5.5, 5, 5);
      System.out.println(result3);
    }
}
