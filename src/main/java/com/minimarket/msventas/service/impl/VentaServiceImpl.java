package com.minimarket.msventas.service.impl;

import com.minimarket.msventas.entity.Venta;
import com.minimarket.msventas.repository.VentaRepository;
import com.minimarket.msventas.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository repository;

    @Override
    public List<Venta> listarTodas() {
        return repository.findAll();
    }

    @Override
    public Optional<Venta> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Venta registrar(Venta venta) {
        return repository.save(venta);
    }

    @Override
    public void anular(Long id) {
        repository.deleteById(id);
    }
}