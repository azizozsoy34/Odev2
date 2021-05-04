package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager{
      
	
    private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckServices) {
		this.customerCheckService=customerCheckServices;
	}
}
