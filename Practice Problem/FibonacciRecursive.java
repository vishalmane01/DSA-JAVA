import java.util.Scanner;
public class FibonacciRecursive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series (Recursive): ");
        for(int i=0 ; i<=n ; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
    
}