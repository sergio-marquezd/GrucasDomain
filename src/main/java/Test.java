
import com.grucas.domain.model.Usuario;
import com.grucas.domain.services.UnidadNegocioService;
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
        
//        UsuarioService service = new UsuarioService();
//        service.login("cdeantes", "cdeantes12", 1001);
//        Usuario user = service.getObject();
//        
//        System.out.println(" ROL " + user.getRol());
//        System.out.println(" PERMISOS " + user.getPermisos());
//        System.out.println(" TIPO " + user.getTipo());
//        System.out.println(" PERMISOS " + user.getUnidad());
//        System.out.println(" EMPRESA " + user.getEmpresa());
//        
//        System.out.println("RESPUESTA:   " + service.getNotification())

        Usuario user = new Usuario();
        user.setId(28);
        user.setTodas_unidades(true);

        UnidadNegocioService service = new UnidadNegocioService();
        service.getUnidadesPorUsuarioSistema(user, 1001);
        System.out.println("Unidades:" + service.getObjects().toString());

    }
    
}
