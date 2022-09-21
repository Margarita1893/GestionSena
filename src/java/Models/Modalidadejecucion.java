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
@Table(name = "modalidadejecucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modalidadejecucion.findAll", query = "SELECT m FROM Modalidadejecucion m")
    , @NamedQuery(name = "Modalidadejecucion.findByPkModalidadEjecucion", query = "SELECT m FROM Modalidadejecucion m WHERE m.pkModalidadEjecucion = :pkModalidadEjecucion")
    , @NamedQuery(name = "Modalidadejecucion.findByCodigo", query = "SELECT m FROM Modalidadejecucion m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "Modalidadejecucion.findByNombre", query = "SELECT m FROM Modalidadejecucion m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Modalidadejecucion.findByActivo", query = "SELECT m FROM Modalidadejecucion m WHERE m.activo = :activo")
    , @NamedQuery(name = "Modalidadejecucion.findByFechaCreacion", query = "SELECT m FROM Modalidadejecucion m WHERE m.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Modalidadejecucion.findByFechaModificacion", query = "SELECT m FROM Modalidadejecucion m WHERE m.fechaModificacion = :fechaModificacion")})
public class Modalidadejecucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkModalidadEjecucion")
    private Long pkModalidadEjecucion;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
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

    public Modalidadejecucion() {
    }

    public Modalidadejecucion(Long pkModalidadEjecucion) {
        this.pkModalidadEjecucion = pkModalidadEjecucion;
    }

    public Modalidadejecucion(Long pkModalidadEjecucion, String nombre, Date fechaCreacion, Date fechaModificacion) {
        this.pkModalidadEjecucion = pkModalidadEjecucion;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkModalidadEjecucion() {
        return pkModalidadEjecucion;
    }

    public void setPkModalidadEjecucion(Long pkModalidadEjecucion) {
        this.pkModalidadEjecucion = pkModalidadEjecucion;
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
        hash += (pkModalidadEjecucion != null ? pkModalidadEjecucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modalidadejecucion)) {
            return false;
        }
        Modalidadejecucion other = (Modalidadejecucion) object;
        if ((this.pkModalidadEjecucion == null && other.pkModalidadEjecucion != null) || (this.pkModalidadEjecucion != null && !this.pkModalidadEjecucion.equals(other.pkModalidadEjecucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Modalidadejecucion[ pkModalidadEjecucion=" + pkModalidadEjecucion + " ]";
    }
    
}
