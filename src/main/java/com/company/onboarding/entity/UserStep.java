package com.company.onboarding.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "USER_STEP")
@Entity
public class UserStep {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @NotNull
    @JoinColumn(name = "USER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;

    @NotNull
    @JoinColumn(name = "STEP_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Step step;

    @Column(name = "DUE_DATE", nullable = false)
    @NotNull
    private LocalDate dueDate;

    @Column(name = "COMPLETED_DATE")
    private LocalDate completedDate;

    @Column(name = "SORT_VALUE", nullable = false)
    @NotNull
    private Integer sortValue;

    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    public void setSortValue(Integer sortValue) {
        this.sortValue = sortValue;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public Integer getSortValue() {
        return sortValue;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Step getStep() {
        return step;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
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