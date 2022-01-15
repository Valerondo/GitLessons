package Preobrazovaniya;

public class Less32_Animal {
    /*public void eat(){
        System.out.println("Nasledovanie.Animal is eating");
    }*/

    //wildcards
    private int id;

    public Less32_Animal(){

    }

    public Less32_Animal (int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Nasledovanie.Animal is eating");
    }

    public String toString(){
        return String.valueOf(id);
    }
}
