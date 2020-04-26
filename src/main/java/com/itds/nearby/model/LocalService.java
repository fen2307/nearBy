package com.itds.nearby.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "LOCALSERVICES")
public class LocalService {
    @Id
    @Column(name = "LOGGED_IDCLI")
    private Integer loggedIdCli;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "DIRECTION")
    private String direction;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "APPROACH")
    private String approach;

    @Column(name = "HUMAN_DISTANCE")
    private String humanDistance;

    @Column(name = "IS_GLOBAL")
    private String isGLobal;

    @Column(name = "DISTANCE")
    private Double distance;


    @Column(name = "EMAIL")
    private String email;

    public Integer getLoggedIdCli() {
        return loggedIdCli;
    }

    public void setLoggedIdCli(Integer loggedIdCli) {
        this.loggedIdCli = loggedIdCli;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApproach() {
        return approach;
    }

    public void setApproach(String approach) {
        this.approach = approach;
    }

    public String getHumanDistance() {
        return humanDistance;
    }

    public void setHumanDistance(String humanDistance) {
        this.humanDistance = humanDistance;
    }

    public String getIsGLobal() {
        return isGLobal;
    }

    public void setIsGLobal(String isGLobal) {
        this.isGLobal = isGLobal;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalService that = (LocalService) o;
        return Objects.equals(loggedIdCli, that.loggedIdCli) &&
                Objects.equals(login, that.login) &&
                Objects.equals(direction, that.direction) &&
                Objects.equals(description, that.description) &&
                Objects.equals(approach, that.approach) &&
                Objects.equals(humanDistance, that.humanDistance) &&
                Objects.equals(isGLobal, that.isGLobal) &&
                Objects.equals(distance, that.distance) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggedIdCli, login, direction, description, approach, humanDistance, isGLobal, distance, email);
    }

    @Override
    public String toString() {
        return "LocalService{" +
                "loggedIdCli=" + loggedIdCli +
                ", login='" + login + '\'' +
                ", direction='" + direction + '\'' +
                ", description='" + description + '\'' +
                ", approach='" + approach + '\'' +
                ", humanDistance='" + humanDistance + '\'' +
                ", isGLobal='" + isGLobal + '\'' +
                ", distance=" + distance +
                ", email='" + email + '\'' +
                '}';
    }
}
