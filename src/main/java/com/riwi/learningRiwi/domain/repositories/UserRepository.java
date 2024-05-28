package com.riwi.learningRiwi.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.learningRiwi.domain.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    
}
