package com.assignment.user.bo;

import com.assignment.user.dao.UserDao;
import com.assignment.user.dao.UserDaoImpl;
import com.assignment.user.dto.User;

public class UserBoImpl implements UserBo{
    private UserDao dao;

    @Override
    public void create(User user) {
        dao.create(user);
    }

    @Override
    public User read(int id) {
        return dao.read(id);
    }

    public void setDao(UserDaoImpl dao) {
        this.dao = dao;
    }

    public UserDao getDao() {
        return dao;
    }
}
