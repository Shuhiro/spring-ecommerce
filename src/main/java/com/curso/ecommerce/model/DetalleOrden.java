package com.curso.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
public class DetalleOrden {

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private double cantidad;

    @Getter @Setter
    private  double precio;

    @Getter @Setter
    private double total;

    public DetalleOrden(){
    }

    public DetalleOrden(Integer id, String nombre, double cantidad, double precio, double total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }
}
