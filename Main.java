//María Fernanda Argueta 20458
//Algoritmos y Estructuras de datos sección 10
//Hoja de trabajo 8
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String docname = ""; 
        PriorityQueue<String> Listado = new PriorityQueue<>();
        


        System.out.println("Bienvenido al sistema automatizado de servicio de hospital \n Ingrese el nombte de su documento .txt para obtener los datos de los pacientes");
        docname = scan.nextLine();
        
        try {
            //post: operaciones realizadas según lo descrito en el txt
              File myObj = new File(docname+".txt");
              Scanner myReader = new Scanner(myObj);
              //ir haciendo las operaciones línea por línea
              while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //hacer la operación de la línea actual
                paciente pc = new paciente(data,1);
                Listado.add(pc.completo(1));
              }
              myReader.close();
            } catch (FileNotFoundException e) {
              //post: mensaje de error
              System.out.println("An error occurred.");
              e.printStackTrace();
            }

        
        System.out.println("El orden en que deben ser atendidos los pacientes es el siguiente: ");
        while(!Listado.isEmpty()){
            paciente pc2 = new paciente(Listado.poll(),2);
            System.out.println(pc2.completo(2));
        }
       
    }
}