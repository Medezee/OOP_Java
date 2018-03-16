public class MatrixPrint {
	
	public static void main(String argc[]) {
		int size = 5;
		int element = 0;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				element += 1;
				if (i == j || i+j == size - 1) {
					System.out.format("%2s ", '*');
				}
				else{
					System.out.format("%2d ", element);
				}
			}
			System.out.println();
		}
	}
}