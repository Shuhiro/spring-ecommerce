package com.curso.ecommerce.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "detalles")
@ToString @EqualsAndHashCode
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @Getter @Setter
    private Orden orden;

    @ManyToOne
    @Getter @Setter
    private Producto producto;

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
