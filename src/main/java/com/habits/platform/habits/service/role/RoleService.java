package com.habits.platform.habits.service.role;

import com.habits.platform.habits.dto.role.CreateRoleRequest;
import com.habits.platform.habits.dto.role.RoleResponse;
import com.habits.platform.habits.exception.BusinessException;
import com.habits.platform.habits.exception.IdNotFoundException;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    List<RoleResponse> findAll();

    RoleResponse findById(UUID uuid) throws IdNotFoundException;

    RoleResponse createRole(CreateRoleRequest request);

    RoleResponse updateRole(UUID uuid, CreateRoleRequest request) throws IdNotFoundException;

    void deleteById(UUID uuid) throws IdNotFoundException;
}
