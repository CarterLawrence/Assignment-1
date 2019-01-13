package problem3;

import java.util.Comparator;

public class Comparison{
	public static <AnyType> AnyType findMax(AnyType[] arr, Comparator<? super AnyType> cmp)
	{
		int maxIndex = 0;

		for(int i = 1; i < arr.length; i++)
		{
			if(cmp.compare(arr[i], arr[maxIndex]) > 0)
			{
				maxIndex = i;
			}
		}

		return arr[maxIndex];
	}
	/*END:DO NOT MODIFY*/
	public static void main(String[] args)
	{
		String[] arr = new String[]{"H: 1, W: 100", "H: 25, W: 50", "H: 2, W: 50", "H: 10, W: 20", "H: 100, W: 1"};
		System.out.println(findMax(arr, new CaseInsensitiveCompare()));
	}

	/*Comparator Example*/
	private static class CaseInsensitiveCompare implements Comparator<String>
	{
		public int compare(String height, String width)
		{
			return height.compareToIgnoreCase(width);
		}
	}

}

