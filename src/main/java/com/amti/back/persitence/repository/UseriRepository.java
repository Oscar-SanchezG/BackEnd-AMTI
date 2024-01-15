package com.amti.back.persitence.repository;
import com.amti.back.persitence.entity.UseriEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface UseriRepository extends JpaRepository<UseriEntity, Integer> {
    @Procedure(value = "login_user")
    public List<UseriEntity> getUseri(@Param("useri") String useri, @Param("email") String email);
}
