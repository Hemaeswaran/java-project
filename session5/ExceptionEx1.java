package session5;

public class ExceptionEx1 {
	
	String str1 = "hello";
	
	public void name() {
		try {
			int i = Integer.parseInt(str1);
			System.out.println("The value of converted string: "+str1);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExceptionEx1 ee = new ExceptionEx1();
		ee.name();
	}

}
