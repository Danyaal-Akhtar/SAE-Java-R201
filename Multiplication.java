public class Multiplication extends Operation{

    public Multiplication(Nombre operande1,Nombre operande2){
        super(operande1, operande2);
    }

    public int valeur(){
        return getOperande1().valeur()*getOperande2().valeur();
    }

    public String toString(){
        return "Calcul d'un produit : " + getOperande1().valeur() + " * " + getOperande2().valeur();
    }
}