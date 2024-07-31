package com.example.dgoservice.controller;

import com.example.dgoservice.model.Template;
import com.example.dgoservice.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TemplateController {

    @Autowired
    private TemplateService templateService;


    @GetMapping("/template/{templateId}")
    public Template getTemplate(@PathVariable String templateId) {
        return templateService.getTemplate(templateId);
    }
}
