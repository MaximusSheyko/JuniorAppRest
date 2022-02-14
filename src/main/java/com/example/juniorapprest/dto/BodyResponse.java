package com.example.juniorapprest.dto;

public class BodyResponse {
    private String fio;

    public BodyResponse(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "BodyResponse{" +
                "fio='" + fio + '\'' +
                '}';
    }
}
