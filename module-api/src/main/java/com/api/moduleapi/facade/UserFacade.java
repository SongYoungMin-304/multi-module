package com.api.moduleapi.facade;

import com.common.modulecommon.dto.response.UserResponseDto;
import com.core.modulecore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserFacade {

    private final UserService userService;
    public UserResponseDto findUserByUserId(Long id) {

        // 아이디로 유저를 찾는다.
        return userService.findUserByUserId(id);
    }

}
