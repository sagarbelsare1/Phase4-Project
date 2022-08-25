package com.kitchenstoryp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kitchenstoryp.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findAll();
    User save(User user);
}
