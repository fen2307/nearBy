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

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "EMAIL", nullable=false)
    private String email;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idCli.equals(client.idCli) &&
                login.equals(client.login) &&
                password.equals(client.password) &&
                Objects.equals(latitude, client.latitude) &&
                Objects.equals(longitude, client.longitude) &&
                email.equals(client.email) &&
                address.equals(client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCli, login, password, latitude, longitude, email, address);
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
                ", address='" + address + '\'' +
                '}';
    }
}
