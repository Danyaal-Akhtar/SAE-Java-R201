public class Nombre{
    
    private int valeurNombre;


    public Nombre(int valeurNombre){
        this.valeurNombre = valeurNombre;
    }

    public int valeur(){
        return valeurNombre;
    }

    public String toString(){
        return " "  + valeur();
    }



}