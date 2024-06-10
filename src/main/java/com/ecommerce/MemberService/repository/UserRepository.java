package com.ecommerce.MemberService.repository;

import com.ecommerce.MemberService.entity.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

  Optional<UserEntity> findByLoginId(String loginId);
}
