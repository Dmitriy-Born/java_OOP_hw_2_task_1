public class Human extends Alive{

    public Human (String name, int age, Sex sex){
        super(name, age, sex);
    }


    public void openDoor (Wardrobe wardrobe){
        if (!wardrobe.wardrobeIn()){
            if (getSex() == Sex.man){
                System.out.println(this.getName() + " открыл шкаф");
            }
            else {
                System.out.println(this.getName() + " открыла шкаф");
            }
            wardrobe.openDoor();
        }

        else {
            System.out.println(this.getName() + ", разуй глаза. Шкаф уже открыт");
        }
    }

    public void addInWardrobe (String nameItem, Wardrobe wardrobe){
        if (wardrobe.wardrobeIn()){
            if (getSex() == Sex.man){
                System.out.println(this.getName() + " положил в " + wardrobe.getName() + " " + nameItem);
            }
            else{
                System.out.println(this.getName() + " положила в " + wardrobe.getName() + " " + nameItem);
            }
            wardrobe.addItem(nameItem);
        }
        else{
            System.out.println(this.getName() + ", открой снача шкаф!");
        }
    }


    public void seeInWardrobe(Wardrobe wardrobe){
        if (wardrobe.wardrobeIn()){
                if (getSex() == Sex.man){
                    System.out.println(this.getName() + " осмотрел " + wardrobe.getName() + " и нашел там " + wardrobe.items());
                }
                else{
                    System.out.println(this.getName() + " осмотрела " + wardrobe.getName() + " и нашла там " + wardrobe.items());
                }
        }
        else{
            System.out.println("Мда, " + this.getName() + ". Может сначала дверь откроем, чтобы что-то там увидеть?!");
        }
    }


    public void closeDoor (Wardrobe wardrobe){
        if (wardrobe.wardrobeIn()){
            if (getSex() == Sex.man){
                System.out.println(this.getName() + " закрыл шкаф");
            }
            else{
                System.out.println(this.getName() + " закрыла шкаф");
            }
            wardrobe.closeDoor();
        }
        else{
            System.out.println(this.getName() + ", все и так уже закрыто!");
        }
    }

    ////////////////////cat
    public void callCat(Cat cat){

        if (!cat.comeHere()){
            System.out.println(cat.getName() + ", а ну иди сюда пушистый!!!");
        }
        else{
            System.out.println(cat.getName() + " а я тебя и не заметил!");
            cat.mrrr();
        }
        cat.callCat();
    }


    public void sayHiCat (Cat cat){
        System.out.println(this.getName() + ", не забудь про своего кота " + cat.getName() + "а!");
    }

    public void sayHi(Wardrobe wardrobe){
        System.out.println(this.getName() + ", у Вас есть " + wardrobe.getName() + " на " + wardrobe.getVolume() + " мест.");
    }
}
