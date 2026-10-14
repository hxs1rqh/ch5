import java.util.Scanner; 

public class Fermat { 

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		
		System.out.print("Enter a:"); 
		int a = in.nextInt(); 
		System.out.print("Enter b: ");
		int b = in.nextInt(); 
		System.out.print("Enter c: "); 
		int c = in.nextInt(); 
		System.out.print("Enter n: "); 
		int n = in.nextInt(); 
		
		if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
			System.out.println("Holy smokes, Fermat was wrong!"); 
		}else{
			System.out.println("No, that doesnt work.");
			
		}
	}
}
