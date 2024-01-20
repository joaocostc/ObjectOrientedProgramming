package fatecfranca.lista4.exe2;

public abstract class Animal{
    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal (String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }
    
    public abstract String move();

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + '}';
    }
}