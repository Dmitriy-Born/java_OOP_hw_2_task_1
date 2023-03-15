import java.util.ArrayList;

class Wardrobe {
    private boolean doorStatus;
    private int volume;
    private String name;
    public ArrayList<String> items = new ArrayList<>();

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public Wardrobe (String name, int volume){
        this.doorStatus = false;
        this.volume = volume;
        this.name = name;
        this.items = new ArrayList<>();
    }

    public boolean wardrobeIn(){
        return doorStatus;
    }

    public ArrayList<String> items(){
        return items;
    }

    public void addItem(String nameItem){
        items.add(nameItem);
    }

    public void addItem (String nameItem, Cat cat){
        items.add(cat.getName());


    }

    public void deleteItem (String nameItem){
        items.remove(nameItem);
    }

    public void openDoor(){
        this.doorStatus = true;
    }

    public void closeDoor() {
        this.doorStatus = false;
    }

}
