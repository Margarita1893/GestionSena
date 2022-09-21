/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Criteriosdeevaluacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marga
 */
@Stateless
public class CriteriosdeevaluacionFacade extends AbstractFacade<Criteriosdeevaluacion> implements CriteriosdeevaluacionFacadeLocal {

    @PersistenceContext(unitName = "GestionSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CriteriosdeevaluacionFacade() {
        super(Criteriosdeevaluacion.class);
    }
    
}
