package com.example.dgoservice.service;


import com.example.dgoservice.model.Template;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Service
public class TemplateService {

    private static final Map<String, Template> templates = new HashMap<>();

    static {
        templates.put("template1", new Template("template1", "This is template1"));
        templates.put("template2", new Template("template2", "This is template2"));
        templates.put("template3", new Template("template3", "This is template3"));
        templates.put("template4", new Template("template4", "This is template4"));
    }


    public Template getTemplate(@PathVariable String templateId) {
        return templates.get(templateId);
    }
}
