package Day3;

public class Overloading {
	int sum(int a,int b) {
		return a + b;
	}
	double sum(double a,double b) {
		return a + b;
	}
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		System.out.println("sum (int):" + obj.sum(2,10));
		System.out.println("sum (double):" + obj.sum(2.4,5.5));
	}

}
