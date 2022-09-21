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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marga
 */
@Entity
@Table(name = "instructores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instructores.findAll", query = "SELECT i FROM Instructores i")
    , @NamedQuery(name = "Instructores.findByPkInstructor", query = "SELECT i FROM Instructores i WHERE i.pkInstructor = :pkInstructor")
    , @NamedQuery(name = "Instructores.findByCodigo", query = "SELECT i FROM Instructores i WHERE i.codigo = :codigo")
    , @NamedQuery(name = "Instructores.findByNombre", query = "SELECT i FROM Instructores i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Instructores.findByApellido", query = "SELECT i FROM Instructores i WHERE i.apellido = :apellido")
    , @NamedQuery(name = "Instructores.findByIdentificacion", query = "SELECT i FROM Instructores i WHERE i.identificacion = :identificacion")
    , @NamedQuery(name = "Instructores.findByCorreo", query = "SELECT i FROM Instructores i WHERE i.correo = :correo")})
public class Instructores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkInstructor")
    private Integer pkInstructor;
    @Size(max = 45)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 60)
    @Column(name = "Apellido")
    private String apellido;
    @Size(max = 45)
    @Column(name = "identificacion")
    private String identificacion;
    @Size(max = 45)
    @Column(name = "Correo")
    private String correo;

    public Instructores() {
    }

    public Instructores(Integer pkInstructor) {
        this.pkInstructor = pkInstructor;
    }

    public Integer getPkInstructor() {
        return pkInstructor;
    }

    public void setPkInstructor(Integer pkInstructor) {
        this.pkInstructor = pkInstructor;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkInstructor != null ? pkInstructor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instructores)) {
            return false;
        }
        Instructores other = (Instructores) object;
        if ((this.pkInstructor == null && other.pkInstructor != null) || (this.pkInstructor != null && !this.pkInstructor.equals(other.pkInstructor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Instructores[ pkInstructor=" + pkInstructor + " ]";
    }
    
}
