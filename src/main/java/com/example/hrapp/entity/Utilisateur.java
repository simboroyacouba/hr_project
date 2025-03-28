package com.example.hrapp.entity;


import com.coretechinnovation.cdubon.entities.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@MappedSuperclass
public class Utilisateur  extends BaseEntity {

    @Id
    private String guid = UUID.randomUUID().toString();



    @Column(unique = true, length = 100, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String profilePhoto;

    private Boolean active;


    @Column(name = "last_password_reset_date")
    private LocalDateTime lastPasswordResetDate;

    @ManyToMany()
    @JoinTable(name = "security_users_permissions", joinColumns = @JoinColumn(name = "user_guid"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<Permission> permissions;

    @ManyToMany()
    @JoinTable(name = "security_users_roles", joinColumns = @JoinColumn(name = "user_guid"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
