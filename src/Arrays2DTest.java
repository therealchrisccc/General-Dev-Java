public class Arrays2DTest{
    public static void main(String[] args) {
        myMethod(8);
    }
    public static void myMethod(int n) {
        System.out.print(n + " ");
        if (n == 1) 
            return;
        if (n % 2 == 0) 
            myMethod(n / 2);
        else 
            myMethod(2*n + 2);
    }
}