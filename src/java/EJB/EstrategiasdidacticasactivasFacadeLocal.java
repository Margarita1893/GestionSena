/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Estrategiasdidacticasactivas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marga
 */
@Local
public interface EstrategiasdidacticasactivasFacadeLocal {

    void create(Estrategiasdidacticasactivas estrategiasdidacticasactivas);

    void edit(Estrategiasdidacticasactivas estrategiasdidacticasactivas);

    void remove(Estrategiasdidacticasactivas estrategiasdidacticasactivas);

    Estrategiasdidacticasactivas find(Object id);

    List<Estrategiasdidacticasactivas> findAll();

    List<Estrategiasdidacticasactivas> findRange(int[] range);

    int count();
    
}
