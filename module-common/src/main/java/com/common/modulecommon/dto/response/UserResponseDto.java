package com.common.modulecommon.dto.response;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponseDto {

    private Long id;
    private String name;
}
