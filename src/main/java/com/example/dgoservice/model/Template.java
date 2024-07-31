package com.example.dgoservice.model;

public class Template {

    private String templateId;
    private String content;

    public Template(String templateId, String content) {
        this.templateId = templateId;
        this.content = content;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
