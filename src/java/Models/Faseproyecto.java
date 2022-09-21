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
@Table(name = "faseproyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Faseproyecto.findAll", query = "SELECT f FROM Faseproyecto f")
    , @NamedQuery(name = "Faseproyecto.findByPkFaseProyecto", query = "SELECT f FROM Faseproyecto f WHERE f.pkFaseProyecto = :pkFaseProyecto")
    , @NamedQuery(name = "Faseproyecto.findByFkProyecto", query = "SELECT f FROM Faseproyecto f WHERE f.fkProyecto = :fkProyecto")
    , @NamedQuery(name = "Faseproyecto.findByCodigo", query = "SELECT f FROM Faseproyecto f WHERE f.codigo = :codigo")
    , @NamedQuery(name = "Faseproyecto.findByNombre", query = "SELECT f FROM Faseproyecto f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "Faseproyecto.findByActivo", query = "SELECT f FROM Faseproyecto f WHERE f.activo = :activo")
    , @NamedQuery(name = "Faseproyecto.findByFechaCreacion", query = "SELECT f FROM Faseproyecto f WHERE f.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Faseproyecto.findByFechaModificacion", query = "SELECT f FROM Faseproyecto f WHERE f.fechaModificacion = :fechaModificacion")})
public class Faseproyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkFaseProyecto")
    private Long pkFaseProyecto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkProyecto")
    private long fkProyecto;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 250)
    @Column(name = "nombre")
    private String nombre;
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

    public Faseproyecto() {
    }

    public Faseproyecto(Long pkFaseProyecto) {
        this.pkFaseProyecto = pkFaseProyecto;
    }

    public Faseproyecto(Long pkFaseProyecto, long fkProyecto, short activo, Date fechaCreacion, Date fechaModificacion) {
        this.pkFaseProyecto = pkFaseProyecto;
        this.fkProyecto = fkProyecto;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkFaseProyecto() {
        return pkFaseProyecto;
    }

    public void setPkFaseProyecto(Long pkFaseProyecto) {
        this.pkFaseProyecto = pkFaseProyecto;
    }

    public long getFkProyecto() {
        return fkProyecto;
    }

    public void setFkProyecto(long fkProyecto) {
        this.fkProyecto = fkProyecto;
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
        hash += (pkFaseProyecto != null ? pkFaseProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faseproyecto)) {
            return false;
        }
        Faseproyecto other = (Faseproyecto) object;
        if ((this.pkFaseProyecto == null && other.pkFaseProyecto != null) || (this.pkFaseProyecto != null && !this.pkFaseProyecto.equals(other.pkFaseProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Faseproyecto[ pkFaseProyecto=" + pkFaseProyecto + " ]";
    }
    
}
