public class LoopQ {
	public static void main(String[] args) {
		for(char c = 'A'; c < 'Z'; c++) {
			for(int i = 0; i < 2; i++) {
				System.out.println("seat "+c+i);
			}
		}
	}
}