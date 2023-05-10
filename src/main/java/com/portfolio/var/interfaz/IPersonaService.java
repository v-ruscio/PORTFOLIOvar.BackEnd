/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.var.interfaz;

import com.portfolio.var.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Listar personas

    public List<Persona> getPersona();
    
    //Guardar persona
    public void savePersona(Persona persona);
    
    
    //Delete persona por ID
    public void deletePersona(Long id);
    
    //Buscar por ID
    public Persona findPersona(Long id);
    
}
