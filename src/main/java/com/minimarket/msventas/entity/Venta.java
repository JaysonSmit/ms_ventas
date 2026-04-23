package com.minimarket.msventas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "ventas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 8)
    private String dniCliente;

    @Column(nullable = false, length = 100)
    private String productoNombre; // Lo guardamos directo sin Feign

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double totalPagar;

    @Column(nullable = false)
    private String metodoPago; // Ej: "Efectivo", "Yape", "Tarjeta"
}