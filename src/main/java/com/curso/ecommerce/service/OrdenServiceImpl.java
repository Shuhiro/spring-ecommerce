package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Orden;
import com.curso.ecommerce.model.Usuario;
import com.curso.ecommerce.repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrdenServiceImpl implements IOrdenService {

    @Autowired
    private IOrdenRepository ordenRepository;

    @Override
    public List<Orden> findAll() {
        return ordenRepository.findAll();
    }

    @Override
    public Orden save(Orden orden) {
        return ordenRepository.save(orden);
    }

    public String generarNumeroOrden(){
        int numero=0;
        String numeroConcatenado="";

        List<Orden> ordenes =  findAll();

        List<Integer> numeros = new ArrayList<>();

        ordenes.forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));

        if (ordenes.isEmpty()){
            numero=1;
        }else{
            numero = numeros.stream().max(Integer::compare).get();
            numero++;
        }
        String numeroStr= String.valueOf(numero);
        int longitud = numeroStr.length();
        int numeroceros = 10 - longitud;
        numeroConcatenado = String.format("%0"+numeroceros+"d",numero);

        return numeroConcatenado;
    }

    @Override
    public List<Orden> findByUsuario(Usuario usuario) {
        return ordenRepository.findByUsuario(usuario);
    }

    @Override
    public Optional<Orden> findById(Integer id) {
        return ordenRepository.findById(id);
    }
}
