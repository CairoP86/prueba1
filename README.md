package ejemplo01;

/**
 *
 * @author capl1
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ciudad miCiudad;
        miCiudad = new Ciudad();
        System.out.println(miCiudad.toString());
        miCiudad.setId(1000);
        miCiudad.setCiudad("san josé");
        miCiudad.setPais("costarica");
        miCiudad.setLatitud(9.93);
        miCiudad.setLongitud(-84.08);
        System.out.println(miCiudad.toString());
        System.out.println(miCiudad.getId());
        System.out.println(miCiudad.getCiudad());
        
        
        
    }
    
}
