public class CalculatriceSimple {

    
    public static void main(String[] args) {
        
        Nombre six = new Nombre(6) ;
        Nombre dix = new Nombre(10);
        Nombre zero = new Nombre(0);

        // Test de la soustraction
        Operation s = new Soustraction(dix,six) ;
        System.out.println(s + " = " + s.valeur()) ; 
        

        // Test de  l'addition
        Operation a = new Addition(six, dix);
        System.out.println(a + " = " + a.valeur());


        // Test de la multiplication
        Operation m = new Multiplication(six, dix);
        System.out.println(m + " = " + m.valeur());


        // Test de la division
        Operation d1 = new Division(dix,six);
        System.out.println(d1 + " = " + d1.valeur());


        // Division par zéro 
        try{
            Operation d2 = new Division(six, zero);
            System.out.println(d2 + " = " + d2.valeur());
        }

        catch(ArithmeticException e){
            System.out.println("Message d'erreur : Division par zéro impossible !");
            
        }




    }
}