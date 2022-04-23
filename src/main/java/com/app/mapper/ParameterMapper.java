package com.app.mapper;

import com.app.model.Parameter;
import com.app.model.dto.ParameterDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParameterMapper {
    ParameterMapper INSTANCE = Mappers.getMapper(ParameterMapper.class);

    Parameter parameterDtoToParameter(ParameterDto parameterDto);
}
