package exercise;
import java.util.Scanner;
public class �sl�Say� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
System.out.println("Hangi say�n�n �ss�n� almak istersiniz?");
int number=keyboard.nextInt();
System.out.println(number+" say�s�n�n ka��n�c� kuvveti al�ns�n?");
int power=keyboard.nextInt();
int result=1;
for(int i=1; i<=power; i++) {
	result*=number;
}System.out.println(number+" to the power of "+power+" is "+result);
	}

}
