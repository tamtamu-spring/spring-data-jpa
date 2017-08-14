package com.banun.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Anas Banun on 10/20/16.
 */
public class Authority implements GrantedAuthority{

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
