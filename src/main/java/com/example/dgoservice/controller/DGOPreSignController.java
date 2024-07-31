package com.example.dgoservice.controller;

import com.example.dgoservice.model.PreSignResponse;
import com.example.dgoservice.service.DGOPreSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class DGOPreSignController {

    @Autowired
    private DGOPreSignService dgoPreSignService;

    @PostMapping("/presign")
    public PreSignResponse generateUniqueId() {
        return dgoPreSignService.generateUniqueId();
    }
}
