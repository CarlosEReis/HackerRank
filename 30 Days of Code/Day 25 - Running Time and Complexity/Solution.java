
/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++){
            int n = in.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        in.close();
    }
    
    public static boolean isPrime(int n){
        if(n < 2) return false;
        
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
