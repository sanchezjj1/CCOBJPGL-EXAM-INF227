public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Locations boracay = new Boracay();
        Locations tubbatahareef = new TubbatahaReef();
        Locations siargao  = new Siargao();
        Locations biglaagon = new BigLagoon();
        Locations smallLagoon = new SmallLagoon();
        Locations underGroundRiver = new UnderGroundRiver();

        Tourist sanchezTourist = new Me();

        {System.out.println("Locations: "); 
        System.out.println();}
       
        boracay.accept(sanchezTourist);
            {System.out.println();}
        tubbatahareef.accept(sanchezTourist);
            {System.out.println();}     
        siargao.accept(sanchezTourist);
            {System.out.println();}  
        biglaagon.accept(sanchezTourist);
            {System.out.println();}  
        smallLagoon.accept(sanchezTourist);
            {System.out.println();}
        underGroundRiver.accept(sanchezTourist);
        
        int budget =  1000 - 600; 
        {System.out.println("Laman ng wallet ko " + budget + " na lang tara Mix and Match!");}
        
        }
    }
