/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Actividadaprendizaje;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface ActividadaprendizajeFacadeLocal {

    void create(Actividadaprendizaje actividadaprendizaje);

    void edit(Actividadaprendizaje actividadaprendizaje);

    void remove(Actividadaprendizaje actividadaprendizaje);

    Actividadaprendizaje find(Object id);

    List<Actividadaprendizaje> findAll();

    List<Actividadaprendizaje> findRange(int[] range);

    int count();
    
}
