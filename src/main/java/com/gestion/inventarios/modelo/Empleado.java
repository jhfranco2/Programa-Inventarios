
package com.gestion.inventarios.modelo;

import javax.persistence.*;
import javax.persistence.Table;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity

@Table(name="empleados")

public class Empleado  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nombre_producto",length =  60,nullable = false,unique = true)
    private String nombreProducto;
    @Column(name="cantidad",length = 60,nullable = false)
    private String cantidad;
    @Column(name="fecha_de_Ingreso",length = 60,nullable = false)
    private String fecha;
    @Column(name="usuario",length = 60,nullable = false)
    private String usuario;
    
 
    public Empleado(){
    
    }
    

    public Empleado(Long id, String nombreProducto, String cantidad, String fecha, String usuario) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFechaI(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
