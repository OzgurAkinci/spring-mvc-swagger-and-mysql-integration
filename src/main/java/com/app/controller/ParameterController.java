package com.app.controller;

import com.app.model.Parameter;
import com.app.model.base.BaseResponse;
import com.app.model.base.ExceptionInfo;
import com.app.service.ParameterService;
import com.app.util.AppUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter")
public class ParameterController {
    private static final Logger logger = LoggerFactory.getLogger(ParameterController.class);

    @Autowired
    ParameterService parameterService;

    @GetMapping("/list")
    public ResponseEntity<?> list() {
        try{
            List<Parameter> parameters = parameterService.findAll();
            return ResponseEntity.ok(new BaseResponse<>(parameters, true));
        }catch (Exception e) {
            StringBuilder exceptionTraceLog = AppUtils.getExceptionTraceLog(e, "Parameter <List> Error");
            logger.error("Parameter <List> Error : {}", exceptionTraceLog);
            return ResponseEntity.ok(new BaseResponse<>(false, new ExceptionInfo("PARAMETER_LIST_ERROR", e.getMessage())));
        }
    }

    @PostMapping("/save")
    public ResponseEntity<BaseResponse<Parameter>> save(@RequestBody Parameter parameter) {
        try{
            Parameter savedRecord =  parameterService.save(parameter);
            return ResponseEntity.ok(new BaseResponse<>(savedRecord, true));
        }catch (Exception e) {
            StringBuilder exceptionTraceLog = AppUtils.getExceptionTraceLog(e, "Parameter <Save> Error");
            logger.error("Parameter <Save> Error : {}", exceptionTraceLog);
            return ResponseEntity.ok(new BaseResponse<>(false, new ExceptionInfo("PARAMETER_SAVE_ERROR", e.getMessage())));
        }
    }
}
