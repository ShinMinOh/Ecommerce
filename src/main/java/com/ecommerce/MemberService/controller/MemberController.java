package com.ecommerce.MemberService.controller;

import com.ecommerce.MemberService.dto.ModifyUserDto;
import com.ecommerce.MemberService.dto.RegisterUserDto;
import com.ecommerce.MemberService.entity.UserEntity;
import com.ecommerce.MemberService.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

  private final UserService userService;

  @PostMapping("/member/users/registration")
  public UserEntity registerUser(
      @RequestBody RegisterUserDto registerUserDto){

      return userService.registerUser(registerUserDto.loginId(), registerUserDto.userName());
  }

  @PutMapping("/member/users/{userId}/modify")
  public UserEntity modifyUser(
      @PathVariable Long userId,
      @RequestBody ModifyUserDto modifyUserDto){

    return userService.modifyUser(userId, modifyUserDto.userName());
  }

  @GetMapping("/member/users/{loginId}/login")
  public UserEntity login(
      @PathVariable String loginId){
    return userService.getUser(loginId);
  }

}
