/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Rifa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author quenan
 */
@Stateless
public class RifaFacade extends AbstractFacade<Rifa> implements RifaFacadeLocal {
    @PersistenceContext(unitName = "Arq2corte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RifaFacade() {
        super(Rifa.class);
    }
    
}
