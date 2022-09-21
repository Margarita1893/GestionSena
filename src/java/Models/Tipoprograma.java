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
@Table(name = "tipoprograma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoprograma.findAll", query = "SELECT t FROM Tipoprograma t")
    , @NamedQuery(name = "Tipoprograma.findByPkTipoPrograma", query = "SELECT t FROM Tipoprograma t WHERE t.pkTipoPrograma = :pkTipoPrograma")
    , @NamedQuery(name = "Tipoprograma.findByCodigo", query = "SELECT t FROM Tipoprograma t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Tipoprograma.findByNombre", query = "SELECT t FROM Tipoprograma t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tipoprograma.findByActivo", query = "SELECT t FROM Tipoprograma t WHERE t.activo = :activo")
    , @NamedQuery(name = "Tipoprograma.findByFechaCreacion", query = "SELECT t FROM Tipoprograma t WHERE t.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Tipoprograma.findByFechaModificacion", query = "SELECT t FROM Tipoprograma t WHERE t.fechaModificacion = :fechaModificacion")})
public class Tipoprograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkTipoPrograma")
    private Long pkTipoPrograma;
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

    public Tipoprograma() {
    }

    public Tipoprograma(Long pkTipoPrograma) {
        this.pkTipoPrograma = pkTipoPrograma;
    }

    public Tipoprograma(Long pkTipoPrograma, String nombre, Date fechaCreacion, Date fechaModificacion) {
        this.pkTipoPrograma = pkTipoPrograma;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkTipoPrograma() {
        return pkTipoPrograma;
    }

    public void setPkTipoPrograma(Long pkTipoPrograma) {
        this.pkTipoPrograma = pkTipoPrograma;
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
        hash += (pkTipoPrograma != null ? pkTipoPrograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoprograma)) {
            return false;
        }
        Tipoprograma other = (Tipoprograma) object;
        if ((this.pkTipoPrograma == null && other.pkTipoPrograma != null) || (this.pkTipoPrograma != null && !this.pkTipoPrograma.equals(other.pkTipoPrograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Tipoprograma[ pkTipoPrograma=" + pkTipoPrograma + " ]";
    }
    
}
