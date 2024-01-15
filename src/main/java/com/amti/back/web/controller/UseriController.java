package com.amti.back.web.controller;

import com.amti.back.persitence.entity.ProductSupplierEntity;
import com.amti.back.persitence.entity.UseriEntity;
import com.amti.back.service.ProductSupplierService;
import com.amti.back.service.UseriService;
import com.amti.back.service.dto.UseriDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UseriController {
    private final UseriService useriService;

    public UseriController(UseriService useriService) {
        this.useriService = useriService;
    }

    @PostMapping
    public ResponseEntity<List<UseriEntity>> getUseri(@RequestBody UseriDto dto){

        return ResponseEntity.ok(this.useriService.getUseri(dto));
    }
}
