package com.ada.blogappnosql.controller;

import com.ada.blogappnosql.dto.ApiResponseDto;
import com.ada.blogappnosql.dto.SignInRequestDto;
import com.ada.blogappnosql.dto.SignUpRequestDto;
import com.ada.blogappnosql.handler.exception.RoleNotFoundException;
import com.ada.blogappnosql.handler.exception.UserAlreadyExistsException;
import com.ada.blogappnosql.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<ApiResponseDto<?>> registerUser(@RequestBody @Valid SignUpRequestDto signUpRequestDto)
            throws UserAlreadyExistsException, RoleNotFoundException {
        return authService.signUpUser(signUpRequestDto);
    }

    @PostMapping("/signin")
    public ResponseEntity<ApiResponseDto<?>> signInUser(@RequestBody SignInRequestDto signInRequestDto){
        return authService.signInUser(signInRequestDto);
    }

}