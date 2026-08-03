package com.blood_donation_network.blood_donation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blood_donation_network.blood_donation.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}