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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marga
 */
@Entity
@Table(name = "usuario_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioRol.findAll", query = "SELECT u FROM UsuarioRol u")
    , @NamedQuery(name = "UsuarioRol.findByPkUsuariorol", query = "SELECT u FROM UsuarioRol u WHERE u.pkUsuariorol = :pkUsuariorol")
    , @NamedQuery(name = "UsuarioRol.findByRolpkRol", query = "SELECT u FROM UsuarioRol u WHERE u.rolpkRol = :rolpkRol")
    , @NamedQuery(name = "UsuarioRol.findByUsuariopkUsuario", query = "SELECT u FROM UsuarioRol u WHERE u.usuariopkUsuario = :usuariopkUsuario")})
public class UsuarioRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkUsuario_rol")
    private Long pkUsuariorol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol_pkRol")
    private int rolpkRol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_pkUsuario")
    private long usuariopkUsuario;

    public UsuarioRol() {
    }

    public UsuarioRol(Long pkUsuariorol) {
        this.pkUsuariorol = pkUsuariorol;
    }

    public UsuarioRol(Long pkUsuariorol, int rolpkRol, long usuariopkUsuario) {
        this.pkUsuariorol = pkUsuariorol;
        this.rolpkRol = rolpkRol;
        this.usuariopkUsuario = usuariopkUsuario;
    }

    public Long getPkUsuariorol() {
        return pkUsuariorol;
    }

    public void setPkUsuariorol(Long pkUsuariorol) {
        this.pkUsuariorol = pkUsuariorol;
    }

    public int getRolpkRol() {
        return rolpkRol;
    }

    public void setRolpkRol(int rolpkRol) {
        this.rolpkRol = rolpkRol;
    }

    public long getUsuariopkUsuario() {
        return usuariopkUsuario;
    }

    public void setUsuariopkUsuario(long usuariopkUsuario) {
        this.usuariopkUsuario = usuariopkUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkUsuariorol != null ? pkUsuariorol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioRol)) {
            return false;
        }
        UsuarioRol other = (UsuarioRol) object;
        if ((this.pkUsuariorol == null && other.pkUsuariorol != null) || (this.pkUsuariorol != null && !this.pkUsuariorol.equals(other.pkUsuariorol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.UsuarioRol[ pkUsuariorol=" + pkUsuariorol + " ]";
    }
    
}
