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
@Table(name = "competencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Competencia.findAll", query = "SELECT c FROM Competencia c")
    , @NamedQuery(name = "Competencia.findByPkCompetencia", query = "SELECT c FROM Competencia c WHERE c.pkCompetencia = :pkCompetencia")
    , @NamedQuery(name = "Competencia.findByFkPrograma", query = "SELECT c FROM Competencia c WHERE c.fkPrograma = :fkPrograma")
    , @NamedQuery(name = "Competencia.findByCodigo", query = "SELECT c FROM Competencia c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Competencia.findByNombre", query = "SELECT c FROM Competencia c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Competencia.findByActivo", query = "SELECT c FROM Competencia c WHERE c.activo = :activo")
    , @NamedQuery(name = "Competencia.findByFechaCreacion", query = "SELECT c FROM Competencia c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Competencia.findByFechaModificacion", query = "SELECT c FROM Competencia c WHERE c.fechaModificacion = :fechaModificacion")})
public class Competencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkCompetencia")
    private Long pkCompetencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkPrograma")
    private long fkPrograma;
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
    @Column(name = "fechaCreacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fechaModificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;

    public Competencia() {
    }

    public Competencia(Long pkCompetencia) {
        this.pkCompetencia = pkCompetencia;
    }

    public Competencia(Long pkCompetencia, long fkPrograma, String nombre, short activo) {
        this.pkCompetencia = pkCompetencia;
        this.fkPrograma = fkPrograma;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Long getPkCompetencia() {
        return pkCompetencia;
    }

    public void setPkCompetencia(Long pkCompetencia) {
        this.pkCompetencia = pkCompetencia;
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
        hash += (pkCompetencia != null ? pkCompetencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Competencia)) {
            return false;
        }
        Competencia other = (Competencia) object;
        if ((this.pkCompetencia == null && other.pkCompetencia != null) || (this.pkCompetencia != null && !this.pkCompetencia.equals(other.pkCompetencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Competencia[ pkCompetencia=" + pkCompetencia + " ]";
    }
    
}
