package es.etg.prog.mvc.model;

import es.etg.prog.mvc.model.db.InstitutoDAOImp;
import es.etg.prog.mvc.model.mock.InstitutoMock;

/**
 * Permite instanciar el modelo en modo de acceso a Base de datos u objetos simulados (mocks)
 */
public class InstitutoFactory {
    
    private static Instituto instituto;

    private static void inicializar(Acceso acceso){

        if(Acceso.DATABASE.equals(acceso)){
            instituto = new InstitutoDAOImp();
        }else{
            instituto =  new InstitutoMock();
        }

    }

    public static Instituto obtener(){
        return obtener(Acceso.MOCK);
    }

    public static Instituto obtener(Acceso acceso){
        if(instituto == null){
            inicializar(acceso);
        }

        return instituto;
            
    }
}
