package problem3;

import java.util.Comparator;

public class PerimeterComparator extends Rectangle implements Comparator<String>{
	
	private int perimeter;

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public PerimeterComparator(String height, String width, int perimeter) {
		super(height, width);
		this.perimeter = perimeter;
	}

	@Override
	public int compare(String height, String width) {
		// TODO Auto-generated method stub
		return height.compareTo(width);
	}
	

}
