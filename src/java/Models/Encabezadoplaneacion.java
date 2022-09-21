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
@Table(name = "encabezadoplaneacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encabezadoplaneacion.findAll", query = "SELECT e FROM Encabezadoplaneacion e")
    , @NamedQuery(name = "Encabezadoplaneacion.findByPkEncabezadoPlaneacion", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.pkEncabezadoPlaneacion = :pkEncabezadoPlaneacion")
    , @NamedQuery(name = "Encabezadoplaneacion.findByFkPrograma", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.fkPrograma = :fkPrograma")
    , @NamedQuery(name = "Encabezadoplaneacion.findByFkUsuario", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.fkUsuario = :fkUsuario")
    , @NamedQuery(name = "Encabezadoplaneacion.findByCodigo", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.codigo = :codigo")
    , @NamedQuery(name = "Encabezadoplaneacion.findByNombre", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Encabezadoplaneacion.findByFecha", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.fecha = :fecha")
    , @NamedQuery(name = "Encabezadoplaneacion.findByActivo", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.activo = :activo")
    , @NamedQuery(name = "Encabezadoplaneacion.findByFechaCreacion", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Encabezadoplaneacion.findByFechaModificacion", query = "SELECT e FROM Encabezadoplaneacion e WHERE e.fechaModificacion = :fechaModificacion")})
public class Encabezadoplaneacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkEncabezadoPlaneacion")
    private Long pkEncabezadoPlaneacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkPrograma")
    private long fkPrograma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkUsuario")
    private long fkUsuario;
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
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
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

    public Encabezadoplaneacion() {
    }

    public Encabezadoplaneacion(Long pkEncabezadoPlaneacion) {
        this.pkEncabezadoPlaneacion = pkEncabezadoPlaneacion;
    }

    public Encabezadoplaneacion(Long pkEncabezadoPlaneacion, long fkPrograma, long fkUsuario, String nombre, Date fecha, short activo, Date fechaCreacion, Date fechaModificacion) {
        this.pkEncabezadoPlaneacion = pkEncabezadoPlaneacion;
        this.fkPrograma = fkPrograma;
        this.fkUsuario = fkUsuario;
        this.nombre = nombre;
        this.fecha = fecha;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getPkEncabezadoPlaneacion() {
        return pkEncabezadoPlaneacion;
    }

    public void setPkEncabezadoPlaneacion(Long pkEncabezadoPlaneacion) {
        this.pkEncabezadoPlaneacion = pkEncabezadoPlaneacion;
    }

    public long getFkPrograma() {
        return fkPrograma;
    }

    public void setFkPrograma(long fkPrograma) {
        this.fkPrograma = fkPrograma;
    }

    public long getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(long fkUsuario) {
        this.fkUsuario = fkUsuario;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash += (pkEncabezadoPlaneacion != null ? pkEncabezadoPlaneacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encabezadoplaneacion)) {
            return false;
        }
        Encabezadoplaneacion other = (Encabezadoplaneacion) object;
        if ((this.pkEncabezadoPlaneacion == null && other.pkEncabezadoPlaneacion != null) || (this.pkEncabezadoPlaneacion != null && !this.pkEncabezadoPlaneacion.equals(other.pkEncabezadoPlaneacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Encabezadoplaneacion[ pkEncabezadoPlaneacion=" + pkEncabezadoPlaneacion + " ]";
    }
    
}
