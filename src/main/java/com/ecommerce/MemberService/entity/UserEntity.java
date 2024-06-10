package com.ecommerce.MemberService.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String loginId;

  private String userName;

  @Builder
  public UserEntity(String loginId, String userName) {
    this.loginId = loginId;
    this.userName = userName;
  }

  @Builder
  public UserEntity(String userName) {
    this.userName = userName;
  }

  public void modifyName(String newUserName) {
    this.userName = newUserName;
  }
}
