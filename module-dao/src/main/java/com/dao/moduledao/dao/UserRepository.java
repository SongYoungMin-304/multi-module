package com.dao.moduledao.dao;

import com.dao.moduledao.entity.User;

public interface UserRepository {

    public User findById(Long id);

}
