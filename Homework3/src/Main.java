import Abstract.BaseCustomerManager;
import Concretes.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = (BaseCustomerManager) new NeroCustomerManager();
		
		 customerManager.save( new Customer(10,"Sefkan","Başçi",1988,"26597322400"));
		 
		
		  System.out.println(customerManager);
		 
		 

	}

	
	
}


