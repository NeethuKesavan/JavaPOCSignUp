package com.experion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.experion.dto.UserDto;
import com.experion.model.User;
import com.experion.repository.AzureUserRepository;

@Service
public class AzureUserService {

	private final AzureUserRepository repository;

	public AzureUserService(AzureUserRepository repository) {
		this.repository = repository;
	}

	public List<User> findAll() {
		return repository.findAll();
	}

	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

	public User save(User user) {
		return repository.save(user);
	}

	public Optional<User> findByEmailAndUserId(String email, String userId) {
		return repository.findByEmailAndUserId(email, userId);
	}

	public void checkAndSaveUser(UserDto dto) {
		if (!findByEmailAndUserId(dto.getEmail(), dto.getUserId()).isPresent()) {
			User user = new User(dto.getUserId(), dto.getEmail(), dto.getName(), dto.getGivenName(), dto.getJobTitle(),
					dto.getExtensionRole(), dto.getFamilyName(), dto.getCity(), dto.getCountry(), dto.getState(),
					dto.getStreetAddress(), dto.getPostalCode());
			save(user);
		}
	}

}
