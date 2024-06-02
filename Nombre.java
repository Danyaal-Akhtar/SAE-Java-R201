public class Nombre extends Expression{
    
    private int valeurNombre;


    public Nombre(int valeurNombre){
        this.valeurNombre = valeurNombre;
    }

    public double valeur(){
        return valeurNombre;
    }

    public String toString(){
        return " "  + valeur();
    }



}