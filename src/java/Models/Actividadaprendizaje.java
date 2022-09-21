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
@Table(name = "actividadaprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividadaprendizaje.findAll", query = "SELECT a FROM Actividadaprendizaje a")
    , @NamedQuery(name = "Actividadaprendizaje.findByPkActividadAprendizaje", query = "SELECT a FROM Actividadaprendizaje a WHERE a.pkActividadAprendizaje = :pkActividadAprendizaje")
    , @NamedQuery(name = "Actividadaprendizaje.findByFkActividadProyecto", query = "SELECT a FROM Actividadaprendizaje a WHERE a.fkActividadProyecto = :fkActividadProyecto")
    , @NamedQuery(name = "Actividadaprendizaje.findByCodigo", query = "SELECT a FROM Actividadaprendizaje a WHERE a.codigo = :codigo")
    , @NamedQuery(name = "Actividadaprendizaje.findByDescripcion", query = "SELECT a FROM Actividadaprendizaje a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Actividadaprendizaje.findByActivo", query = "SELECT a FROM Actividadaprendizaje a WHERE a.activo = :activo")
    , @NamedQuery(name = "Actividadaprendizaje.findByFechaCreacion", query = "SELECT a FROM Actividadaprendizaje a WHERE a.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Actividadaprendizaje.findByFechaModificacion", query = "SELECT a FROM Actividadaprendizaje a WHERE a.fechaModificacion = :fechaModificacion")})
public class Actividadaprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkActividadAprendizaje")
    private Long pkActividadAprendizaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkActividadProyecto")
    private long fkActividadProyecto;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private short activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaModificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;

    public Actividadaprendizaje() {
    }

    public Actividadaprendizaje(Long pkActividadAprendizaje) {
        this.pkActividadAprendizaje = pkActividadAprendizaje;
    }

    public Actividadaprendizaje(Long pkActividadAprendizaje, long fkActividadProyecto, short activo, Date fechaCreacion, Date fechaModificacion) {
        this.pkActividadAprendizaje = pkActividadAprendizaje;
        this.fkActividadProyecto = fkActividadProyecto;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkActividadAprendizaje() {
        return pkActividadAprendizaje;
    }

    public void setPkActividadAprendizaje(Long pkActividadAprendizaje) {
        this.pkActividadAprendizaje = pkActividadAprendizaje;
    }

    public long getFkActividadProyecto() {
        return fkActividadProyecto;
    }

    public void setFkActividadProyecto(long fkActividadProyecto) {
        this.fkActividadProyecto = fkActividadProyecto;
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

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
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
        hash += (pkActividadAprendizaje != null ? pkActividadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividadaprendizaje)) {
            return false;
        }
        Actividadaprendizaje other = (Actividadaprendizaje) object;
        if ((this.pkActividadAprendizaje == null && other.pkActividadAprendizaje != null) || (this.pkActividadAprendizaje != null && !this.pkActividadAprendizaje.equals(other.pkActividadAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Actividadaprendizaje[ pkActividadAprendizaje=" + pkActividadAprendizaje + " ]";
    }
    
}
