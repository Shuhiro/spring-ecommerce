package com.curso.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString @EqualsAndHashCode
public class Orden {

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String numero;

    @Getter @Setter
    private Date fechaCreacion;

    @Getter @Setter
    private Date fechaRecibida;

    @Getter @Setter
    private double total;

    public Orden(){
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }
}
