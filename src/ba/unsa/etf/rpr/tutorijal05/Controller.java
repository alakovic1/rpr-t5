package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class Controller {

    private SimpleStringProperty prikaz;
    private SimpleStringProperty unos1 = new SimpleStringProperty("");;
    private SimpleStringProperty operacija = new SimpleStringProperty("=");;

    public Controller() {
        prikaz = new SimpleStringProperty("");
    }

    public String getUnos() {
        return prikaz.get();
    }

    public void setUnos(String u) {
        this.prikaz.set(u);
    }

    public void za0(ActionEvent event) {
        setUnos("0");
    }

    public void za1(ActionEvent event) {
        setUnos(prikaz.get() + "1");
    }

    public void za2(ActionEvent event) {
        setUnos(prikaz.get() + "2");
    }

    public void za3(ActionEvent event) {
        setUnos(prikaz.get() + "3");
    }

    public void za4(ActionEvent event) {
        setUnos(prikaz.get() + "4");
    }

    public void za5(ActionEvent event) {
        setUnos(prikaz.get() + "5");
    }

    public void za6(ActionEvent event) {
        setUnos(prikaz.get() + "6");
    }

    public void za7(ActionEvent event) {
        setUnos(prikaz.get() + "7");
    }

    public void za8(ActionEvent event) {
        setUnos(prikaz.get() + "8");
    }

    public void za9(ActionEvent event) {
        setUnos(prikaz.get() + "9");
    }

    public void zaMinus(ActionEvent event){
        unos1.set(prikaz.get());
        prikaz.set("");
        operacija.set("-");
    }

    public void zaPlus(ActionEvent event){
        unos1.set(prikaz.get());
        prikaz.set("");
        operacija.set("+");
    }

}
