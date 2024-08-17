package com.core.modulecore.service;

import com.common.modulecommon.dto.response.UserResponseDto;
import com.dao.moduledao.dao.UserDao;
import com.dao.moduledao.dao.UserRepository;
import com.dao.moduledao.dao.jpa.UserQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    public UserResponseDto findUserByUserId(Long id) {
        return userDao.findUserByUserId(id);
    }



}
