package classes;

public class Main {
	//class:ortak opersyonları tutma
	// bellekteki yerler:1stack =den öncesi         2heap =den sonrası
	public static void main(String[] args) {
		CustomerManager  customerManager = new CustomerManager();
		CustomerManager  customerManager2 = new CustomerManager();
		customerManager= customerManager2;
		customerManager.Add();
		customerManager.remove();
		customerManager.Update();
		
		//value:değer
		int sayi1 = 10;
		int sayi2= 20;
		sayi2= sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2= sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		


}

}
