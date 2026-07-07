package com.habits.platform.habits.entity.role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "roles")
public class RoleEntity {
    @Id
    private UUID uuid;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public RoleEntity() { }

    public RoleEntity(Builder builder){
        this.uuid = builder.uuid;
        this.name = builder.name;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private UUID uuid;
        private String name;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder uuid (UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public RoleEntity build() {
            return new RoleEntity(this);
        }
    }
}
