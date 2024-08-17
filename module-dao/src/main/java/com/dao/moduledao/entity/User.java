package com.dao.moduledao.entity;

import com.common.modulecommon.dto.response.UserResponseDto;
import jakarta.persistence.*;

@Entity
@Table(name = "lego_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public UserResponseDto toResponseDto() {
        return UserResponseDto.builder()
                .id(id)
                .name(name)
                .build();
    }

}
