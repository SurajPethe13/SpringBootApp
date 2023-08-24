package com.velocity.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
