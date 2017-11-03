/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//el nombre de mi paquete
package dao;

// mis importes
import hbm.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Persona;
import pojo.TipoPersona;

/**
 *
 * @author RigoBono
 */
//mi clase PersonaDAO
public class PersonaDAO {
    Session session;
    
    //creo mi PersonaDAO
    public PersonaDAO(){
        //mi session=HibernateUtil.getLocalSession()
        session=HibernateUtil.getLocalSession();
    }
    
    //creo mi Persona con un getPersonaById
    public  Persona getPersonaById(int id){
        //mi retorno de session
        return (Persona)session.load(Persona.class, id);
    }
    //creo mi lista Persona que me va adar los nombres
    public List<Persona>  getPersonaByName(String nombre){
        //mi lista Persona
        List<Persona> listaDePersonas=(List<Persona>)
                //añado mis criterios de session a mi clase Persona
                session.createCriteria(Persona.class)
                //agrego mis restriciones de nombre
                .add(Restrictions.eq("Nombre", nombre));
        //mi retorno de listaPersonas
        return listaDePersonas;
    }
    
    //creo mi actualizacion de personas
    public boolean updateById(int id,Persona persona){
        Persona personaAModificar=getPersonaById(id);
        try{
            Transaction transaccion=session.beginTransaction();
            personaAModificar.setNombre(persona.getNombre());
            session.update(personaAModificar);
            transaccion.commit();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    //aqui estoy guardando mis Personas
    //y guardo los datos de mis personas: nombre, materno, paterno, telefono, tipo
    //pongo un try catch
    public boolean savePersona(String nombre,String materno,String paterno,String telefono,int idTipoPersona){
        Persona personaDeTanque=new Persona();
        TipoPersona tipoDeTanque=(TipoPersona)session.load(TipoPersona.class, idTipoPersona);
        personaDeTanque.setNombre(nombre);
        personaDeTanque.setMaterno(materno);
        personaDeTanque.setPaterno(paterno);
        personaDeTanque.setTelefono(telefono);
        personaDeTanque.setTipoPersona(tipoDeTanque);
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(personaDeTanque);
            transaccion.commit();
            return true;
        }catch(Exception e){
            
        }finally{
            
        }
        return true;
    }
    
}
