/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Faseproyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface FaseproyectoFacadeLocal {

    void create(Faseproyecto faseproyecto);

    void edit(Faseproyecto faseproyecto);

    void remove(Faseproyecto faseproyecto);

    Faseproyecto find(Object id);

    List<Faseproyecto> findAll();

    List<Faseproyecto> findRange(int[] range);

    int count();
    
}
