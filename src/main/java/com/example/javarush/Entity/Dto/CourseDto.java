package com.example.javarush.Entity.Dto;

import com.example.javarush.Entity.Modules;

import java.util.List;

public class CourseDto {

    private Long id;
    private String name;
    private String description;
    private List<ModulesDto> modules;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ModulesDto> getModules() {
        return modules;
    }

    public void setModules(List<ModulesDto> modules) {
        this.modules = modules;
    }
}
