/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Actividadproyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface ActividadproyectoFacadeLocal {

    void create(Actividadproyecto actividadproyecto);

    void edit(Actividadproyecto actividadproyecto);

    void remove(Actividadproyecto actividadproyecto);

    Actividadproyecto find(Object id);

    List<Actividadproyecto> findAll();

    List<Actividadproyecto> findRange(int[] range);

    int count();
    
}
