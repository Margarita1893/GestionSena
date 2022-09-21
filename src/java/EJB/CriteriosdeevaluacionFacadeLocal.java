/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Criteriosdeevaluacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface CriteriosdeevaluacionFacadeLocal {

    void create(Criteriosdeevaluacion criteriosdeevaluacion);

    void edit(Criteriosdeevaluacion criteriosdeevaluacion);

    void remove(Criteriosdeevaluacion criteriosdeevaluacion);

    Criteriosdeevaluacion find(Object id);

    List<Criteriosdeevaluacion> findAll();

    List<Criteriosdeevaluacion> findRange(int[] range);

    int count();
    
}
