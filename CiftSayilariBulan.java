import java.util.Scanner;
public class CiftSayilariBulan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,toplam=0,b�lme=0,ortalama=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Say�:");
		j = keyboard.nextInt();
		System.out.println(j+"'ye kadar olan 2 ile b�l�nen say�lar");
		for(int i = 1; i<=j; i++) {
			if(i%2==0) {
			System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println(j+"'ye kadar olan 3 ve 4 ile b�l�nen say�lar");
			for(int i = 1; i<=j; i++) {
				if((i%3==0)&&(i%4==0)){
					System.out.print(i+" ");
				}
		}
			System.out.println(j+"'ye kadar olan 3 ve 4 ile b�l�nen say�lar�n ortalamas�");
				for(int i = 1; i<=j; i++) {
					if((i%3==0)&&(i%4==0)){
						System.out.print(i+" ");
						toplam+=i;
						b�lme++;
						ortalama=toplam/b�lme;
				}
					
		}System.out.println("Say�lar�n ortalamas�:"+ortalama);
	}

}
