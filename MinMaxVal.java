package exercise;
import java.util.Scanner;
public class MinMaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Ka� tane say� girmek istersiniz?:");
int adet=keyboard.nextInt();
int min=0;
int max=0;
for(int i=1;i<=adet;i++) {
	System.out.println(i+". say�y� giriniz: ");
	int x=keyboard.nextInt();
	if(i==1) {
		
		min=x;
		max=x;
	}else {
		if(x>max) {
			max=x;
		}
		if(x<min) {
			min=x;
		}
	}
}
System.out.println("En b�y�k say�: "+max);
System.out.println("En k���k say�: "+min);
	}

}
