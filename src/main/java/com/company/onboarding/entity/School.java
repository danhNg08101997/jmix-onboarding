package com.company.onboarding.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "SCHOOL")
@Entity
public class School {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "CODE", nullable = false, length = 50)
    @NotNull
    private String code;

    @InstanceName
    @Column(name = "NAME", nullable = false, length = 50)
    @NotNull
    private String name;

    @Composition
    @OneToMany(mappedBy = "school")
    private List<LopHoc> lopHoc;

    public List<LopHoc> getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(List<LopHoc> lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}