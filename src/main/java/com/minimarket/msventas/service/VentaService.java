package com.minimarket.msventas.service;

import com.minimarket.msventas.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaService {
    List<Venta> listarTodas();
    Optional<Venta> buscarPorId(Long id);
    Venta registrar(Venta venta);
    void anular(Long id);
}