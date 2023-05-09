public class Me implements Tourist {
   
    int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }
    
    public void visit(Boracay boracay) { 
         if ( budget != 0) { System.out.println("Yey nandito na po ako sa boracay mama!");
         }
         else {
            System.out.println("Sama sana ako kaso wala pera eh");
         }
         
         budget = budget - boracay.airFare;
         checkBudget();
    }

    public void visit(TubbatahaReef tubbatahaReef) { 
        if ( budget != 1000) { System.out.println("Yey nandito na po ako sa tubbatahareef mama pinapakain yung gold fish natin!");
    }
    else {
       System.out.print("Sama sana ako kaso wala pera eh");
    }
    
    budget = budget - tubbatahaReef.airFare;
    checkBudget();}

       
    public void visit(Siargao siargao) { 
        if(budget != 1000) { System.out.println("Yey nandito na po ako sa siargao mama nag kakape!");
    }
        else {
            
            System.out.print("Sama sana ako kaso wala pera eh");
        }
    
    budget = budget - siargao.airFare;
    checkBudget();}


    public void visit(BigLagoon bigLagoon) {
        if(budget != 1000) { System.out.println("Yey nandito na po ako sa biglagoon mama langoy saglit!");
    }
        else {
            
            System.out.print("Sama sana ako kaso wala pera eh");
        }
    
    budget = budget - bigLagoon.airFare;
    checkBudget();
    }

    public void visit(SmallLagoon smallLagoon) {

        if(budget != 1000) { System.out.println("Yey nandito na po ako sa smallLagoon mama langoy ulit!");
    }
        else {
            
            System.out.println("Sama sana ako kaso wala pera eh");
        }
    
    budget = budget - smallLagoon.airFare;
    checkBudget();
    }

    public void visit(UnderGroundRiver underGroundRiver) {

        if(budget != 1000) { System.out.println("Yey nandito na po ako sa underGroundRiver mama hanap ako magandang bato!");
    }
        else {
            
            System.out.println("Sama sana ako kaso wala pera eh");
        }
    
    budget = budget - underGroundRiver.airFare;
    checkBudget();
    }
    
    public void checkBudget() {
        System.out.println("laman ng wallet ko  " + budget);
   
    }

}





