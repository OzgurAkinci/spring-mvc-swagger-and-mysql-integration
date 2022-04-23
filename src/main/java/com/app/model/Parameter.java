package com.app.model;

import javax.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "S_PARAMETER")
@Data
public class Parameter implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "parameter_code")
    private String parameterCode;

    @Column(name = "parameter_value")
    private String parameterValue;

}
