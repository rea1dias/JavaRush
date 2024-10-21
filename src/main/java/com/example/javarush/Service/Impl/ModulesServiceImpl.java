package com.example.javarush.Service.Impl;

import com.example.javarush.Entity.Dto.ModulesDto;
import com.example.javarush.Repository.ModulesRepository;
import com.example.javarush.Service.ModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModulesServiceImpl implements ModulesService {

    @Autowired
    private ModulesRepository modulesRepository;

    @Override
    public List<ModulesDto> getAllModules() {
        return List.of();
    }

    @Override
    public ModulesDto getModuleById(Long id) {
        return null;
    }

    @Override
    public ModulesDto saveModule(ModulesDto module) {
        return null;
    }

    @Override
    public void deleteModule(Long id) {

    }
}
