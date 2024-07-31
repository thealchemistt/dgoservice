package com.example.dgoservice.service;

import com.example.dgoservice.model.PreSignResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Service
public class DGOPreSignService {

    public PreSignResponse generateUniqueId() {
        String uniqueId = UUID.randomUUID().toString();
        return new PreSignResponse(uniqueId);
    }
}
