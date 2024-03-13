package com.crudappliction.crudbackend.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crudappliction.crudbackend.model.User;

public interface UserDao extends JpaRepository<User, Long> {

}

//jpa repo - interface