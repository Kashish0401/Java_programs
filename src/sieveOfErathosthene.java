import java.util.Arrays;
import java.util.Scanner;

public class sieveOfErathosthene {

    private static boolean[] sieveOfErathoSthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0]= isPrime[1]= false;

        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean isPrime[] = sieveOfErathoSthenes(n);
        for(int i=1; i<=n; i++){
            System.out.println(i + " " + isPrime[i]);
        }
    }
}

//to be used in the questions where we need to find various numbers which are prime.
