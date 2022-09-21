/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Modalidadejecucion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface ModalidadejecucionFacadeLocal {

    void create(Modalidadejecucion modalidadejecucion);

    void edit(Modalidadejecucion modalidadejecucion);

    void remove(Modalidadejecucion modalidadejecucion);

    Modalidadejecucion find(Object id);

    List<Modalidadejecucion> findAll();

    List<Modalidadejecucion> findRange(int[] range);

    int count();
    
}
