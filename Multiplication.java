import java.beans.Expression;
import java.rmi.server.Operation;

public class Multiplication extends Operation{

    public Multiplication(Expression operande1,Expression operande2){
        super(operande1, operande2);
    }

    public double valeur(){
        return getOperande1().valeur()*getOperande2().valeur();
    }

    public String toString(){
        return "(" + getOperande1() + " * " + getOperande2() + ")"; // On retire le ".valeur()" puisque maintenant les opérandes sont des Expressions (qui peuvent être des Nombres ou d'autres Opérations)
    }
}
