package com.practice.restapijpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select u from User u where u.id=:id")
    public  User getUserById(int id);


    public List<User> findByCountry(String c);
}
