package controller;

import javafx.scene.Parent;
import model.Child;

public class Menu {

    public void wyswietl(){

        Child child = new Child(21,180,"srednie",true);
        System.out.println(child);

        Child child1 = new Child();
        System.out.println(child1);

//        Parent parent = new Child();
//        (10,120,"brak",false);

    }


}
