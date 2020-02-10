
public class RecursiveMathLib extends MathLib{
	
	
	public int gcd(int x, int y)
    {
        if (y != 0)
            return gcd(y, x % y);
        else
            return x;
    }
	
	
	public int ack(int x, int y) {
		if (x==0){
			return y+1;
		}
		if(y==0) {
			return ack(x-1,1);
		}else {
			return ack(x-1, ack(x, y-1) );

		}
	};
	
	
	public int fib(int x) {
		if(x==0) {
			return 0;
		}
		if(x==1) {
			return 1;
		}
		else {
			return fib(x-1)+fib(x-2);
		}
	};
		
	
	
	public int hanoi(int n) {
		if(n>1) {
			return 2*hanoi(n-1)+1;
		}
		else {
			return 1;
		}
	};
}
