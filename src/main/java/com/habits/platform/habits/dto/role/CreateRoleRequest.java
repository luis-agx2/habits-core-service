package com.habits.platform.habits.dto.role;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateRoleRequest {
    @NotBlank
    @Size(min = 3, max = 15)
    private String name;

    public CreateRoleRequest() { }

    public CreateRoleRequest (Builder builder) {
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

        public CreateRoleRequest build() {
            return new CreateRoleRequest(this);
        }
    }
}
