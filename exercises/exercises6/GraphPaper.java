package exercises6;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphPaper {

	/**
	 * Process one layer of the graph paper
	 * @param llx lower-left-hand corner x coordinate
	 * @param lly lower-left-hand corner y coordinate
	 * @param size length and height of the current square
	 */
	public static void gp(double llx, double lly, double size) {
		// base case
		if (size < .05) {
			return;  // abandon recursion
		}
		// draw one horizontal and one vertical line to quadrisect
		//  the square (divide into 4 portions)
		StdDraw.setPenColor(Color.red);
		StdDraw.line(llx, lly+size/2, llx+size, lly+size/2);//horizontal
		StdDraw.line(llx+size/2, lly, llx+size/2, lly+size);//vertical
		// 
		// Now, after you have drown those two lines,
		// let's pause to accentuate the recursive drama
		//
		//StdDraw.pause(500);
		//
		// Now recursively consider the
		//   lower left, upper left, upper right, lower right
		//   sub-cases
//		gp(llx, lly, size/2);//lower left
//		gp(llx, lly+size/2, size/2);// upper left
//		gp(llx+size/2, lly+size/2, size/2);//upper right
//		gp(llx+size/2, lly, size/2);//lower right

	}

	public static void main(String[] args) {
		// Once you get things working, you can uncomment the two
		//   calls below to StdDraw.show
		//   and that will speed up what you see greatly

		StdDraw.show(10);// don't show anything
		gp(0, 0, 1);
		StdDraw.show(10);// until now
	}

}
