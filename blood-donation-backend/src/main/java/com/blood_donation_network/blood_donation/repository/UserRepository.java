package com.blood_donation_network.blood_donation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blood_donation_network.blood_donation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}