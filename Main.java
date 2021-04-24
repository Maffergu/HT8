//María Fernanda Argueta 20458
//Algoritmos y Estructuras de datos sección 10
//Hoja de trabajo 8
import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String docname = ""; 

        System.out.println("Bienvenido al sistema automatizado de servicio de hospital \n Ingrese el nombte de su documento .txt para obtener los datos de los pacientes");
        
        try {
            //post: operaciones realizadas según lo descrito en el txt
              File myObj = new File(docname+".txt");
              Scanner myReader = new Scanner(myObj);
              //ir haciendo las operaciones línea por línea
              while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //hacer la operación de la línea actual
                System.out.println("Ingrese el número de lo que desea realizar");
                while(op != 7){
                  System.out.println("hola");
                }
              }
              myReader.close();
            } catch (FileNotFoundException e) {
              //post: mensaje de error
              System.out.println("An error occurred.");
              e.printStackTrace();
            }

    }
}