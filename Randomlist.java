package problem1;
import java.util.Random;
import java.util.*;

public class Randomlist {
	public static int KthLargest(int[] randoms1, int k) {
	    Arrays.sort(randoms1);
	    return randoms1[randoms1.length-k];
	}
	public static int KthLargest2(int[] randoms2, int k) {
	    Arrays.sort(randoms2);
	    return randoms2[randoms2.length-k];
	}
	public static int KthLargest3(int[] randoms3, int k) {
	    Arrays.sort(randoms3);
	    return randoms3[randoms3.length-k];
	}
	public static int KthLargest4(int[] randoms4, int k) {
	    Arrays.sort(randoms4);
	    return randoms4[randoms4.length-k];
	}
	public static void main(String[] args) {
		//do work not to be timed
		int[] randoms1 = new int[10];
		int k = 5;
		Random rand = new Random();
		rand.nextInt();

		//start timer
		long start = System.nanoTime();
		//do work to be timed
		System.out.println(randoms1.length);
		for(int i = 0; i < randoms1.length; i++)
		{
			randoms1[i] = rand.nextInt();
		}
		long end = System.nanoTime();


		//do work not to be timed
		int[] randoms2 = new int[100];
		int k2 = 50;
		Random rand2 = new Random();
		rand2.nextInt();
		//restart timer
		long start2 = System.nanoTime();
		//do work to be timed
		System.out.println(randoms2.length);
		for(int i = 0; i < randoms2.length; i++)
		{
			randoms2[i] = rand2.nextInt();
		}
		long end2 = System.nanoTime();
		
		int[] randoms3 = new int[1000];
		int k3 = 500;
		//restart timer
		long start3 = System.nanoTime();
		//do work to be timed
		System.out.println(randoms3.length);
		for(int i = 0; i < randoms3.length; i++)
		{
			randoms3[i] = rand.nextInt();
		}
		long end3 = System.nanoTime();

		
		int[] randoms4 = new int[10000];
		int k4 = 5000;
		//restart timer
		long start4 = System.nanoTime();
		//do work to be timed
		System.out.println(randoms4.length);
		for(int i = 0; i < randoms4.length; i++)
		{
			randoms4[i] = rand.nextInt();
		}
		long end4 = System.nanoTime();
		System.out.print( "5th largest element is "+ 
                KthLargest(randoms1, k) );
		System.out.println("Runtime for 10:" +
				String.format( "%12.6f",((end-start)/Math.pow(10,9))));
		System.out.print( "50th largest element is "+ 
                KthLargest2(randoms1, k) );
		System.out.println("Runtime for 100:" +
				String.format( "%12.6f",((end2-start2)/Math.pow(10,9))));
		System.out.print( "500th largest element is "+ 
                KthLargest3(randoms1, k) );
		System.out.println("Runtime for 1000:" +
				String.format( "%12.6f",((end3-start3)/Math.pow(10,9))));
		System.out.print( "5000th largest element is "+ 
                KthLargest4(randoms1, k) );
		System.out.println("Runtime for 10000:" +
				String.format( "%12.6f",((end4-start4)/Math.pow(10,9))));

	}

}
