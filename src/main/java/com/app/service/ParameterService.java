package com.app.service;

import com.app.model.Parameter;
import com.app.repository.ParameterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParameterService {
    private static final Logger logger = LoggerFactory.getLogger(ParameterService.class);

    @Autowired
    ParameterRepository parameterRepository;

    public List<Parameter> findAll() {
        logger.info("Parameter <List> fetching..");
        return parameterRepository.findAll();
    }

    public List<Parameter> findByParameterCode(String parameterCode) {
        logger.info("Parameter <Object> fetching..");
        return parameterRepository.findByParameterCode(parameterCode);
    }

    public Parameter save(Parameter parameter) {
        logger.info("Parameter <Object> saving..");
        return parameterRepository.save(parameter);
    }

    @Transactional
    public int deleteByParameterCode(String parameterCode) {
        logger.info("Parameter <Object> deleting..");
        return parameterRepository.deleteByParameterCode(parameterCode);
    }
}
