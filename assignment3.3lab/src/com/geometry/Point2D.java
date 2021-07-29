package com.geometry;

public class Point2D {
	 private int x;
	    private int y;
	    
	    public Point2D(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	  
	    public String getDetails() {
	        return "x and y co-ordinates are: (" + x + "," + y + ")";
	    }

//simple methos
//	    public boolean isEqual(Point2D otherpoint) {
//	        return ((this.x == otherpoint.x) && (this.y == otherpoint.y));
//	    }
	    
	    //advance method-- using instanceof
	    public boolean isEqual(Object otherpoint) {
	    	if(otherpoint instanceof Point2D)
	    		return ((x== ((Point2D)otherpoint).x) && (y== ((Point2D)otherpoint).y));
	    	return false;
	    }

	  
	    public Point2D createNewPoint(int newx, int newy) {
	        System.out.println("New point :");
	        return new Point2D(newx+x,newy+y);

	    }
	  
	    public double calculateDistance(int x1, int y1) {
	        System.out.println("distance between current point & specified point is:");
	        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2)*1.0);
	    }

}
