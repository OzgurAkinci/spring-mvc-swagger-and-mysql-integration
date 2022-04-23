package com.app.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "S_PARAMETER")
@Data
public class Parameter implements Serializable {
    private static final long erialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "parameter_code")
    private String parameterCode;

    @Column(name = "parameter_value")
    private String parameterValue;

}
