package com.itds.nearby.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CLISERVICE")
public class CliService implements Serializable {

    @EmbeddedId
    private CliServiceId cliServiceId;

    @Column(name = "DIRECTION")
    private String direction;

    @Column(name = "CHARITY")
    private String charity;

    public CliServiceId getCliServiceId() {
        return cliServiceId;
    }

    public void setCliServiceId(CliServiceId cliServiceId) {
        this.cliServiceId = cliServiceId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCharity() {
        return charity;
    }

    public void setCharity(String charity) {
        this.charity = charity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CliService that = (CliService) o;
        return cliServiceId.equals(that.cliServiceId) &&
                direction.equals(that.direction) &&
                charity.equals(that.charity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliServiceId, direction, charity);
    }

    @Override
    public String toString() {
        return "CliService{" +
                "cliServiceId=" + cliServiceId +
                ", direction='" + direction + '\'' +
                ", charity='" + charity + '\'' +
                '}';
    }
}
