package org.dxc.ioc.Junit.Service;

import org.dxc.ioc.Junit.model.User;

public class LoginService {
	public boolean validateUser(User user) {
		if(user.getUsername().equals(user.getPassword()))
				return true;
		return false;
	

	}
}
