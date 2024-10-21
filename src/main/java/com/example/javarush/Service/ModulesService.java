package com.example.javarush.Service;

import com.example.javarush.Entity.Dto.ModulesDto;
import com.example.javarush.Repository.ModulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ModulesService {

    List<ModulesDto> getAllModules();
    ModulesDto getModuleById(Long id);
    ModulesDto saveModule(ModulesDto module);
    void deleteModule(Long id);

}
