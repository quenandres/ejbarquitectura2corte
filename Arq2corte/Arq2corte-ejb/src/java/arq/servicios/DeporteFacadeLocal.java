/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arq.servicios;

import arq.pojos.Deporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author quenan
 */
@Local
public interface DeporteFacadeLocal {

    void create(Deporte deporte);

    void edit(Deporte deporte);

    void remove(Deporte deporte);

    Deporte find(Object id);

    List<Deporte> findAll();

    List<Deporte> findRange(int[] range);

    int count();
    
}
