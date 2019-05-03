/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Ganadores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author quenan
 */
@Stateless
public class GanadoresFacade extends AbstractFacade<Ganadores> implements GanadoresFacadeLocal {
    @PersistenceContext(unitName = "Arq2corte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GanadoresFacade() {
        super(Ganadores.class);
    }
    
}
