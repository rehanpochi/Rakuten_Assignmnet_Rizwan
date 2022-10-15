package com.example.login.services;
import com.example.login.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	

	public List<User> list;
	
	public UserService() {
		list=new ArrayList<>();
		list.add(new User(1,"rehan"));
		list.add(new User(2,"rizwan"));
		list.add(new User(3,"imran"));
		System.out.println(list);
	}
	 
	public List<User> getUser() {
	   // TODO Auto-generated method stub
		return list;
	}
	
	public boolean checkUser(User user) {
		if (list.contains(user)) {
			return true;	
		}
		return false; 
	}
	
	public User addUser(User user) {
		list.add(user); 
		 return user;
	}
	
	public User removeUser(User user) {
		list.remove(user); 
		 return user;
	}
	
	public void deleteUser(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}

}
