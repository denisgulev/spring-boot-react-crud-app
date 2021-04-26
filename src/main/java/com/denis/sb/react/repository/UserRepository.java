package com.denis.sb.react.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denis.sb.react.entity.CustomUser;

public interface UserRepository extends JpaRepository<CustomUser, Long> {

	Optional<CustomUser> findByUsername(String username);

}
