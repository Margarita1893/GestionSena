/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Models.EncabezadoHasInstructores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marga
 */
@Stateless
public class EncabezadoHasInstructoresFacade extends AbstractFacade<EncabezadoHasInstructores> implements EncabezadoHasInstructoresFacadeLocal {

    @PersistenceContext(unitName = "GestionSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EncabezadoHasInstructoresFacade() {
        super(EncabezadoHasInstructores.class);
    }
    
}
