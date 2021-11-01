package com.fiserv.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiserv.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}