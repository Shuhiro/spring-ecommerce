package com.curso.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
public class Producto {

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String descripcion;

    @Getter @Setter
    private String imagen;

    @Getter @Setter
    private double precio;

    @Getter @Setter
    private int cantidad;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String descripcion, String imagen, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
