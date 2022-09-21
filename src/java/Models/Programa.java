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
@Table(name = "programa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programa.findAll", query = "SELECT p FROM Programa p")
    , @NamedQuery(name = "Programa.findByPkPrograma", query = "SELECT p FROM Programa p WHERE p.pkPrograma = :pkPrograma")
    , @NamedQuery(name = "Programa.findByFkTipoPrograma", query = "SELECT p FROM Programa p WHERE p.fkTipoPrograma = :fkTipoPrograma")
    , @NamedQuery(name = "Programa.findByFkModalidadEjecucion", query = "SELECT p FROM Programa p WHERE p.fkModalidadEjecucion = :fkModalidadEjecucion")
    , @NamedQuery(name = "Programa.findByVersion", query = "SELECT p FROM Programa p WHERE p.version = :version")
    , @NamedQuery(name = "Programa.findByCodigo", query = "SELECT p FROM Programa p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Programa.findByNombre", query = "SELECT p FROM Programa p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Programa.findByActivo", query = "SELECT p FROM Programa p WHERE p.activo = :activo")
    , @NamedQuery(name = "Programa.findByFechaCreacion", query = "SELECT p FROM Programa p WHERE p.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Programa.findByFechaModificacion", query = "SELECT p FROM Programa p WHERE p.fechaModificacion = :fechaModificacion")})
public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkPrograma")
    private Long pkPrograma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkTipoPrograma")
    private long fkTipoPrograma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkModalidadEjecucion")
    private long fkModalidadEjecucion;
    @Size(max = 45)
    @Column(name = "version")
    private String version;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
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

    public Programa() {
    }

    public Programa(Long pkPrograma) {
        this.pkPrograma = pkPrograma;
    }

    public Programa(Long pkPrograma, long fkTipoPrograma, long fkModalidadEjecucion, String nombre, short activo, Date fechaCreacion, Date fechaModificacion) {
        this.pkPrograma = pkPrograma;
        this.fkTipoPrograma = fkTipoPrograma;
        this.fkModalidadEjecucion = fkModalidadEjecucion;
        this.nombre = nombre;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkPrograma() {
        return pkPrograma;
    }

    public void setPkPrograma(Long pkPrograma) {
        this.pkPrograma = pkPrograma;
    }

    public long getFkTipoPrograma() {
        return fkTipoPrograma;
    }

    public void setFkTipoPrograma(long fkTipoPrograma) {
        this.fkTipoPrograma = fkTipoPrograma;
    }

    public long getFkModalidadEjecucion() {
        return fkModalidadEjecucion;
    }

    public void setFkModalidadEjecucion(long fkModalidadEjecucion) {
        this.fkModalidadEjecucion = fkModalidadEjecucion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
        hash += (pkPrograma != null ? pkPrograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
        if ((this.pkPrograma == null && other.pkPrograma != null) || (this.pkPrograma != null && !this.pkPrograma.equals(other.pkPrograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Programa[ pkPrograma=" + pkPrograma + " ]";
    }
    
}
