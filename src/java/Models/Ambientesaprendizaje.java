/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marga
 */
@Entity
@Table(name = "ambientesaprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ambientesaprendizaje.findAll", query = "SELECT a FROM Ambientesaprendizaje a")
    , @NamedQuery(name = "Ambientesaprendizaje.findByPkAmbientesAprendizaje", query = "SELECT a FROM Ambientesaprendizaje a WHERE a.pkAmbientesAprendizaje = :pkAmbientesAprendizaje")
    , @NamedQuery(name = "Ambientesaprendizaje.findByCodigo", query = "SELECT a FROM Ambientesaprendizaje a WHERE a.codigo = :codigo")
    , @NamedQuery(name = "Ambientesaprendizaje.findByAmbiente", query = "SELECT a FROM Ambientesaprendizaje a WHERE a.ambiente = :ambiente")
    , @NamedQuery(name = "Ambientesaprendizaje.findByMaterialFomacion", query = "SELECT a FROM Ambientesaprendizaje a WHERE a.materialFomacion = :materialFomacion")})
public class Ambientesaprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkAmbientesAprendizaje")
    private Integer pkAmbientesAprendizaje;
    @Size(max = 45)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 45)
    @Column(name = "ambiente")
    private String ambiente;
    @Size(max = 200)
    @Column(name = "materialFomacion")
    private String materialFomacion;

    public Ambientesaprendizaje() {
    }

    public Ambientesaprendizaje(Integer pkAmbientesAprendizaje) {
        this.pkAmbientesAprendizaje = pkAmbientesAprendizaje;
    }

    public Integer getPkAmbientesAprendizaje() {
        return pkAmbientesAprendizaje;
    }

    public void setPkAmbientesAprendizaje(Integer pkAmbientesAprendizaje) {
        this.pkAmbientesAprendizaje = pkAmbientesAprendizaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getMaterialFomacion() {
        return materialFomacion;
    }

    public void setMaterialFomacion(String materialFomacion) {
        this.materialFomacion = materialFomacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkAmbientesAprendizaje != null ? pkAmbientesAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ambientesaprendizaje)) {
            return false;
        }
        Ambientesaprendizaje other = (Ambientesaprendizaje) object;
        if ((this.pkAmbientesAprendizaje == null && other.pkAmbientesAprendizaje != null) || (this.pkAmbientesAprendizaje != null && !this.pkAmbientesAprendizaje.equals(other.pkAmbientesAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Ambientesaprendizaje[ pkAmbientesAprendizaje=" + pkAmbientesAprendizaje + " ]";
    }
    
}
