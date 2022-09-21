/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author marga
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements Serializable {

    @PersistenceContext(unitName = "GestionSenaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario acceder(Usuario us){
        Usuario usuario = null;
        String consulta="";
        try{
        
            consulta="Select u from Usuario u where u.usuario=?1 and u.pass=?2";
            Query query =em.createQuery(consulta);
            query.setParameter(1,us.getCorreo());
            query.setParameter(2,us.getContrasena());
            List<Usuario> lista = query.getResultList();
           if(lista.isEmpty()){
               usuario=lista.get(0);
            } 
    }catch(Exception ex){
        throw ex;
    }
        return usuario;
    }
}
