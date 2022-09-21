/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.EncabezadoHasInstructores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface EncabezadoHasInstructoresFacadeLocal {

    void create(EncabezadoHasInstructores encabezadoHasInstructores);

    void edit(EncabezadoHasInstructores encabezadoHasInstructores);

    void remove(EncabezadoHasInstructores encabezadoHasInstructores);

    EncabezadoHasInstructores find(Object id);

    List<EncabezadoHasInstructores> findAll();

    List<EncabezadoHasInstructores> findRange(int[] range);

    int count();
    
}
