package exercise;
import java.util.Scanner;
public class �inZodya�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
System.out.println("�in zodya��n�z� hesaplamak i�in do�um tarihinizi giriniz:");
int dt=keyboard.nextInt();
if(dt%12==0) {
	System.out.println("�in Zodya�� Burcunuz :Maymun");
}else if(dt%12==1) {
	System.out.println("�in Zodya�� Burcunuz :Horoz");
}else if(dt%12==2) {
	System.out.println("�in Zodya�� Burcunuz :K�pek");
}else if(dt%12==3) {
	System.out.println("�in Zodya�� Burcunuz :Domuz");
}else if(dt%12==4) {
	System.out.println("�in Zodya�� Burcunuz :Fare");
}else if(dt%12==5) {
	System.out.println("�in Zodya�� Burcunuz :�k�z");
}else if(dt%12==6) {
	System.out.println("�in Zodya�� Burcunuz :Kaplan");
}else if(dt%12==7) {
	System.out.println("�in Zodya�� Burcunuz :Tav�an");
}else if(dt%12==8) {
	System.out.println("�in Zodya�� Burcunuz :Ejderha");
}else if(dt%12==9) {
	System.out.println("�in Zodya�� Burcunuz :Y�lan");
}else if(dt%12==10) {
	System.out.println("�in Zodya�� Burcunuz :At");
}else if(dt%12==11) {
	System.out.println("�in Zodya�� Burcunuz :Koyun");
}
	}

}
