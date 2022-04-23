CREATE TABLE
    s_parameter
(
    id INT NOT NULL AUTO_INCREMENT,
    parameter_code VARCHAR(25) NOT NULL,
    parameter_value text,
    CONSTRAINT pk_s_parameter PRIMARY KEY (id)
);