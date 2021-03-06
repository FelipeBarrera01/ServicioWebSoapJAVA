/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import domain.Persona;
import datos.PersonaDao;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

import web.IPersonaServiceWs;

/**
 *
 * @author Felipe Barrera
 */
@Stateless
public class PersonaServiceImpl implements  PersonaService, IPersonaServiceWs{

    
    @Inject
    private PersonaDao personaDao;
    
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona econtrarPersonaPorId(Persona persona) {
    return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
      return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
         personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
