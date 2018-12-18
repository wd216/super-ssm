package mass.builder;

public class Director {
    public Human createHumanByDirecotr(IBuildHuman bh) {
        bh.buildBody();
        bh.buildFoot();
        bh.buildHand();
        bh.buildHead();
        return bh.createHuman();
    }
}