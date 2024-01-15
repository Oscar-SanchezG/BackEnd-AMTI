package com.amti.back.persitence.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class SupplierUpdateEntity {
    @Id
    private String intidp;
    private String intids;
    private String dlcost;
    private String strkeys;
    private String intidsn;

    public SupplierUpdateEntity(String intidp, String intids,  String dlcost,String strkeys, String intidsn) {
        this.intidp = intidp;
        this.intids = intids;
        this.dlcost = dlcost;
        this.strkeys = strkeys;
        this.intidsn = intidsn;
    }

    public SupplierUpdateEntity(){

    }
}
