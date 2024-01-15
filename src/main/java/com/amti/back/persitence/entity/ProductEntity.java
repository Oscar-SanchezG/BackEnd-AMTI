package com.amti.back.persitence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.TinyIntAsSmallIntJdbcType;
@Getter
@Setter
@Entity
public class ProductEntity {
    @Id
    private Integer intid;
    private String inttype;
    private String strkey;
    private Double intprice;
    private String strname;
    private boolean stravailable;
    private String strdescription;


    public ProductEntity(Integer intid, String inttype, String strkey, Double intprice, String strname, boolean stravailable, String strdescription) {
        this.intid = intid;
        this.inttype = inttype;
        this.strkey = strkey;
        this.intprice = intprice;
        this.strname = strname;
        this.stravailable = stravailable;
        this.strdescription = strdescription;
    }

    public  ProductEntity(){

    }
}
