/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// son mis importes para poder utilizar mis funciones de archivo
import dao.PersonaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Persona;

/**
 *
 * @author RigoBono
 */
//voy hacer un testin de persona sin tener que establecer una conexion 
public class TestingPersonaDAO {
    
    //creo mi clase TestingPersonaDAO
    public TestingPersonaDAO() {
    }
    
    //mis metodos que va utilizar mi testing para testear mi TipoPersonaDAO
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //se crea un test 
    //creo una PersonaDAO personita=new PersonaDAO y la instancio
    //Creo mi Persona personaProNuevoPablo=new Persona y la instancio este es para crear un nuevo nombre para pablo e
    //personaProNuevoPablo.setNombre("Elizabeth"); mando el nuevo nombre que va ocupar el lugar de lablo e
    //personita.updateById(4, personaProNuevoPablo); Mi personita actualiza todos mis datos de la casilla (4 cambia mi personaProNuevoPablo)
     @Test
     public void hello() {
         PersonaDAO personita=new PersonaDAO();
         Persona personaProNuevoPablo=new Persona();
         personaProNuevoPablo.setNombre("Elizabeth");
         personita.updateById(4, personaProNuevoPablo);
     }
}
