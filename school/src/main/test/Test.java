import com.car.admin.empty.User;
import com.car.admin.services.UserService;
import com.car.admin.services.impl.UserServiceImpl;
import com.car.exception.DBException;

import java.util.List;

public class Test {
	public static void main(String[] args){
		UserService us = new UserServiceImpl();
		try {
			User user  = us.findById("1");
			System.out.println(user.toString());
		} catch (DBException e) {
			e.printStackTrace();
		}
	}
}
