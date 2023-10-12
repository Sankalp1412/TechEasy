package com.techEasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techEasy.entity.Users;
import com.techEasy.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	@Autowired
	UserRepository repo; 

	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "student added successfully!";
	}

	@Override
	public boolean checkEmail(String email) {
		return repo.existsByEmail(email);
	}

	@Override
	public boolean validPassword(String email, String password) {
		if(repo.existsByEmail(email))
		{
			Users u = repo.getByEmail(email);
			String db_Passwprd = u.getPassword();
			if(password.equals(db_Passwprd))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean checkRole(String email) {
		Users r = repo.getByEmail(email);
		String db_Role = r.getRole();
		if(db_Role.equals("trainer"))
		{
			return true;
		}
		else
			return false;
	}

}
