import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName, password;
		int right=3;
		int balance=1500;
		Scanner keyboard=new Scanner(System.in);
		int select;
		while(right>0) {
			System.out.println("Kullan�c� ad�n�z: ");
			userName=keyboard.nextLine();
			System.out.println("Parolan�z: ");
			password=keyboard.nextLine();
			if(userName.equalsIgnoreCase("patika")&&(password.equals("java101"))) {
				System.out.println("Ba�ar� ile giri� yap�ld�...");
				System.out.println("Banka hesab�n�za ho� geldiniz!");
				do {
					System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz:\n1-Para yat�rma\n2-Para �ekme\n3-Bakiye Sorgula\n4-��k�� yap");
					select=keyboard.nextInt();
					switch(select) {
					case 1:
						System.out.println("Yat�rmak istedi�iniz para miktar�:");
						int increaseMoney;
						increaseMoney=keyboard.nextInt();
					balance+=increaseMoney;
					System.out.println(increaseMoney+"tl yat�rd�n�z. G�ncel bakiyeniz:"+balance);
					break;
					
					case 2:
						System.out.println("�ekmek istedi�iniz para miktar�:");
						int decreaseMoney;
						decreaseMoney=keyboard.nextInt();
							if(decreaseMoney>balance) {
								System.out.println("Bakiye yetersiz. Maksimum �ekebilece�iniz tutar:"+balance);
							}
							else {
								
							
					balance-=decreaseMoney;
					System.out.println(decreaseMoney+"tl �ektiniz. G�ncel bakiyeniz:"+balance);}
					break;
					
					case 3:
					System.out.println("G�ncel bakiyeniz:"+balance);
					
						break;
						
					case 4:
						System.out.println("G�r��mek �zere "+ userName);
						break;
						default:
							System.out.println("Yanl�� tu�lama yapt�n�z.");
					}
				}while(select!=4);
				break;
			}
			else {
				right--;
				if(right==0) {
					System.out.println("Hesab�n�z bloke olmu�tur. Banka ile ileti�ime ge�iniz.");}
				else {
				
				System.out.println("Hatal� kullan�c� ad� veya �ifre girdiniz. Tekrar deneyiniz. Kalan hakk�n�z: "+ right);
				
				}
			}
		}
	}

}
