public abstract class Alive {
    private String name;
    private int age;
    private Sex sex;

    public Alive(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }


    public Sex getSex() {
        return sex;
    }

}
