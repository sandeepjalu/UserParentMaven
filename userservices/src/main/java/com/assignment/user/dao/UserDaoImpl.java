package com.assignment.user.dao;

import com.assignment.user.dto.User;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    Map<Integer, User> users = new HashMap<>();

    @Override
    public void create(User user) {
        users.put(user.getId(),user);
    }

    @Override
    public User read(int id) {
        if(users.containsKey(id))
            return users.get(id);
        return null;
    }
}
