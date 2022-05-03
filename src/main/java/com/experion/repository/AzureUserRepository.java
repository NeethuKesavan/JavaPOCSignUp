package com.experion.repository;

import java.util.Optional;

import com.experion.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AzureUserRepository extends JpaRepository<User, Long> {
	
	@Query("select d from User d where d.email = ?1 and d.userId = ?2")
	Optional<User> findByEmailAndUserId(String email, String userId);

}
