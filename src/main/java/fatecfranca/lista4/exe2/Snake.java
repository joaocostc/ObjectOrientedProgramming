package fatecfranca.lista4.exe2;

public class Snake extends Animal{
    private boolean poisonous, smoke;

    public Snake() {
        super();
    }

    public Snake(boolean poisonous, boolean smoke, String name, int age) {
        super(name, age);
        this.setPoisonous(poisonous);
        this.setSmoke(smoke);
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public final void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public final void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }
    
    @Override
    public String move(){
        return "Slithering";
    }
    
    @Override
    public String toString() {
        return "Snake{" + "poisonous=" + poisonous + ", smoke=" + smoke + super.toString() +'}';
    }
}
