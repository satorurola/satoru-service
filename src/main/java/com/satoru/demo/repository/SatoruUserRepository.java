package com.satoru.demo.repository;

import com.satoru.demo.entity.SatoruUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SatoruUserRepository extends JpaRepository<SatoruUserEntity, Long> {
}
