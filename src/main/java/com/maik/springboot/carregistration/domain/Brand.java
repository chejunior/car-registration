package com.maik.springboot.carregistration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
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
