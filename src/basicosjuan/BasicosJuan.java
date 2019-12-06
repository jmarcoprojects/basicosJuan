
package basicosjuan;

/**
 *
 * @author J M
 */
public class BasicosJuan {
    
// Metodo para mostrar ejemplos de tipo logicos
    
    public static void logicos(){

    //Variable tipo boolean       
        boolean variable;
            
    //Asignacion de valor
        variable = true;
        
    //Mostrar en pantalla el uso del tipo boolean

        if(variable){
            System.out.println("La variable es verdadera");
        }
        else{
            System.out.println("La variable es falsa");
        }
    }
   
    
// Método para mostrar ejemplos de tipo cadenas.   
    public static void cadenas(){
    // Tipo String
        String nombre;
        String apellidos;
        
    // Asignación de valores a las variables String

        nombre = "Juan Antonio";
        apellidos = "Marco Poveda";
        
    // Mostrar en pantalla el cotenido de las variables.

        System.out.println("Mi nombre es " + nombre );
        System.out.println("Y mis apellidos son " + apellidos );
        
        
     }
    
// Metodo para ejemplos de tipos numericos.
     
    public static void numericos() {

    //Tipos basicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

    //Ejemplos de asignacion de valores a las variables de tipos basicos
        elMasPeque = 45;
        entero = 10;
        doble = 5.6;

    //Mostrar en pantalla el contendido de las variables de tipos basicos.
        System.out.println("Valor tipo byte: " + elMasPeque);
        System.out.println("Valor entero: " + entero);
        System.out.println("Valor doble: " + doble);
    }   
    
    public static void main(String[] args) {
        numericos();
        cadenas();
        logicos();
    }
}
