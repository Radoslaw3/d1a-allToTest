package model;

public class Parent {
    private int wiek;
    private int wzrost;

    private String wyksztalcenie;
    private boolean konto;

    public Parent() {
        this.wiek = 5;
    }

    public Parent(int wiek, int wzrost, String wyksztalcenie, boolean konto) {
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.wyksztalcenie = wyksztalcenie;
        this.konto = konto;
    }


    //    void show() {
//        System.out.println("Parent's show()");
//    }


    @Override
    public String toString() {
        return "Parent{" +
                "wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", wyksztalcenie='" + wyksztalcenie + '\'' +
                ", konto=" + konto +
                '}';
    }
}
