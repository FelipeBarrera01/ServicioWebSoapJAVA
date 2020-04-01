/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import servicio.PersonaService;

/**
 *
 * @author Felipe Barrera
 */
@WebService(endpointInterface = "web.IPersonaServiceWs")
@Stateless
public class PersonaServiceWsImpl implements IPersonaServiceWs{

    @Inject
    private PersonaService personaService;
    
    
    @Override
    public List<Persona> listarPersonas() {
        return personaService.listarPersonas();
    }

    @Override
    public Persona econtrarPersonaPorId(Persona persona) {
        return personaService.econtrarPersonaPorId(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaService.encontrarPersonaPorEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaService.registrarPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaService.modificarPersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaService.eliminarPersona(persona);
    }
    
}
