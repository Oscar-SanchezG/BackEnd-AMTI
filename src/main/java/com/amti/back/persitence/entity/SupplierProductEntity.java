package com.amti.back.persitence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class SupplierProductEntity {
    @Id
    private Integer intidp;
    private Integer intids;
    private String strkeys;
    private BigDecimal dlcost;



    public SupplierProductEntity(Integer intidp, Integer intids, String strkeys, BigDecimal dlcost) {
        this.intidp = intidp;
        this.intids = intids;
        this.strkeys = strkeys;
        this.dlcost = dlcost;
    }

    public SupplierProductEntity(){

    }
}
