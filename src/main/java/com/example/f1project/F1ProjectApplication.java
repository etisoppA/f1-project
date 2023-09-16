package com.example.f1project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class F1ProjectApplication {
    private String year;
    private String function;

    public F1ProjectApplication() {
        year = "1950";
        function = "Rankings";
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
