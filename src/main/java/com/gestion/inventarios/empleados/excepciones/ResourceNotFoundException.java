
package com.gestion.inventarios.empleados.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Si no encuentra un empleado esta clase sabra que hacer.
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    
    private static final long serialVersionId = 1L;
    
    public ResourceNotFoundException(String mensaje){
        
        super(mensaje);
    
    }
}
