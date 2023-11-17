package com.curso.ecommerce.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenes")
@ToString @EqualsAndHashCode
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Getter @Setter
    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "orden")
    @Getter @Setter
    private List<DetalleOrden> detalle;

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
