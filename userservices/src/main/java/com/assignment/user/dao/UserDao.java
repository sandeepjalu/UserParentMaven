package com.assignment.user.dao;

import com.assignment.user.dto.User;

import java.util.HashMap;
import java.util.Map;

public interface UserDao {

    void create(User user);

    User read(int id);
}
