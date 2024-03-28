public class Act {
    private String name;
    private int length;
    private Actor[]actors;
    private int level;
    private Actor bestActor;
    public Act(String name,int length,Actor[]actors,int level){
        this.name=name;
        this.length=length;
        this.actors=actors;
        this.level=level;
    }

    public int getLevel() {
        return level;
    }

    public void setBestAct(Actor bestActor){
        this.bestActor=bestActor;
    }

    public Actor getBestActor() {
        return bestActor;
    }
}
