/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Resultadoaprendizaje;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface ResultadoaprendizajeFacadeLocal {

    void create(Resultadoaprendizaje resultadoaprendizaje);

    void edit(Resultadoaprendizaje resultadoaprendizaje);

    void remove(Resultadoaprendizaje resultadoaprendizaje);

    Resultadoaprendizaje find(Object id);

    List<Resultadoaprendizaje> findAll();

    List<Resultadoaprendizaje> findRange(int[] range);

    int count();
    
}
