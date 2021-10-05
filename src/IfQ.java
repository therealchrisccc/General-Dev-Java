public class IfQ {
	public static void main(String[] args) {
		int i = 10, j = 5, k = 3;
		if(i < j || k < i)
			System.out.println("one");
			if(j >= k) {
				System.out.println("two");
			} else {
				System.out.println("three");
			}
		System.out.println("four");
		if(k < i) {
			System.out.println("five");
		}
		if(i == 2 || k > 2); 
                     System.out.println("six");
		System.out.println("seven");
		System.out.println("eight");
	}
}