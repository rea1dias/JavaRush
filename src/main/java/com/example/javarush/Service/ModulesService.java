package com.example.javarush.Service;

import com.example.javarush.Repository.ModulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModulesService {

    @Autowired
    private ModulesRepository modulesRepository;
}