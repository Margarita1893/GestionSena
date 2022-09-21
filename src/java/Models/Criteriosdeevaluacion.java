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
import javax.persistence.Lob;
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
@Table(name = "criteriosdeevaluacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criteriosdeevaluacion.findAll", query = "SELECT c FROM Criteriosdeevaluacion c")
    , @NamedQuery(name = "Criteriosdeevaluacion.findByPkCriteriosDeEvaluacion", query = "SELECT c FROM Criteriosdeevaluacion c WHERE c.pkCriteriosDeEvaluacion = :pkCriteriosDeEvaluacion")
    , @NamedQuery(name = "Criteriosdeevaluacion.findByCodigo", query = "SELECT c FROM Criteriosdeevaluacion c WHERE c.codigo = :codigo")})
public class Criteriosdeevaluacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkCriteriosDeEvaluacion")
    private Integer pkCriteriosDeEvaluacion;
    @Size(max = 45)
    @Column(name = "codigo")
    private String codigo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DecripcionEvidencia")
    private String decripcionEvidencia;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Observaciones")
    private String observaciones;

    public Criteriosdeevaluacion() {
    }

    public Criteriosdeevaluacion(Integer pkCriteriosDeEvaluacion) {
        this.pkCriteriosDeEvaluacion = pkCriteriosDeEvaluacion;
    }

    public Integer getPkCriteriosDeEvaluacion() {
        return pkCriteriosDeEvaluacion;
    }

    public void setPkCriteriosDeEvaluacion(Integer pkCriteriosDeEvaluacion) {
        this.pkCriteriosDeEvaluacion = pkCriteriosDeEvaluacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDecripcionEvidencia() {
        return decripcionEvidencia;
    }

    public void setDecripcionEvidencia(String decripcionEvidencia) {
        this.decripcionEvidencia = decripcionEvidencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkCriteriosDeEvaluacion != null ? pkCriteriosDeEvaluacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criteriosdeevaluacion)) {
            return false;
        }
        Criteriosdeevaluacion other = (Criteriosdeevaluacion) object;
        if ((this.pkCriteriosDeEvaluacion == null && other.pkCriteriosDeEvaluacion != null) || (this.pkCriteriosDeEvaluacion != null && !this.pkCriteriosDeEvaluacion.equals(other.pkCriteriosDeEvaluacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Criteriosdeevaluacion[ pkCriteriosDeEvaluacion=" + pkCriteriosDeEvaluacion + " ]";
    }
    
}
