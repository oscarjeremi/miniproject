package com.enigmacamp.project.service;

import com.enigmacamp.project.constant.ERole;
import com.enigmacamp.project.entity.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Role getOrSave(ERole role);
}
