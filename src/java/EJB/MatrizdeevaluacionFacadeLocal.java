/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Matrizdeevaluacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface MatrizdeevaluacionFacadeLocal {

    void create(Matrizdeevaluacion matrizdeevaluacion);

    void edit(Matrizdeevaluacion matrizdeevaluacion);

    void remove(Matrizdeevaluacion matrizdeevaluacion);

    Matrizdeevaluacion find(Object id);

    List<Matrizdeevaluacion> findAll();

    List<Matrizdeevaluacion> findRange(int[] range);

    int count();
    
}
