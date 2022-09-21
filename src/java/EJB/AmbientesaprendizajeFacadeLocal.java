/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Ambientesaprendizaje;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface AmbientesaprendizajeFacadeLocal {

    void create(Ambientesaprendizaje ambientesaprendizaje);

    void edit(Ambientesaprendizaje ambientesaprendizaje);

    void remove(Ambientesaprendizaje ambientesaprendizaje);

    Ambientesaprendizaje find(Object id);

    List<Ambientesaprendizaje> findAll();

    List<Ambientesaprendizaje> findRange(int[] range);

    int count();
    
}
