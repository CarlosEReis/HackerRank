/**
 * 
 * 		@author Carlos Reis
 * 		Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
    
        s = s.trim();
        
        if(s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        String trim = s.trim();
        
        String[] words = trim.split("[^A-Za-z]+");
        System.out.println(words.length);
        
        for(String word : words)
        	System.out.println(word);

        
	}
}