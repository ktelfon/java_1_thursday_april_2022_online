package teacher.lesson_6_arrays_while_loop.lessoncode;

class ContinueExample {

	public static void main(String[] args) {
		//int[][] arr = new int[5][5];

		int[][] arr = {{0, 1, 0},
				{4, 5, 9},
				{7, 8, 0}};
		for(int i = 0; i < arr.length; i++) {
			if (i == 0) {
				continue;
			}
			for(int j = 0; j < arr[i].length; j++) {
				int number = arr[i][j];
				if (j == 1) {
					continue;
				}
				System.out.println("" + i + "," + j + " = " + number);
			}
		}
	}

}
