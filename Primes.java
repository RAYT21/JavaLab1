import java.util.Scanner;

public class Primes{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        for (int i=2; i<n;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int n){
        for (int i = 2; i<n;i++)
            if (n%2==0)
                return false;
        return  true;
    }
}



