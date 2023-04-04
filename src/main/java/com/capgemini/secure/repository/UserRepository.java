package com.capgemini.secure.repository;
import org.springframework.data.repository.CrudRepository;


import com.capgemini.secure.model.User;
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}