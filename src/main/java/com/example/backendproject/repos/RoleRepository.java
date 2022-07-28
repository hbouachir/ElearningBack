package com.example.backendproject.repos;

import com.example.backendproject.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
		Role findByRole(String role);
}
