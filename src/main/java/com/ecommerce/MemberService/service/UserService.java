package com.ecommerce.MemberService.service;

import com.ecommerce.MemberService.entity.UserEntity;
import com.ecommerce.MemberService.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public UserEntity registerUser(String loginId, String userName){  // 유저 생성
    UserEntity user = UserEntity.builder()
        .loginId(loginId)
        .userName(userName)
        .build();

    return userRepository.save(user);
  }

  public UserEntity modifyUser(Long userId, String userName){ // 유저의 userName 변경
    UserEntity user = userRepository.findById(userId).orElseThrow();

    user.modifyName(userName);

    return userRepository.save(user);
  }

  public UserEntity getUser(String loginId){  // LoginId로 userName 조회
    return userRepository.findByLoginId(loginId).orElseThrow();
  }



}
