package com.github.zzfluke.security.model;

import javax.persistence.Entity;

@Entity
public class SystemPermission extends Permission {

    public SystemPermission(SystemDomain domain, Action action) {
        super(domain.name(), action);
    }

    public enum SystemDomain {
        OWNER,
        ROLE,
        USER
    }
}
