package com.app.service;

import com.app.model.Parameter;
import com.app.repository.ParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParameterService {

    @Autowired
    ParameterRepository parameterRepository;

    public List<Parameter> findAll() {
        return parameterRepository.findAll();
    }

    public List<Parameter> findByParameterCode(String parameterCode) {
        return parameterRepository.findByParameterCode(parameterCode);
    }

    public Parameter save(Parameter parameter) {
        return parameterRepository.save(parameter);
    }

    @Transactional
    public int deleteByParameterCode(String parameterCode) {
        return parameterRepository.deleteByParameterCode(parameterCode);
    }
}
