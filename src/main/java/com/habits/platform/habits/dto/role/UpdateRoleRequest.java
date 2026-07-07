package com.habits.platform.habits.dto.role;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UpdateRoleRequest {
    @NotBlank
    @Size(min = 3, max = 15)
    private String name;

    public UpdateRoleRequest() { }

    public UpdateRoleRequest (Builder builder) {
        this.name = builder.name.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;

        public Builder name (String name) {
            this.name = name;
            return this;
        }

        public UpdateRoleRequest build() {
            return new UpdateRoleRequest(this);
        }
    }
}
