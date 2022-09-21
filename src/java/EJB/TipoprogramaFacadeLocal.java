/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Tipoprograma;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface TipoprogramaFacadeLocal {

    void create(Tipoprograma tipoprograma);

    void edit(Tipoprograma tipoprograma);

    void remove(Tipoprograma tipoprograma);

    Tipoprograma find(Object id);

    List<Tipoprograma> findAll();

    List<Tipoprograma> findRange(int[] range);

    int count();
    
}
