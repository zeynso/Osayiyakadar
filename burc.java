package exercise;
import java.util.Scanner;
public class burc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Burcunuzu ��renmek i�in do�ru yerdesiniz!");
		int ay,gun;
		System.out.println("Hangi ay do�dunuz?");
		ay=keyboard.nextInt();
		System.out.println(ay+". ay�n ka��nc� g�n� do�dunuz?:");
		gun=keyboard.nextInt();
		if(ay==1) {
			if(gun<=21) {
				System.out.println("o�lak");
			}else if(gun>=22&&gun<=31) {
				System.out.println("kova");
			}else
				System.out.println("Hatal� g�n giri�i");
		}else if(ay==2) {
			if(gun<=19) {
				System.out.println("kova");
			}else if(gun>=20&&gun<=28) {
				System.out.println("bal�k");
			}else
				System.out.println("Hatal� g�n giri�i");
		
	}else if(ay==3) {
		if(gun<=20) {
			System.out.println("bal�k");
		}else if(gun>=21&&gun<=31) {
			System.out.println("ko�");
		}else
			System.out.println("Hatal� g�n giri�i");
	
}else if(ay==4) {
	if(gun<=20) {
		System.out.println("ko�");
	}else if(gun>=21&&gun<=31) {
		System.out.println("bo�a");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==5) {
	if(gun<=21) {
		System.out.println("bo�a");
	}else if(gun>=22&&gun<=31) {
		System.out.println("ikizler");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==6) {
	if(gun<=22) {
		System.out.println("ikizler");
	}else if(gun>=23&&gun<=31) {
		System.out.println("yenge�");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==7) {
	if(gun<=22) {
		System.out.println("yenge�");
	}else if(gun>=23&&gun<=31) {
		System.out.println("aslan");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==8) {
	if(gun<=22) {
		System.out.println("aslan");
	}else if(gun>=23&&gun<=31) {
		System.out.println("ba�ak");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==9) {
	if(gun<=22) {
		System.out.println("ba�ak");
	}else if(gun>=23&&gun<=31) {
		System.out.println("terazi");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==10) {
	if(gun<=22) {
		System.out.println("terazi");
	}else if(gun>=23&&gun<=31) {
		System.out.println("akrep");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==11) {
	if(gun<=21) {
		System.out.println("akrep");
	}else if(gun>=22&&gun<=31) {
		System.out.println("yay");
	}else
		System.out.println("Hatal� g�n giri�i");

}else if(ay==12) {
	if(gun<=21) {
		System.out.println("yay");
	}else if(gun>=22&&gun<=31) {
		System.out.println("o�lak");
	}else
		System.out.println("Hatal� g�n giri�i");

}

}}
