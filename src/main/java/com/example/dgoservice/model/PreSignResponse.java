package com.example.dgoservice.model;

public class PreSignResponse {
    private String uniqueId;

    public PreSignResponse(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
