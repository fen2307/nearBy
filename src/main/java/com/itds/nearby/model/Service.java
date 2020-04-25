package com.itds.nearby.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "SERVICE")
public class Service implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSer;

    @Column(name = "DESCRIPTION", nullable=false)
    private String description;

    @Column(name = "GLOBAL", nullable=false)
    private String global;

    public Integer getIdSer() {
        return idSer;
    }

    public void setIdSer(Integer idSer) {
        this.idSer = idSer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGlobal() {
        return global;
    }

    public void setGlobal(String global) {
        this.global = global;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return idSer.equals(service.idSer) &&
                description.equals(service.description) &&
                global.equals(service.global);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSer, description, global);
    }

    @Override
    public String toString() {
        return "Service{" +
                "idSer=" + idSer +
                ", description='" + description + '\'' +
                ", global='" + global + '\'' +
                '}';
    }
}
