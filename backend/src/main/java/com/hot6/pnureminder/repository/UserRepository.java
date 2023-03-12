package com.hot6.pnureminder.repository;

import com.hot6.pnureminder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    //Optional<User> findByGoogleId(String googleId);
}