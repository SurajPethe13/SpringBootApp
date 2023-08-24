package com.velocity.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.velocity.model.User;
import com.velocity.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {

		return (List<User>) userRepository.findAll();
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(Integer id, User user) {

		Optional<User> userdataid = userRepository.findById(id);

		if(userdataid.isPresent()) {
			User user2 = userdataid.get();
			
			user2.setUsername(user.getUsername());
			user2.setAddress(user.getAddress());
			user2.setMobileno(user.getMobileno());

			userRepository.save(user2);
		}
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);

	}

}
