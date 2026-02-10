package com.satoru.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "satoru_user")
public class SatoruUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String firstName;
    private String lastName;
    private String phone;
}
