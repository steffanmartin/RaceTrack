import java.util.Scanner;
public class Racetrack {
	
	public static final double SIZE = 0.15; //Please make me a multiple of 0.03!!!
	public static void main(String[] args) {
		printBoard();
		Scanner console = new Scanner(System.in);
		playGame(console);
	}
	
	public static void printBoard() {
		// Light-gray game board
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.filledSquare(0.5,0.5,SIZE+0.15);
		// Line grid
		StdDraw.setPenColor(StdDraw.BLACK);
		double[] init1 = {0.5-(SIZE+0.15),0.5+(SIZE+0.15)};
		double[] init2 = {0.5-(SIZE+0.15),0.5+(SIZE+0.15)};
		for (int i = 0; i <= 10+(2*SIZE/0.03); i++) {
			StdDraw.line(init1[0], init1[1], init1[0]+(2*SIZE+0.3), init1[1]);
			init1[1] -= 0.03;
			StdDraw.line(init2[0], init2[1], init2[0], init2[1]-(2*SIZE+0.3));
			init2[0] += 0.03;
		}
		// White center 
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledSquare(0.5,0.5,SIZE);
		// Borders
		double[] init3 = {0.5-(SIZE+0.15),0.5+(SIZE+0.15)};
		double[] init4 = {0.5-SIZE,0.5+SIZE};
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.005);
		StdDraw.line(init3[0], init3[1], init3[0]+(2*SIZE+0.3), init3[1]);
		StdDraw.line(init3[0], init3[1]-(2*SIZE+0.3), init3[0]+(2*SIZE+0.3), init3[1]-(2*SIZE+0.3));
		StdDraw.line(init3[0], init3[1], init3[0], init3[1]-(2*SIZE+0.3));
		StdDraw.line(init3[0]+(2*SIZE+0.3), init3[1], init3[0]+(2*SIZE+0.3), init3[1]-(2*SIZE+0.3));
		StdDraw.line(init4[0], init4[1], init4[0]+(2*SIZE), init4[1]);
		StdDraw.line(init4[0], init4[1]-(2*SIZE), init4[0]+(2*SIZE), init4[1]-(2*SIZE));
		StdDraw.line(init4[0], init4[1], init4[0], init4[1]-(2*SIZE));
		StdDraw.line(init4[0]+(2*SIZE), init4[1], init4[0]+(2*SIZE), init4[1]-(2*SIZE));
		// Start line
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.line(0.5, 0.5+SIZE, 0.5, 0.5+SIZE+0.15);
		// Start point 
		StdDraw.setPenRadius(0.015);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.point(0.5, 0.5+SIZE+0.09);
	}
	
	public static void playGame(Scanner console) {
		double[] start = {0.5,0.5+SIZE+0.09};
		double[] pos = {0.5,0.5+SIZE+0.09};
		int n = console.nextInt();
		if (n == 9) {
			pos[0] += 0.03; 
			pos[1] += 0.03; 
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[0] += 0.3; 
			start[1] += 0.03;
		} else if (n == 8) { 
			pos[1] += 0.03; 
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[1] += 0.03;
		} else if(n == 7) {
			pos[0] -= 0.03; 
			pos[1] += 0.03; 
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[0] -= 0.3; 
			start[1] += 0.03;
		} else if(n == 4) {
			pos[0] -= 0.03;
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[0] -= 0.3; 
		} else if(n == 1) {
			pos[0] -= 0.03; 
			pos[1] -= 0.03; 
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[0] -= 0.3; 
			start[1] -= 0.03;
		} else if(n == 2) {
			pos[1] -= 0.03; 
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[1] -= 0.03;
		} else if(n == 3) {
			pos[0] += 0.03; 
			pos[1] -= 0.03; 
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[0] += 0.3; 
			start[1] -= 0.03;
		} else if(n == 6) {
			pos[0] += 0.03; 
			StdDraw.line(start[0], start[1], pos[0], pos[1]);
			StdDraw.point(pos[0],pos[1]);
			start[0] += 0.3; 
		} else {
			StdDraw.point(pos[0],pos[1]);
		}
	}

}
