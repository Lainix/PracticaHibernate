/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//el nombre de mi paquete pojo
package pojo;

// mis importes
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author RigoBono
 */

//Traigo mi entrada 
@Entity
//traigo mi tabla persona de mi catalogo generationHibernate
@Table(name="Persona",catalog="generationHibernate")
//creo mi clase Persona 
public class Persona {
    
    //creo mi Id //De GeneratedValue: pongo mi valor de id que es Persona
    @Id @GeneratedValue
    //creo una comumna y le pongo nombre idPersona
    //private int idPersona: creo mi idPersona
    @Column(name="idPersona")
    private int idPersona;
    
    //nullable=true: es para decirle que no deje cuadros vacios si dijera false dejaria espacios
    @Column(name="Nombre",nullable=true)
    private String Nombre;
    
    @Column(name="Paterno")
    private String Paterno;
    
     @Column(name="Materno")
    private String Materno;
     
     @Column(name="Telefono")
    private String Telefono;
    
     
     //Todos a uno: ejemplo Un profesor a muchos alumnos
     @ManyToOne
     //Ingreso a la columna de nombre idTipoPersona
     //private TipoPersona tipoPersona: creo mi clase tipoPersona
     @JoinColumn(name="idTipoPersona")
    private TipoPersona tipoPersona;

    /**
     * @return the idPersona
     */
     // pongo mis get´s y set´s
     //Los pongo de mi Refactor y selecsiono todos
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Paterno
     */
    public String getPaterno() {
        return Paterno;
    }

    /**
     * @param Paterno the Paterno to set
     */
    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    /**
     * @return the Materno
     */
    public String getMaterno() {
        return Materno;
    }

    /**
     * @param Materno the Materno to set
     */
    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the tipoPersona
     */
    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * @param tipoPersona the tipoPersona to set
     */
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
     
     
    
}
