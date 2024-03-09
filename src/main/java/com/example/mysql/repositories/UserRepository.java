package com.example.mysql.repositories;

import com.example.mysql.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <Users,Long> {
}
