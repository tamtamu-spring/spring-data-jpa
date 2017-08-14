package com.banun.dao;

import org.springframework.data.repository.CrudRepository;

import com.banun.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
