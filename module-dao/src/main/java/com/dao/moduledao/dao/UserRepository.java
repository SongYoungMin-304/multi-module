package com.dao.moduledao.dao;

import com.dao.moduledao.entity.User;
import com.dao.moduledao.enums.DaoType;

public interface UserRepository {

    public User findById(Long id);

    public DaoType getDaoType();

}
