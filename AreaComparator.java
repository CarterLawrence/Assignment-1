package problem3;

import java.util.Comparator;

public class AreaComparator extends Rectangle implements Comparator<String>{
	
	private int area;

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public AreaComparator(String height, String width, int area) {
		super(height, width);
		this.area = area;
	}

	@Override
	public int compare(String height, String width) {
		// TODO Auto-generated method stub
		return height.compareTo(width);
	}
	
}
