package com.thomas_oliver.springbootdockerized.repository;

import com.thomas_oliver.springbootdockerized.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
