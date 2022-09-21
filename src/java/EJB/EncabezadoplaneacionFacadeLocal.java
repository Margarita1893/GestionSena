/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Encabezadoplaneacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface EncabezadoplaneacionFacadeLocal {

    void create(Encabezadoplaneacion encabezadoplaneacion);

    void edit(Encabezadoplaneacion encabezadoplaneacion);

    void remove(Encabezadoplaneacion encabezadoplaneacion);

    Encabezadoplaneacion find(Object id);

    List<Encabezadoplaneacion> findAll();

    List<Encabezadoplaneacion> findRange(int[] range);

    int count();
    
}
