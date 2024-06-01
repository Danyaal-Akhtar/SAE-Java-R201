public class Division extends Operation{
    
    public Division(Nombre operande1,Nombre operande2){
        super(operande1, operande2);
    }

    public int valeur(){
        if(getOperande2().valeur() == 0){

            throw new ArithmeticException("Message d'erreur : Division par zéro impossible !"); // Déléguer une ArithmeticException automatiquement créée par une division par zéro dans la méthode valeur. 
            
        }

        return getOperande1().valeur() / getOperande2().valeur();
    }

    public String toString(){
        return "Calcul d'un quotient : " + getOperande1().valeur() + " / " + getOperande2().valeur();
    }

}