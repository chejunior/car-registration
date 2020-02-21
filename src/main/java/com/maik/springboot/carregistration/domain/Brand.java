package com.maik.springboot.carregistration.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(
        name = "brand",
        uniqueConstraints = {@UniqueConstraint(
                columnNames = {"id"}
        )}
)
public class Brand {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Name can not be null")
    @Column(name = "name", nullable = false)
    private String name;
    
    @NotNull(message = "Model can not be null")
    @Column(name = "model", nullable = false)
    private String model;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
    

}
