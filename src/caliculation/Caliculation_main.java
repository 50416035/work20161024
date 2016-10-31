package caliculation;

import java.util.Scanner;

public class Caliculation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number n > ");
		int n =Integer.parseInt(scan.next());
		
		System.out.print("Input number m> ");
		int m =Integer.parseInt(scan.next());
		
		Caliculation_lib clib= new Caliculation_lib(m,n);
		System.out.println("m + n="+clib.getPlus());
		System.out.println("m - n ="+clib.getMinus());
		System.out.println("m * n ="+clib.getProduct());
		System.out.println("m / n ="+clib.getDivide());
		System.out.println("m % n ="+clib.getMod());
	}
}
