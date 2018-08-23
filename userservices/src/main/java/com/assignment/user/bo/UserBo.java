package com.assignment.user.bo;

import com.assignment.user.dao.UserDao;
import com.assignment.user.dto.User;

public interface UserBo {

    void create(User user);

    User read(int id);
}
