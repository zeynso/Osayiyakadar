import java.util.Scanner;
public class kombinasyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Ka� elemanl� k�me?");
		int n=keyboard.nextInt();
		System.out.println("Ka�l� kombinasyon?");
		int r=keyboard.nextInt();
		int totalOfN=1;
		int totalOfR=1;
		int nr=n-r;
		int totalofNR=1;
		if ( n<r){
            System.out.println("K�menin kombinasyonlar� eleman say�s�ndan fazla olamaz.");
            System.out.println("Tekrar deneyiniz.");
        }
        else {
        	for(int i=1;i<=n;i++) {
        		totalOfN*=i;
   }			for(int i=1;i<=r;i++) {
	   				totalOfR*=i;
   }				for(int i=1;i<=nr;i++) {
	   					totalofNR*=i;
   }int C=totalOfN/(totalOfR*totalofNR);
   System.out.println(C);
  }
 }
}
