package com.habits.platform.habits.dto.role;

import java.util.UUID;

public class RoleResponse {
    private UUID uuid;

    private String name;

    public RoleResponse() { }

    public RoleResponse(Builder builder) {
        this.uuid = builder.uuid;
        this.name = builder.name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private UUID uuid;
        private String name;

        public Builder uuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public RoleResponse build() {
            return new RoleResponse(this);
        }
    }
}
