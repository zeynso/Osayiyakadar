import java.util.Scanner;
public class TekSay�lar�nToplam� {
	//�dev Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan program� yaz�yoruz.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int sayi;
int toplam=0;
Scanner keyboard= new Scanner(System.in);
do {
System.out.println("Say� giriniz:");
sayi=keyboard.nextInt();
if((sayi%2==0)&&(sayi%4==0)) {
	toplam+=sayi;
	
}}while(sayi%2==0);
System.out.println("toplam="+toplam);
	
	}
}