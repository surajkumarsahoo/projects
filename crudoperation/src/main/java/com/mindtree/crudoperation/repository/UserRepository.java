package com.mindtree.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.crudoperation.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
