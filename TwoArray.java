package chapter06;

public class TwoArray {

	public static void main(String[] args) {
		// 2차배열
		int[][] m = {{1,2},{3,4},{5,6}}; // 3행 2열

		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("m["+i+"]["+j+"]="+m[i][j]);
			}
		}

		// 2차배열2
		int[][] n = {{1,2,3},{4,5,6}}; // 2행 3열

		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[0].length; j++) {
				System.out.println("n["+i+"]["+j+"]="+n[i][j]);
			}
		}
	}

}
