/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbm;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author RigoBono
 */
public class HibernateUtil {

    // aqui traigo toda mi configuracion en mi sessionFactory
    // pongo final por que es la ultima y no puede cambiar 
    // pongo un ThreadLocal localSession;
    private static final SessionFactory sessionFactory;
    private static final ThreadLocal localSession;
    
    static {
        //esta parte es statica
        try {
            //pongo un try de mi configuración y la instancio
           Configuration config = new Configuration();
           //traigo mi configuracion y pongo la direccion donde esta
            config.configure("hibernate.cfg.xml");
            //creo un constructor y lo instancio
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
            //aplico mis settings de mi configuracion, y le mando mis propiedades        
            applySettings(config.getProperties());
            //mi session configuro mi constructor de session
            sessionFactory = config.buildSessionFactory(builder.build());
            // pongo mi catch
        } catch (Throwable ex) {
            // Log the exception. 
            //Pongo que me inprima si existio un error al crear la session
            System.err.println("Initial SessionFactory creation failed." + ex);
            //Mi excepcionInicial de el error
            throw new ExceptionInInitializerError(ex);
        }
        //es mi local session y la instancion en ThreadLocal
        localSession = new ThreadLocal();
    }
    
    //pongo un get SessionFactory y le doy un retorno
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    //pongo un get LocalSession
    //para iniciar la sesion
     public static Session getLocalSession() {
         //mi sesion
        Session session = (Session) localSession.get();
        //si mi session es nula
        if (session == null) {
            //session abierta se inicia
            session = sessionFactory.openSession();
            localSession.set(session);
            //aqui dice que ya inicio
            System.out.println("\nsesion iniciada");
        }
        //returno mi session
        return session;
    }
     
     //aqui voy a cerrar mi session
     public static void closeLocalSession() {
        Session session = (Session) localSession.get();
        if (session != null) session.close();
        localSession.set(null);
        System.out.println("sesion cerrada\n");
    }
}
