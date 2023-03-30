package studio7;

public class die {

	
	private int sides;
	
	public die(int n) {
		sides=n;
	}
	
	public static int[] range(int n) {
		int[]r= new int[n];
		for(int i=1; i<= n;i++) {
			r[i]=i;
		}
		return r;
	}
	
	
	public static void main(String[] args) {
		die die1=new die(8);
		int m= (int)Math.round(Math.random()*die1.sides)+1;
		System.out.println(m);
		

	}

}
