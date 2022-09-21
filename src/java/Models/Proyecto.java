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
@Table(name = "proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p")
    , @NamedQuery(name = "Proyecto.findByPkProyecto", query = "SELECT p FROM Proyecto p WHERE p.pkProyecto = :pkProyecto")
    , @NamedQuery(name = "Proyecto.findByFkPrograma", query = "SELECT p FROM Proyecto p WHERE p.fkPrograma = :fkPrograma")
    , @NamedQuery(name = "Proyecto.findByCodigo", query = "SELECT p FROM Proyecto p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Proyecto.findByCodigoProyecto", query = "SELECT p FROM Proyecto p WHERE p.codigoProyecto = :codigoProyecto")
    , @NamedQuery(name = "Proyecto.findByNombre", query = "SELECT p FROM Proyecto p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Proyecto.findByActivo", query = "SELECT p FROM Proyecto p WHERE p.activo = :activo")
    , @NamedQuery(name = "Proyecto.findByFechaCreacion", query = "SELECT p FROM Proyecto p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Proyecto.findByFechaModificacion", query = "SELECT p FROM Proyecto p WHERE p.fechaModificacion = :fechaModificacion")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkProyecto")
    private Long pkProyecto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkPrograma")
    private long fkPrograma;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "codigoProyecto")
    private String codigoProyecto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
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

    public Proyecto() {
    }

    public Proyecto(Long pkProyecto) {
        this.pkProyecto = pkProyecto;
    }

    public Proyecto(Long pkProyecto, long fkPrograma, String codigoProyecto, String nombre, Date fechaCreacion, Date fechaModificacion) {
        this.pkProyecto = pkProyecto;
        this.fkPrograma = fkPrograma;
        this.codigoProyecto = codigoProyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkProyecto() {
        return pkProyecto;
    }

    public void setPkProyecto(Long pkProyecto) {
        this.pkProyecto = pkProyecto;
    }

    public long getFkPrograma() {
        return fkPrograma;
    }

    public void setFkPrograma(long fkPrograma) {
        this.fkPrograma = fkPrograma;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
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
        hash += (pkProyecto != null ? pkProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.pkProyecto == null && other.pkProyecto != null) || (this.pkProyecto != null && !this.pkProyecto.equals(other.pkProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Proyecto[ pkProyecto=" + pkProyecto + " ]";
    }
    
}
