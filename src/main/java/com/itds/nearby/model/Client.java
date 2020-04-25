package com.itds.nearby.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCli;

    @Column(name = "LOGIN", nullable=false)
    private String login;

    @Column(name = "PASSWORD", nullable=false)
    private String password;

    @Column(name = "LATITUDE", nullable=false)
    private BigDecimal latitude;

    @Column(name = "LONGITUDE", nullable=false)
    private BigDecimal longitude;

    @Column(name = "EMAIL", nullable=false)
    private String email;

    public Integer getIdCli() {
        return idCli;
    }

    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
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
        Client client = (Client) o;
        return idCli.equals(client.idCli) &&
                login.equals(client.login) &&
                password.equals(client.password) &&
                latitude.equals(client.latitude) &&
                longitude.equals(client.longitude) &&
                email.equals(client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCli, login, password, latitude, longitude, email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "idCli=" + idCli +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", email='" + email + '\'' +
                '}';
    }
}
