/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Competencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface CompetenciaFacadeLocal {

    void create(Competencia competencia);

    void edit(Competencia competencia);

    void remove(Competencia competencia);

    Competencia find(Object id);

    List<Competencia> findAll();

    List<Competencia> findRange(int[] range);

    int count();
    
}
