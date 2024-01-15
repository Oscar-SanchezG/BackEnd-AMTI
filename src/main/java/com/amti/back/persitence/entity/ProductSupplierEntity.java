package com.amti.back.persitence.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter

public class ProductSupplierEntity {
    @EmbeddedId
    private ProductSupplierPK id;
    private String strkeysupp;
    private Double dlcost;
    private String strname;

    public ProductSupplierEntity(ProductSupplierPK id, String strkeysupp, Double dlcost, String strname) {
        this.id = id;
        this.strkeysupp = strkeysupp;
        this.dlcost = dlcost;
        this.strname = strname;
    }

    public ProductSupplierEntity() {

    }
}
