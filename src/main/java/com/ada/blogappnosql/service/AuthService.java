package com.ada.blogappnosql.service;

import com.ada.blogappnosql.dto.ApiResponseDto;
import com.ada.blogappnosql.dto.SignInRequestDto;
import com.ada.blogappnosql.dto.SignUpRequestDto;
import com.ada.blogappnosql.handler.exception.RoleNotFoundException;
import com.ada.blogappnosql.handler.exception.UserAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> signUpUser(SignUpRequestDto signUpRequestDto) throws UserAlreadyExistsException, RoleNotFoundException;
    ResponseEntity<ApiResponseDto<?>> signInUser(SignInRequestDto signInRequestDto);
}
