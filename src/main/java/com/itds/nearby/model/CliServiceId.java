package com.itds.nearby.model;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class CliServiceId implements Serializable {
    @Column(name="IDCLI")
    private Integer idCli;

    @Column(name="IDSER")
    private Integer idSer;

    public CliServiceId(){

    }
    public CliServiceId(Integer idCli, Integer idSer) {
        this.idCli = idCli;
        this.idSer = idSer;
    }

    public Integer getIdCli() {
        return idCli;
    }

    public Integer getIdSer() {
        return idSer;
    }
}
