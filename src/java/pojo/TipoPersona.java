/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// el nombre de mi paquete pojo
package pojo;

// mis importes
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  #Pray4Tanque
 * @author RigoBono
 */
//mi entrada
@Entity
//Mi tabla le pongo nombre TipoPersona y la traigo de mi catalogo generationHibernate
@Table(name="TipoPersona", catalog="generationHibernate")
// creo mi clase TipoPersona
public class TipoPersona {
    
    //creo mi Id // Mi GenerateValue 
    //pongo mi columna y le pongo nombre idTipoPersona
    //creo mi idTipoPersona
    @Id @GeneratedValue
    @Column(name="idTipoPersona")
    private int idTipoPersona;
    
    //creo mi columna y le pongo nombre TipoPersonacol
    //creo mi clase TipoPersona
     @Column(name="TipoPersonacol")
    private String TipoPersona;
     
     //creo mi TipoPersona
     public TipoPersona(){
         
     }
     
     // traigo mis get y set, en Refactor y selecsiono todos
    /**
     * @return the idTipoPersona
     */
    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    /**
     * @param idTipoPersona the idTipoPersona to set
     */
    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    /**
     * @return the TipoPersona
     */
    public String getTipoPersona() {
        return TipoPersona;
    }

    /**
     * @param TipoPersona the TipoPersona to set
     */
    public void setTipoPersona(String TipoPersona) {
        this.TipoPersona = TipoPersona;
    }
     
     
     
     
    
}
