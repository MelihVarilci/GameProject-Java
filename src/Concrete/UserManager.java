package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getEmail()+ " Kullan�c� eklendi.");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail()+ " Kullan�c� g�ncellendi.");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail()+ " Kullan�c� silindi.");

	}

}
