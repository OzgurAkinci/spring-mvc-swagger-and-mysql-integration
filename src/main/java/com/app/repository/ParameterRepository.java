package com.app.repository;

import com.app.model.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParameterRepository extends JpaRepository<Parameter, Long> {

    @Query("SELECT u FROM Parameter u WHERE u.parameterCode = ?1")
    List<Parameter> findByParameterCode(String parameterCode);

    @Modifying
    @Query("DELETE FROM Parameter u WHERE u.parameterCode = ?1")
    int deleteByParameterCode(String parameterCode);
}
