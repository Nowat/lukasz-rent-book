package com.sda.lukaszrentbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "log_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false, unique = true)
    private String password;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

}
