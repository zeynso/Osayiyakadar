package exercise;
import java.util.Scanner;
public class Calculator {
	
	static int toplama(int a,int b) {
		int sonu�=a+b;
		System.out.println("Toplam="+sonu�);
		return sonu�;
	}
	
	static int ��karma(int a,int b) {
		int sonu�=a-b;
		System.out.println("Toplam="+sonu�);
		return sonu�;
	}
	
	static int �arpma(int a, int b) {
		int sonu�=a*b;
		System.out.println("�arp�m="+sonu�);
		return sonu�;
	}
	
	static int b�lme(int a,int b) {
		if(b==0) {
			System.out.println("B�len say� 0 olamaz");
			return 0;
		}
		int sonu�=a/b;
		System.out.println("B�l�m="+sonu�);
		return sonu�;
	}
	
	static int �s(int a, int b) {
		int sonu�=1;
		for(int i=1;i<=b;i++) {
			sonu�*=a;
		}System.out.println("�s="+sonu�);
		return sonu�;
	}
	
	static int f(int a,int b) {
		int sonu�=1;
		for(int i=1;i<=a;i++) {
			sonu�*=i;
		}System.out.println(a+"! ="+sonu�);
		return sonu�;
		
	}
	
	static int mod(int a,int b) {
		int sonu�=a%b;
		System.out.println(a+"'n�n "+b+"'ile b�l�m�nden kalan:"+sonu�);
		return sonu�;
	}
	
	static void da�(int a,int b) {
		int alan,�evre;
		alan=a*b;
		System.out.println("Alan="+alan);
		�evre=2*a+2*b;
		System.out.println("�evre="+�evre);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int select;
        String menu = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yap";
        while(true) {System.out.println(menu);
        	System.out.println("Bir i�lem se�iniz: ");
        	select=keyboard.nextInt();
        	if(select==0) {
        		System.out.println("Bye!");
        		break;
        	}
        	System.out.println("�lk say�y� giriniz:");
        	int a=keyboard.nextInt();
        	System.out.println("�kinci say�y� giriniz:");
        	int b=keyboard.nextInt();
        	
        	switch(select) {
        	case 1:
        		toplama(a,b);
        		break;
        	case 2:
        		��karma(a,b);
        		break;
        	case 3:
        		�arpma(a,b);
        		break;
        	case 4:
        		b�lme(a,b);
        		break;
        	case 5:
        		�s(a,b);
        		break;
        	case 6:
        		f(a,b);
        		break;
        	case 7:
        		mod(a,b);
        		break;
        	case 8:
        		da�(a,b);
        		break;
        	default:
        		System.out.println("Ge�ersiz i�lem");
        	}
        
	}

} }
