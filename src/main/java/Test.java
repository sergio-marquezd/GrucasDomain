
import com.grucas.domain.model.Cliente;
import com.grucas.domain.model.Usuario;
import com.grucas.domain.services.ClienteService;
import com.grucas.domain.services.ProductoServicioService;
import com.grucas.domain.services.UsuarioService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
    public static void main(String[] args) throws UnknownHostException {

//        UsuarioService service = new UsuarioService();
//        service.login("a", "a", 1001);
//        Usuario user = service.getObject();
//        
//        System.out.println(" ROL " + user.getRol());
//        System.out.println(" PERMISOS " + user.getPermisos());
//        System.out.println(" TIPO " + user.getTipo());
//        System.out.println(" PERMISOS " + user.getUnidad());
//        System.out.println(" EMPRESA " + user.getEmpresa());
//        
//        System.out.println("RESPUESTA:   " + service.getNotification())
//
//        Usuario user = new Usuario();
//        user.setId(28);
//        user.setTodas_unidades(true);
//
//        UnidadNegocioService service = new UnidadNegocioService();
//        service.getUnidadesPorUsuarioSistema(user, 1001);
//        System.out.println("Unidades:" + service.getObjects().toString());
//        ProductoServicioService service = new ProductoServicioService();
//        service.getProducto("", "", "");
//        System.out.println(service.getObjects());

//        ProductoServicioService service = new ProductoServicioService();
//        service.getProducto("", "", "");
//        System.out.println(service.getObjects());
        
//         ClienteService service = new ClienteService();
//         service.getOneCliente("no_contable = 14691");
//         System.out.println(service.getObjects());

         System.out.println(" IP " + InetAddress.getLocalHost().getHostAddress());


    }
    
     public int getDiasVacaciones(LocalDate fechaIngreso){     
       LocalDate fechaHoy = LocalDate.now();
       long dif = ChronoUnit.YEARS.between(fechaIngreso,fechaHoy); 
       int diasv =0;
       
       if(dif == 1){
           diasv = 6;
       }
       if(dif == 2){
           diasv= 8;
       }
       if(dif == 3){
           diasv = 10;
       }
       if(dif == 4){
           diasv = 12;
       }
       if(dif >= 5){
          diasv = 14;
          for (int i = 9; i <dif; i+=5) {
              diasv+=2;
          }
       }    
       return diasv;
   }
    
}
