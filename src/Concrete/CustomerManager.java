package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " Müþteri eklendi.");
		} else {
			System.out.println(customer.getNationalityId() + " ID'li Müþteri eklenemedi.");
		}
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " Müþteri güncellendi.");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " Müþteri silindi.");

	}

}
