package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " ID'li Siparişiniz eklendi.");

	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " ID'li Siparişiniz güncellendi.");

	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + " ID'li Siparişiniz silindi.");

	}

}
