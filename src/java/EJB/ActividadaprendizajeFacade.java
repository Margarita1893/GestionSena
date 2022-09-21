/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Actividadaprendizaje;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marga
 */
@Stateless
public class ActividadaprendizajeFacade extends AbstractFacade<Actividadaprendizaje> implements ActividadaprendizajeFacadeLocal {

    @PersistenceContext(unitName = "GestionSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActividadaprendizajeFacade() {
        super(Actividadaprendizaje.class);
    }
    
}
