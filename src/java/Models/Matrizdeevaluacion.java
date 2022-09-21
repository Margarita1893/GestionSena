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
@Table(name = "matrizdeevaluacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matrizdeevaluacion.findAll", query = "SELECT m FROM Matrizdeevaluacion m")
    , @NamedQuery(name = "Matrizdeevaluacion.findByPkMatrizdeEvaluacion", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.pkMatrizdeEvaluacion = :pkMatrizdeEvaluacion")
    , @NamedQuery(name = "Matrizdeevaluacion.findByCodigo", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "Matrizdeevaluacion.findByHorasDeTrabajoDirecto", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.horasDeTrabajoDirecto = :horasDeTrabajoDirecto")
    , @NamedQuery(name = "Matrizdeevaluacion.findByHorasDeTrabajoIndependiente", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.horasDeTrabajoIndependiente = :horasDeTrabajoIndependiente")
    , @NamedQuery(name = "Matrizdeevaluacion.findByMatrizDeEvaluacioncol", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.matrizDeEvaluacioncol = :matrizDeEvaluacioncol")
    , @NamedQuery(name = "Matrizdeevaluacion.findByEstrategiasDidacticasActivaspkEstrategiasDdacticasActivas", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.estrategiasDidacticasActivaspkEstrategiasDdacticasActivas = :estrategiasDidacticasActivaspkEstrategiasDdacticasActivas")
    , @NamedQuery(name = "Matrizdeevaluacion.findByEncabezadoPlaneacionpkEncabezadoPlaneacion", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.encabezadoPlaneacionpkEncabezadoPlaneacion = :encabezadoPlaneacionpkEncabezadoPlaneacion")
    , @NamedQuery(name = "Matrizdeevaluacion.findByCriteriosDeEvaluacionpkCriteriosDeEvaluacion", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.criteriosDeEvaluacionpkCriteriosDeEvaluacion = :criteriosDeEvaluacionpkCriteriosDeEvaluacion")
    , @NamedQuery(name = "Matrizdeevaluacion.findByInstructoresResponsablesidInstructoresResponsables", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.instructoresResponsablesidInstructoresResponsables = :instructoresResponsablesidInstructoresResponsables")
    , @NamedQuery(name = "Matrizdeevaluacion.findByAmbientesAprendizajepkAmbientesAprendizaje", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.ambientesAprendizajepkAmbientesAprendizaje = :ambientesAprendizajepkAmbientesAprendizaje")
    , @NamedQuery(name = "Matrizdeevaluacion.findByResultadoAprendizajepkResultadoAprendizaje", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.resultadoAprendizajepkResultadoAprendizaje = :resultadoAprendizajepkResultadoAprendizaje")
    , @NamedQuery(name = "Matrizdeevaluacion.findByActividadAprendizajepkActividadAprendizaje", query = "SELECT m FROM Matrizdeevaluacion m WHERE m.actividadAprendizajepkActividadAprendizaje = :actividadAprendizajepkActividadAprendizaje")})
public class Matrizdeevaluacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkMatrizdeEvaluacion")
    private Integer pkMatrizdeEvaluacion;
    @Size(max = 20)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 20)
    @Column(name = "horasDeTrabajoDirecto")
    private String horasDeTrabajoDirecto;
    @Size(max = 20)
    @Column(name = "horasDeTrabajoIndependiente")
    private String horasDeTrabajoIndependiente;
    @Size(max = 45)
    @Column(name = "MatrizDeEvaluacioncol")
    private String matrizDeEvaluacioncol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstrategiasDidacticasActivas_pkEstrategiasDdacticasActivas")
    private int estrategiasDidacticasActivaspkEstrategiasDdacticasActivas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EncabezadoPlaneacion_pkEncabezadoPlaneacion")
    private long encabezadoPlaneacionpkEncabezadoPlaneacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CriteriosDeEvaluacion_pkCriteriosDeEvaluacion")
    private int criteriosDeEvaluacionpkCriteriosDeEvaluacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "InstructoresResponsables_idInstructoresResponsables")
    private int instructoresResponsablesidInstructoresResponsables;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmbientesAprendizaje_pkAmbientesAprendizaje")
    private int ambientesAprendizajepkAmbientesAprendizaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ResultadoAprendizaje_pkResultadoAprendizaje")
    private long resultadoAprendizajepkResultadoAprendizaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ActividadAprendizaje_pkActividadAprendizaje")
    private long actividadAprendizajepkActividadAprendizaje;

    public Matrizdeevaluacion() {
    }

    public Matrizdeevaluacion(Integer pkMatrizdeEvaluacion) {
        this.pkMatrizdeEvaluacion = pkMatrizdeEvaluacion;
    }

    public Matrizdeevaluacion(Integer pkMatrizdeEvaluacion, int estrategiasDidacticasActivaspkEstrategiasDdacticasActivas, long encabezadoPlaneacionpkEncabezadoPlaneacion, int criteriosDeEvaluacionpkCriteriosDeEvaluacion, int instructoresResponsablesidInstructoresResponsables, int ambientesAprendizajepkAmbientesAprendizaje, long resultadoAprendizajepkResultadoAprendizaje, long actividadAprendizajepkActividadAprendizaje) {
        this.pkMatrizdeEvaluacion = pkMatrizdeEvaluacion;
        this.estrategiasDidacticasActivaspkEstrategiasDdacticasActivas = estrategiasDidacticasActivaspkEstrategiasDdacticasActivas;
        this.encabezadoPlaneacionpkEncabezadoPlaneacion = encabezadoPlaneacionpkEncabezadoPlaneacion;
        this.criteriosDeEvaluacionpkCriteriosDeEvaluacion = criteriosDeEvaluacionpkCriteriosDeEvaluacion;
        this.instructoresResponsablesidInstructoresResponsables = instructoresResponsablesidInstructoresResponsables;
        this.ambientesAprendizajepkAmbientesAprendizaje = ambientesAprendizajepkAmbientesAprendizaje;
        this.resultadoAprendizajepkResultadoAprendizaje = resultadoAprendizajepkResultadoAprendizaje;
        this.actividadAprendizajepkActividadAprendizaje = actividadAprendizajepkActividadAprendizaje;
    }

    public Integer getPkMatrizdeEvaluacion() {
        return pkMatrizdeEvaluacion;
    }

    public void setPkMatrizdeEvaluacion(Integer pkMatrizdeEvaluacion) {
        this.pkMatrizdeEvaluacion = pkMatrizdeEvaluacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorasDeTrabajoDirecto() {
        return horasDeTrabajoDirecto;
    }

    public void setHorasDeTrabajoDirecto(String horasDeTrabajoDirecto) {
        this.horasDeTrabajoDirecto = horasDeTrabajoDirecto;
    }

    public String getHorasDeTrabajoIndependiente() {
        return horasDeTrabajoIndependiente;
    }

    public void setHorasDeTrabajoIndependiente(String horasDeTrabajoIndependiente) {
        this.horasDeTrabajoIndependiente = horasDeTrabajoIndependiente;
    }

    public String getMatrizDeEvaluacioncol() {
        return matrizDeEvaluacioncol;
    }

    public void setMatrizDeEvaluacioncol(String matrizDeEvaluacioncol) {
        this.matrizDeEvaluacioncol = matrizDeEvaluacioncol;
    }

    public int getEstrategiasDidacticasActivaspkEstrategiasDdacticasActivas() {
        return estrategiasDidacticasActivaspkEstrategiasDdacticasActivas;
    }

    public void setEstrategiasDidacticasActivaspkEstrategiasDdacticasActivas(int estrategiasDidacticasActivaspkEstrategiasDdacticasActivas) {
        this.estrategiasDidacticasActivaspkEstrategiasDdacticasActivas = estrategiasDidacticasActivaspkEstrategiasDdacticasActivas;
    }

    public long getEncabezadoPlaneacionpkEncabezadoPlaneacion() {
        return encabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    public void setEncabezadoPlaneacionpkEncabezadoPlaneacion(long encabezadoPlaneacionpkEncabezadoPlaneacion) {
        this.encabezadoPlaneacionpkEncabezadoPlaneacion = encabezadoPlaneacionpkEncabezadoPlaneacion;
    }

    public int getCriteriosDeEvaluacionpkCriteriosDeEvaluacion() {
        return criteriosDeEvaluacionpkCriteriosDeEvaluacion;
    }

    public void setCriteriosDeEvaluacionpkCriteriosDeEvaluacion(int criteriosDeEvaluacionpkCriteriosDeEvaluacion) {
        this.criteriosDeEvaluacionpkCriteriosDeEvaluacion = criteriosDeEvaluacionpkCriteriosDeEvaluacion;
    }

    public int getInstructoresResponsablesidInstructoresResponsables() {
        return instructoresResponsablesidInstructoresResponsables;
    }

    public void setInstructoresResponsablesidInstructoresResponsables(int instructoresResponsablesidInstructoresResponsables) {
        this.instructoresResponsablesidInstructoresResponsables = instructoresResponsablesidInstructoresResponsables;
    }

    public int getAmbientesAprendizajepkAmbientesAprendizaje() {
        return ambientesAprendizajepkAmbientesAprendizaje;
    }

    public void setAmbientesAprendizajepkAmbientesAprendizaje(int ambientesAprendizajepkAmbientesAprendizaje) {
        this.ambientesAprendizajepkAmbientesAprendizaje = ambientesAprendizajepkAmbientesAprendizaje;
    }

    public long getResultadoAprendizajepkResultadoAprendizaje() {
        return resultadoAprendizajepkResultadoAprendizaje;
    }

    public void setResultadoAprendizajepkResultadoAprendizaje(long resultadoAprendizajepkResultadoAprendizaje) {
        this.resultadoAprendizajepkResultadoAprendizaje = resultadoAprendizajepkResultadoAprendizaje;
    }

    public long getActividadAprendizajepkActividadAprendizaje() {
        return actividadAprendizajepkActividadAprendizaje;
    }

    public void setActividadAprendizajepkActividadAprendizaje(long actividadAprendizajepkActividadAprendizaje) {
        this.actividadAprendizajepkActividadAprendizaje = actividadAprendizajepkActividadAprendizaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkMatrizdeEvaluacion != null ? pkMatrizdeEvaluacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matrizdeevaluacion)) {
            return false;
        }
        Matrizdeevaluacion other = (Matrizdeevaluacion) object;
        if ((this.pkMatrizdeEvaluacion == null && other.pkMatrizdeEvaluacion != null) || (this.pkMatrizdeEvaluacion != null && !this.pkMatrizdeEvaluacion.equals(other.pkMatrizdeEvaluacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Matrizdeevaluacion[ pkMatrizdeEvaluacion=" + pkMatrizdeEvaluacion + " ]";
    }
    
}
