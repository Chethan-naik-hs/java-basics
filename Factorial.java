public class Factorial{
    static int factorial(int n){
        if(n<=1)
            return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        int result;
        result = factorial(10);
        System.out.println("Factorial of 5 is: " +result);
    }
}