package com.core.modulecore.service;

import com.dao.moduledao.dao.jpa.UserQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserQueryRepository userRepository;






}
