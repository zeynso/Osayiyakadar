package exercise;
import java.util.Scanner;
public class Art�kY�l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Y�l Giriniz:");
		int y�l=keyboard.nextInt();
		if(y�l%4==0) {
			System.out.println(y�l+" bir art�k y�ld�r!");
		}else if((y�l%400==0)) {
			System.out.println(y�l+" bir art�k y�ld�r!");
		}else
			System.out.println(y�l+" bir art�k y�l de�ildir!");
	}

}
