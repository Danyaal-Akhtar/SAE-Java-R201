<<<<<<< HEAD
public class TestOperation {

    public static void main(String[]args){
        
        Expression deux = new Nombre(2) ; 
        Expression trois = new Nombre(3) ; 
        Expression dixSept = new Nombre(17) ; 
        Expression s = new Soustraction(dixSept, deux) ; 
        Expression a = new Addition(deux, trois) ; 
        Expression d = new Division(s, a) ; 
        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        
    }
=======
public class TestOperation {

    public static void main(String[]args){
        
        Expression deux = new Nombre(2) ; 
        Expression trois = new Nombre(3) ; 
        Expression dixSept = new Nombre(17) ; 
        Expression s = new Soustraction(dixSept, deux) ; 
        Expression a = new Addition(deux, trois) ; 
        Expression d = new Division(s, a) ; 
        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        
    }
>>>>>>> 69a0d98fedb432bd63a3feca652a9d67f5a767f6
}