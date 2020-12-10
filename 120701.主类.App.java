package pac;

public class App {

	public static void main(String[] args) {
		int [][]array2d={
				{1,2,3,4,5,6},
				{7,8,9,10,0,12},
				{7,8,9,10,11,12},
				{7,8,9,10,11,12},
				{88,66,22,44,33,77}
		};
		new Find().findZero(array2d);
		new Find().findLeft(array2d);
		new Find().findRight(array2d);
		new Find().findUp(array2d);
		new Find().findDown(array2d);
	}
}
v
