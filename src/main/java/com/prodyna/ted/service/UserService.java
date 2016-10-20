/**
 * 
 */
package com.prodyna.ted.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodyna.ted.entity.User;
import com.prodyna.ted.repository.UserRepository;

/**
 * @author Iryna Feuerstein, PRODYNA AG
 *
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<String> getAllUserNames() {
		List<String> allUserNames = new ArrayList<>();
		for (User user : userRepository.findAll()) {
			allUserNames.add(user.getName());
		}
		return allUserNames;
		
	}
	
	public User saveUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

}
