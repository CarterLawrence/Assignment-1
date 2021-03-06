package problem2;
import java.util.*;
import java.util.Scanner;
public class Recursion {
	public static int numOnes(int N, int C){
		if(N == 0){
			return 0;
		}else if(N == 1){
			C++;
			return 1;
		}else{
			return numOnes(N/2, C)+ numOnes(N%2, C);
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N = scan.nextInt();
		System.out.println(numOnes(N, N));
		}
}
