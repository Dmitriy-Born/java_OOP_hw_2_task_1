public class Cat extends Alive implements PrintConsole{
    private boolean here;

    public Cat (String name, int age, Sex sex){
        super(name, age, sex);

    }

    public boolean comeHere(){
        return here;
    }

    @Override
    public void callCat(){
//        this.here = true;
        System.out.println(this.getName() + " лениво идет на зов и начинает драть диван");
    }

    public void mrrr(){
        System.out.println(this.getName() + " мурчит");
    }


//    @Override
//    public void sayVoice() {   ///////////////////!!!!!!!!!!!!!!!!!!!!!
//
//    }
}
