package proj250716;

public class IanPower {
	public static int power(int a, int b){
		int p = 1;
		while(b >= 1){
			p *= a;
			--b;
		}
		return p;
	}
}
