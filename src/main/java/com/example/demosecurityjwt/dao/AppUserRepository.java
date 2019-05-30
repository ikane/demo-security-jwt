package com.example.demosecurityjwt.dao;

import com.example.demosecurityjwt.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findOneByUsername();
}
