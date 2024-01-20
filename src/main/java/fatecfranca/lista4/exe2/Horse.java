package fatecfranca.lista4.exe2;

public final class Horse extends Animal{
    private boolean competitor;

    public Horse() {
        super();
    }

    public Horse(boolean competitor, String name, int age) {
        super(name, age);
        this.setCompetitor(competitor);
    }

    public boolean isCompetitor() {
        return competitor;
    }

    public void setCompetitor(boolean competitor) {
        this.competitor = competitor;
    }
    
    @Override
    public String move(){
        return "Trots";
    }
    
    @Override
    public String toString() {
        return "Horse{" + "competitor=" + competitor + super.toString() + '}';
    }
}
