package Sorting;

public class Point implements Comparable<Point>{

	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point p) {
		// TODO Auto-generated method stub
		return this.y - p.y;
	}
	

}
