
import com.grucas.domain.model.Usuario;
import com.grucas.domain.services.UsuarioService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GrucasDev
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UsuarioService service = new UsuarioService();
        service.login("a", "a", 1001);
        Usuario user = service.getObject();
        
        System.out.println("RESPUESTA:   " + service.getNotification());
        
    }
    
}
