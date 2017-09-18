package com.github.zzfluke.security.model;

import javax.persistence.Entity;

@Entity
public class ResourcePermission extends Permission {

    private static final String domain = "RESOURCE";

    ResourcePermission(Action action) {
        super(domain, action);
    }
}
