package com.eumpa.delivery.member.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "userId")
    private String userId;
    @Column(name = "name")
    private String name;
//    @Column
//    private String password;
    @Column(name = "phoneNumber")
    private String phoneNumber;
//    @Column
//    private LocalDateTime added_dt;
}
