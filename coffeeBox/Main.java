package coffeeBox;

import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer();//fake 
		customer1.setId(0); 
		customer1.setNationalityId("0123456789");
		customer1.setFirstName("Aziz");
		customer1.setLastName("Baskan");
		customer1.setDateOfBirth(new Date(1980,8,23));

		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.Save(customer1);
		
		BaseCustomerManager starCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starCustomerManager.Save(customer1);
	}

}
