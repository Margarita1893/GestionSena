/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Instructores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface InstructoresFacadeLocal {

    void create(Instructores instructores);

    void edit(Instructores instructores);

    void remove(Instructores instructores);

    Instructores find(Object id);

    List<Instructores> findAll();

    List<Instructores> findRange(int[] range);

    int count();
    
}
