package com.coretechinnovation.cdubon.entities.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@MappedSuperclass
public class BaseEntity {

    @JsonIgnore
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    @Getter
    @Setter
    private LocalDateTime createdAt;

    @JsonIgnore
    @Getter
    @Setter
    @Column(name = "edited_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
