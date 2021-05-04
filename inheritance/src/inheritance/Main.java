package inheritance;

public class Main {

	public static void main(String[] args) {
		// inheritance:miras
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "999999";
		
		//CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(engin);
		//customerManager.add(abc);
		
		Customer[] customer = {engin,abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		
	}

}
