/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marga
 */
@Entity
@Table(name = "estrategiasdidacticasactivas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estrategiasdidacticasactivas.findAll", query = "SELECT e FROM Estrategiasdidacticasactivas e")
    , @NamedQuery(name = "Estrategiasdidacticasactivas.findByPkEstrategiasDdacticasActivas", query = "SELECT e FROM Estrategiasdidacticasactivas e WHERE e.pkEstrategiasDdacticasActivas = :pkEstrategiasDdacticasActivas")
    , @NamedQuery(name = "Estrategiasdidacticasactivas.findByCodigo", query = "SELECT e FROM Estrategiasdidacticasactivas e WHERE e.codigo = :codigo")
    , @NamedQuery(name = "Estrategiasdidacticasactivas.findByNombre", query = "SELECT e FROM Estrategiasdidacticasactivas e WHERE e.nombre = :nombre")})
public class Estrategiasdidacticasactivas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkEstrategiasDdacticasActivas")
    private Integer pkEstrategiasDdacticasActivas;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;

    public Estrategiasdidacticasactivas() {
    }

    public Estrategiasdidacticasactivas(Integer pkEstrategiasDdacticasActivas) {
        this.pkEstrategiasDdacticasActivas = pkEstrategiasDdacticasActivas;
    }

    public Integer getPkEstrategiasDdacticasActivas() {
        return pkEstrategiasDdacticasActivas;
    }

    public void setPkEstrategiasDdacticasActivas(Integer pkEstrategiasDdacticasActivas) {
        this.pkEstrategiasDdacticasActivas = pkEstrategiasDdacticasActivas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkEstrategiasDdacticasActivas != null ? pkEstrategiasDdacticasActivas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estrategiasdidacticasactivas)) {
            return false;
        }
        Estrategiasdidacticasactivas other = (Estrategiasdidacticasactivas) object;
        if ((this.pkEstrategiasDdacticasActivas == null && other.pkEstrategiasDdacticasActivas != null) || (this.pkEstrategiasDdacticasActivas != null && !this.pkEstrategiasDdacticasActivas.equals(other.pkEstrategiasDdacticasActivas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Estrategiasdidacticasactivas[ pkEstrategiasDdacticasActivas=" + pkEstrategiasDdacticasActivas + " ]";
    }
    
}
