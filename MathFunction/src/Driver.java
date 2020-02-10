
public class Driver {

	public static void main(String[] args) {
		RecursiveMathLib calculator = new RecursiveMathLib();
		int GCD = calculator.gcd(100,20);
		System.out.println("GCD using recursion: " + GCD);
		int ACK = calculator.ack(1, 8); //x has to be less than or equal to 3 and y has to be less than or equal to 12 if we are using integer
		//ack needs too many function calls for integers to be any larger
		System.out.println("ACK using recursion: " + ACK);
		
		int fib = calculator.fib(10);
		System.out.println("FIB using recursion: " + fib);
		
		
		int hanoi = calculator.hanoi(10);
		System.out.println("HANOI using recursion: " + hanoi);
		

	}

}
