interface Tourist { 
    
    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(TubbatahaReef tubbatahaReef);

    void visit(Siargao siargao);

    void visit(BigLagoon bigLagoon);

    void visit(SmallLagoon smallLagoon);


    default void visit(Locations locations) {
        System.out.println("nabisita ko na lahat bahay niyo na lang hindi! ");
        System.out.println();};

    void checkBudget();
    
}
