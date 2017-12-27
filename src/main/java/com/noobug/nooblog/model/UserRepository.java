package com.noobug.nooblog.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>
{
	public List<User> findByPhoneNotNull();
}
