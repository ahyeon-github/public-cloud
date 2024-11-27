package com.example.publiccloud.Repository;

import com.example.publiccloud.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}