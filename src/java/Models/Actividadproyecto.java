/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marga
 */
@Entity
@Table(name = "actividadproyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividadproyecto.findAll", query = "SELECT a FROM Actividadproyecto a")
    , @NamedQuery(name = "Actividadproyecto.findByPkActividadProyecto", query = "SELECT a FROM Actividadproyecto a WHERE a.pkActividadProyecto = :pkActividadProyecto")
    , @NamedQuery(name = "Actividadproyecto.findByFkFaseProyecto", query = "SELECT a FROM Actividadproyecto a WHERE a.fkFaseProyecto = :fkFaseProyecto")
    , @NamedQuery(name = "Actividadproyecto.findByCodigo", query = "SELECT a FROM Actividadproyecto a WHERE a.codigo = :codigo")
    , @NamedQuery(name = "Actividadproyecto.findByDescripcion", query = "SELECT a FROM Actividadproyecto a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Actividadproyecto.findByActivo", query = "SELECT a FROM Actividadproyecto a WHERE a.activo = :activo")
    , @NamedQuery(name = "Actividadproyecto.findByFechaCreacion", query = "SELECT a FROM Actividadproyecto a WHERE a.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Actividadproyecto.findByFechaModificacion", query = "SELECT a FROM Actividadproyecto a WHERE a.fechaModificacion = :fechaModificacion")})
public class Actividadproyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkActividadProyecto")
    private Long pkActividadProyecto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkFaseProyecto")
    private long fkFaseProyecto;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "activo")
    private Short activo;
    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fechaModificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;

    public Actividadproyecto() {
    }

    public Actividadproyecto(Long pkActividadProyecto) {
        this.pkActividadProyecto = pkActividadProyecto;
    }

    public Actividadproyecto(Long pkActividadProyecto, long fkFaseProyecto, String descripcion) {
        this.pkActividadProyecto = pkActividadProyecto;
        this.fkFaseProyecto = fkFaseProyecto;
        this.descripcion = descripcion;
    }

    public Long getPkActividadProyecto() {
        return pkActividadProyecto;
    }

    public void setPkActividadProyecto(Long pkActividadProyecto) {
        this.pkActividadProyecto = pkActividadProyecto;
    }

    public long getFkFaseProyecto() {
        return fkFaseProyecto;
    }

    public void setFkFaseProyecto(long fkFaseProyecto) {
        this.fkFaseProyecto = fkFaseProyecto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkActividadProyecto != null ? pkActividadProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividadproyecto)) {
            return false;
        }
        Actividadproyecto other = (Actividadproyecto) object;
        if ((this.pkActividadProyecto == null && other.pkActividadProyecto != null) || (this.pkActividadProyecto != null && !this.pkActividadProyecto.equals(other.pkActividadProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Actividadproyecto[ pkActividadProyecto=" + pkActividadProyecto + " ]";
    }
    
}
