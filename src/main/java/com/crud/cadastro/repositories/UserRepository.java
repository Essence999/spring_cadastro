package com.crud.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.cadastro.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

}
