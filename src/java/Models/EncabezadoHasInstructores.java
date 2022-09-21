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
@Table(name = "encabezado_has_instructores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EncabezadoHasInstructores.findAll", query = "SELECT e FROM EncabezadoHasInstructores e")
    , @NamedQuery(name = "EncabezadoHasInstructores.findByPkEncabezadoPlaneacionpkEncabezadoPlaneacion", query = "SELECT e FROM EncabezadoHasInstructores e WHERE e.pkEncabezadoPlaneacionpkEncabezadoPlaneacion = :pkEncabezadoPlaneacionpkEncabezadoPlaneacion")
    , @NamedQuery(name = "EncabezadoHasInstructores.findByInstructorespklInstructores", query = "SELECT e FROM EncabezadoHasInstructores e WHERE e.instructorespklInstructores = :instructorespklInstructores")
    , @NamedQuery(name = "EncabezadoHasInstructores.findByIdEncabezadohasInstructorescol", query = "SELECT e FROM EncabezadoHasInstructores e WHERE e.idEncabezadohasInstructorescol = :idEncabezadohasInstructorescol")
    , @NamedQuery(name = "EncabezadoHasInstructores.findByEncabezadoPlaneacionpkEncabezadoPlaneacion", query = "SELECT e FROM EncabezadoHasInstructores e WHERE e.encabezadoPlaneacionpkEncabezadoPlaneacion = :encabezadoPlaneacionpkEncabezadoPlaneacion")})
public class EncabezadoHasInstructores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkEncabezadoPlaneacion_pkEncabezadoPlaneacion")
    private Long pkEncabezadoPlaneacionpkEncabezadoPlaneacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Instructores_pklInstructores")
    private int instructorespklInstructores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "idEncabezado_has_Instructorescol")
    private String idEncabezadohasInstructorescol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EncabezadoPlaneacion_pkEncabezadoPlaneacion")
    private long encabezadoPlaneacionpkEncabezadoPlaneacion;

    public EncabezadoHasInstructores() {
    }

    public EncabezadoHasInstructores(Long pkEncabezadoPlaneacionpkEncabezadoPlaneacion) {
        this.pkEncabezadoPlaneacionpkEncabezadoPlaneacion = pkEncabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    public EncabezadoHasInstructores(Long pkEncabezadoPlaneacionpkEncabezadoPlaneacion, int instructorespklInstructores, String idEncabezadohasInstructorescol, long encabezadoPlaneacionpkEncabezadoPlaneacion) {
        this.pkEncabezadoPlaneacionpkEncabezadoPlaneacion = pkEncabezadoPlaneacionpkEncabezadoPlaneacion;
        this.instructorespklInstructores = instructorespklInstructores;
        this.idEncabezadohasInstructorescol = idEncabezadohasInstructorescol;
        this.encabezadoPlaneacionpkEncabezadoPlaneacion = encabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    public Long getPkEncabezadoPlaneacionpkEncabezadoPlaneacion() {
        return pkEncabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    public void setPkEncabezadoPlaneacionpkEncabezadoPlaneacion(Long pkEncabezadoPlaneacionpkEncabezadoPlaneacion) {
        this.pkEncabezadoPlaneacionpkEncabezadoPlaneacion = pkEncabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    public int getInstructorespklInstructores() {
        return instructorespklInstructores;
    }

    public void setInstructorespklInstructores(int instructorespklInstructores) {
        this.instructorespklInstructores = instructorespklInstructores;
    }

    public String getIdEncabezadohasInstructorescol() {
        return idEncabezadohasInstructorescol;
    }

    public void setIdEncabezadohasInstructorescol(String idEncabezadohasInstructorescol) {
        this.idEncabezadohasInstructorescol = idEncabezadohasInstructorescol;
    }

    public long getEncabezadoPlaneacionpkEncabezadoPlaneacion() {
        return encabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    public void setEncabezadoPlaneacionpkEncabezadoPlaneacion(long encabezadoPlaneacionpkEncabezadoPlaneacion) {
        this.encabezadoPlaneacionpkEncabezadoPlaneacion = encabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkEncabezadoPlaneacionpkEncabezadoPlaneacion != null ? pkEncabezadoPlaneacionpkEncabezadoPlaneacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncabezadoHasInstructores)) {
            return false;
        }
        EncabezadoHasInstructores other = (EncabezadoHasInstructores) object;
        if ((this.pkEncabezadoPlaneacionpkEncabezadoPlaneacion == null && other.pkEncabezadoPlaneacionpkEncabezadoPlaneacion != null) || (this.pkEncabezadoPlaneacionpkEncabezadoPlaneacion != null && !this.pkEncabezadoPlaneacionpkEncabezadoPlaneacion.equals(other.pkEncabezadoPlaneacionpkEncabezadoPlaneacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.EncabezadoHasInstructores[ pkEncabezadoPlaneacionpkEncabezadoPlaneacion=" + pkEncabezadoPlaneacionpkEncabezadoPlaneacion + " ]";
    }
    
}
