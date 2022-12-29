package com.basic.backend.user.repository;

import com.basic.backend.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserRepository {
    List<User> findAll();
}
