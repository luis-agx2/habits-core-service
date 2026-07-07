package com.habits.platform.habits.mapper.role;

import com.habits.platform.habits.dto.role.CreateRoleRequest;
import com.habits.platform.habits.dto.role.RoleResponse;
import com.habits.platform.habits.dto.role.UpdateRoleRequest;
import com.habits.platform.habits.entity.role.RoleEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class RoleMapper {
    public static List<RoleResponse> toRoleResponseList(List<RoleEntity> roleEntities) {
        return roleEntities.stream()
                .map(roleEntity -> RoleResponse.builder()
                    .uuid(roleEntity.getUuid())
                    .name(roleEntity.getName())
                    .build())
                .toList();
    }

    public static RoleResponse toRoleResponse(RoleEntity roleEntity) {
        return new RoleResponse.Builder()
                .uuid(roleEntity.getUuid())
                .name(roleEntity.getName())
                .build();
    }

    public static RoleEntity toEntity(CreateRoleRequest createRoleRequest) {
        return RoleEntity.builder()
                .name(createRoleRequest.getName())
                .build();
    }

    public static RoleEntity toEntity(UpdateRoleRequest updateRoleRequest, RoleEntity roleEntity) {
        return RoleEntity.builder()
                .name(updateValueIfExists(roleEntity::getName, updateRoleRequest::getName))
                .build();
    }

    private static <T> T updateValueIfExists(Supplier<T> value, Supplier<T> newValue) {
        return Optional.ofNullable(newValue.get())
                .orElse(value.get());
    }
}
