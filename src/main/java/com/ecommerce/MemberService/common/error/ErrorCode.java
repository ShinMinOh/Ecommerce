package com.ecommerce.MemberService.common.error;

import lombok.Getter;

@Getter
public enum ErrorCode {

  // Auth Error

  Not_Authorized_JWT(403, "A2", "권한 정보가 없는 토큰입니다"),

  // Common
  INVALID_INPUT_VALUE(400, "C1", "올바르지 않은 입력 값입니다"),
  INTERNAL_SERVER_ERROR(500, "C2", "서버 에러");


  private final int status;
  private final String code;
  private final String message;

  ErrorCode(final int status, final String code, final String message) {
    this.status = status;
    this.message = message;
    this.code = code;
  }

}
