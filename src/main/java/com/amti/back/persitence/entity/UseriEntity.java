package com.amti.back.persitence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UseriEntity {
    @Id
    Integer id_user;
    String useri;
    String email;
    public UseriEntity(Integer id_user, String useri, String email){
        this.id_user=id_user;
        this.useri=useri;
        this.email=email;
    }
    public UseriEntity(){

    }
}
