public class paciente{
    String Name = "";
    char PrioLevel = "";
    String Sintom = "";
    String retorno = "";

    public paciente(String Name, String Sintom, String PrioLevel ){
        this.Name = Name;
        this.Sintom = Sintom;
        this.PrioLevel = PrioLevel;

    }
    public String printDatos(){
        retorno = "Nombre: "+Name+"\n Síntomas: "+Sintom+"\n Prioridad: "+PrioLevel;

        return retorno;
    }

    public String GetPrio(){
        retorno = PrioLevel;
        return retorno;
    }
}