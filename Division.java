public class Division extends Operation{
    
    public Division(Expression operande1,Expression operande2){
        super(operande1, operande2);
    }

    public double valeur(){
        if(getOperande2().valeur() == 0){

            throw new ArithmeticException("Message d'erreur : Division par zéro impossible !"); // Déléguer une ArithmeticException automatiquement créée par une division par zéro dans la méthode valeur. 
            
        }

        return getOperande1().valeur() / getOperande2().valeur();
    }

    public String toString(){
        return "(" + getOperande1() + " / " + getOperande2()+")";
    }

}