package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getEmail()+ " Kullanýcý eklendi.");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail()+ " Kullanýcý güncellendi.");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail()+ " Kullanýcý silindi.");

	}

}
