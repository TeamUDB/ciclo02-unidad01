package ciclo02;
/**
 *
 * @author gdanm
 */

/*Let's start with the students registration
 *First, and very important, do not forget import
 *the classes to be used along the program
*/
import java.util.*;     
public class Unidad01a 
{
    public static void main(String[] args) 
    {
        //Declaring some variables
        String name, carnet, src_carnet, reg_carnet;
        int key = 0;
        
        //Calling the scanner
        Scanner input = new Scanner (System.in);
        
        //Getting hashmap ready
        HashMap <String, String> stdatabase = new HashMap <String, String> ();
        
        do
        {  
            //Displaying menu
            System.out.println("Bienvenido a UDB Virtual");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Mostrar lista de estudiantes");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            //Giving options with switch case structure
            int option = input.nextInt();
            String jumpline = input.nextLine();
            
            switch (option)
            {
                case 1:
                {
                    System.out.print("Por favor ingrese nombre completo de estudiante: ");
                    name = input.nextLine();
                    System.out.print("Por favor ingrese el carnet del estudiante: ");
                    carnet = input.nextLine();
                    
                    stdatabase.put(carnet, name);
                    System.out.println("Alumno registrado exitosamente");
                }
                break;
                
                case 2:
                {
                    System.out.print("Por favor escriba el numero de carnet del estudiante: ");
                    src_carnet = input.nextLine();
                    reg_carnet = stdatabase.get(src_carnet);
                    
                    System.out.println("key => " + reg_carnet);
                    
                    if (stdatabase.containsValue(reg_carnet))
                    {
                        System.out.println(src_carnet + "- " + reg_carnet);
                    }
                    else
                    {
                        System.out.println("Alumno no encontrado, no se puede Mostrar");
                    }
                }
                break;
                
                case 3:
                {
                    if (!stdatabase.isEmpty())
                    {
                        for (Map.Entry <String, String> map_show : stdatabase.entrySet())
                        {
                            System.out.println(map_show.getKey() + "- " + map_show.getValue());
                        }
                    }
                    else
                    {
                        System.out.println("No hay alumnos registrados");
                    }
                }
                break;
                
                case 4:
                {
                    System.out.println("Por favor escriba el numero de carnet del estudiante: ");
                    src_carnet = input.nextLine();
                    reg_carnet = stdatabase.get(src_carnet);
                    
                    if(stdatabase.containsValue(reg_carnet))
                    {
                        stdatabase.remove(src_carnet);
                        System.out.println("Alumno eliminado");
                    }
                    else
                    {
                        System.out.println("Alumno no encontrado, no se puede Mostrar");
                    }
                }
                break;
                
                case 5:
                {
                    key = 5;
                    System.out.println("Thanks for using our program!");
                    System.exit(0);
                }
                break;
                
                default:
                {
                    System.out.println("Opcion invalida");
                }
            }
        }
        while (key == 0);
    }
    
}