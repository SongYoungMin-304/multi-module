package com.dao.moduledao.dao;

import com.common.modulecommon.dto.response.UserResponseDto;
import com.dao.moduledao.dao.jpa.UserQueryRepository;
import com.dao.moduledao.enums.DaoType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserDao {
    private final List<UserRepository> userRepository;

    public UserRepository getRepository() {
        return userRepository.stream()
                .filter(userRepository -> userRepository.getDaoType().equals(DaoType.JPA))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당하는 Repository가 없습니다."));
    }

    public UserResponseDto findUserByUserId(Long id) {
        return getRepository().findById(id).toResponseDto();
    }

}
