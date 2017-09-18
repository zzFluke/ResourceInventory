package com.github.zzfluke.persistance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(schema = "sys")
@NoArgsConstructor
@AllArgsConstructor
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(schema = "sys", name = "resource_property",
            joinColumns = @JoinColumn(name = "resource_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "property_id", referencedColumnName = "id"))
    @Getter
    @Setter
    Set<Property> properties;
}
