/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.Estrategiasdidacticasactivas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marga
 */
@Stateless
public class EstrategiasdidacticasactivasFacade extends AbstractFacade<Estrategiasdidacticasactivas> implements EstrategiasdidacticasactivasFacadeLocal {

    @PersistenceContext(unitName = "GestionSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstrategiasdidacticasactivasFacade() {
        super(Estrategiasdidacticasactivas.class);
    }
    
}
