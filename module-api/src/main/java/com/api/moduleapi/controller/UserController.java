package com.api.moduleapi.controller;

import com.api.moduleapi.facade.UserFacade;
import com.common.modulecommon.dto.response.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserFacade userFacade;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponseDto> findUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userFacade.findUserByUserId(id));
    }

}
