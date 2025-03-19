package session3;

import java.util.Arrays;

public class ArraymethodEX {
	public static void main(String[] args) {
		
		
		//Length of an array
		int[] num = {10,20,30,40,50};
		System.out.println("Length of num: "+num.length);
		
		//Copying an Array
		int[] source = {1,2,3,4,5};
		int[] destination = new int[5];
		
		//Copy array
		System.arraycopy(source, 0, destination, 0, source.length);
		
		for(int i : destination) {
			System.out.println(i+" ");
		}
		System.out.println();
			//3.Array sort
			int[] b = {12,8,6,45,2};
			Arrays.sort(b);
			
			System.out.println(b);
			
			//4.Array fill
			int[] d = new int[5];
			Arrays.fill(d, 1);
			Arrays.fill(d,  1,4,2); //index from 1 to 4(n-1)-->index 1,2,3 to fill by 2
			System.out.println(Arrays.toString(d));
		
	}

}
