package exercise;
import java.util.Scanner;
public class PowerWRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Taban de�eri giriniz :");
int taban=keyboard.nextInt();
System.out.println("�s de�erini giriniz :");
int �s=keyboard.nextInt();
System.out.println(�shesap(taban,�s));
	}static int �shesap(int taban,int �s) {
		int sonu�=1;
		if(�s==0) {
			return 1;
		}else {
			return taban*�shesap(taban,�s-1);
		}
	}

}
