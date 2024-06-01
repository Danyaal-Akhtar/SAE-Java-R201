public class Multiplication extends Operation{

<<<<<<< HEAD
    public Multiplication(Expression operande1, Expression operande2){
        super(operande1, operande2);
    }

    public double  valeur(){
=======
    public Multiplication(Expression operande1,Expression operande2){
        super(operande1, operande2);
    }

    public double valeur(){
>>>>>>> dc1795741bc9d5aaa2fb3feadaa131505702c9e6
        return getOperande1().valeur()*getOperande2().valeur();
    }

    public String toString(){
        return "(" + getOperande1() + " * " + getOperande2()+ ")";
    }
}
