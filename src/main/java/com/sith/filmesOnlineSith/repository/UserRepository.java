package com.sith.filmesOnlineSith.repository;

import com.sith.filmesOnlineSith.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {

}

