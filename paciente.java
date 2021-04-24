//María Fernanda Argueta 20458
//Algoritmos y Estructuras de datos sección 10
//Hoja de trabajo 8

public class paciente {
    String Name = "";
    String PrioLevel = "";
    String Sintom = "";
    String retorno = "";

    public paciente(String datos, int tipo ){
        //Separar la líne que corresponde a los datos del paciente mostrada en el txt
        //in: línea leida del txt
        //out: datos separados por tipo
        if(tipo == 1){
            String[] parts = datos.split(", ");
            this.Name = parts[0];
            this.Sintom = parts[1];
            this.PrioLevel = parts[2];
        }else{
            String[] parts = datos.split(", ");
            this.Name = parts[2];
            this.Sintom = parts[1];
            this.PrioLevel = parts[0];
        }
        

    }
    public String printDatos(){
        retorno = "Nombre: "+Name+"\n Síntomas: "+Sintom+"\n Prioridad: "+PrioLevel;

        return retorno;
    }

    public String GetPrio(){
        //getter para el nivel de prioridad
        retorno = PrioLevel;
        return retorno;
    }

    public String completo(int tipo){
        if(tipo == 1){
            retorno = PrioLevel+", "+Sintom+", "+Name;
        }else{
            retorno = Name+", "+Sintom+", "+PrioLevel;
        }
        
        return retorno;
    }
  
}