package com.github.zzfluke.security.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.shiro.authz.permission.WildcardPermission;

import javax.persistence.*;

@Inheritance
@Entity
@Table(schema = "sec")
public abstract class Permission extends WildcardPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String domain;

    @Getter
    @Setter
    private Action action;

    protected Permission(String domain, Action action) {
        this.domain = domain;
        this.action = action;
    }

    public enum Action {
        READ, WRITE;
    }
}
