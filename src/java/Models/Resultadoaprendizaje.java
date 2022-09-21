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
@Table(name = "resultadoaprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultadoaprendizaje.findAll", query = "SELECT r FROM Resultadoaprendizaje r")
    , @NamedQuery(name = "Resultadoaprendizaje.findByPkResultadoAprendizaje", query = "SELECT r FROM Resultadoaprendizaje r WHERE r.pkResultadoAprendizaje = :pkResultadoAprendizaje")
    , @NamedQuery(name = "Resultadoaprendizaje.findByFkCompetencia", query = "SELECT r FROM Resultadoaprendizaje r WHERE r.fkCompetencia = :fkCompetencia")
    , @NamedQuery(name = "Resultadoaprendizaje.findByCodigo", query = "SELECT r FROM Resultadoaprendizaje r WHERE r.codigo = :codigo")
    , @NamedQuery(name = "Resultadoaprendizaje.findByNombre", query = "SELECT r FROM Resultadoaprendizaje r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Resultadoaprendizaje.findByActivo", query = "SELECT r FROM Resultadoaprendizaje r WHERE r.activo = :activo")
    , @NamedQuery(name = "Resultadoaprendizaje.findByFechaCreacion", query = "SELECT r FROM Resultadoaprendizaje r WHERE r.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Resultadoaprendizaje.findByFechaModificacion", query = "SELECT r FROM Resultadoaprendizaje r WHERE r.fechaModificacion = :fechaModificacion")})
public class Resultadoaprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkResultadoAprendizaje")
    private Long pkResultadoAprendizaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkCompetencia")
    private long fkCompetencia;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 250)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "activo")
    private Short activo;
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

    public Resultadoaprendizaje() {
    }

    public Resultadoaprendizaje(Long pkResultadoAprendizaje) {
        this.pkResultadoAprendizaje = pkResultadoAprendizaje;
    }

    public Resultadoaprendizaje(Long pkResultadoAprendizaje, long fkCompetencia, Date fechaCreacion, Date fechaModificacion) {
        this.pkResultadoAprendizaje = pkResultadoAprendizaje;
        this.fkCompetencia = fkCompetencia;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkResultadoAprendizaje() {
        return pkResultadoAprendizaje;
    }

    public void setPkResultadoAprendizaje(Long pkResultadoAprendizaje) {
        this.pkResultadoAprendizaje = pkResultadoAprendizaje;
    }

    public long getFkCompetencia() {
        return fkCompetencia;
    }

    public void setFkCompetencia(long fkCompetencia) {
        this.fkCompetencia = fkCompetencia;
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
        hash += (pkResultadoAprendizaje != null ? pkResultadoAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultadoaprendizaje)) {
            return false;
        }
        Resultadoaprendizaje other = (Resultadoaprendizaje) object;
        if ((this.pkResultadoAprendizaje == null && other.pkResultadoAprendizaje != null) || (this.pkResultadoAprendizaje != null && !this.pkResultadoAprendizaje.equals(other.pkResultadoAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Resultadoaprendizaje[ pkResultadoAprendizaje=" + pkResultadoAprendizaje + " ]";
    }
    
}
