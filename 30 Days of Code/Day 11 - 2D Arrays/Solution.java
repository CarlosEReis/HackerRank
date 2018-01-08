import java.util.Scanner;
import java.util.function.BinaryOperator;

import com.sun.javafx.fxml.expression.BinaryExpression;

/**
 * 
 * 	@author Carlos Reis
 * 	Github: github.com/CarlosEReis
 * 	HackerRank: hackerrank.com/carlos_er7
 */
 
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(maximumHourglss(arr));
    }
    
    private static int maximumHourglss(int[][] arr){
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                if(sum > max) max = sum;
            }
            sum = 0;
        }
        return max;
    } 
}
