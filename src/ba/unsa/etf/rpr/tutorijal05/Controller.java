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

    public String getUnos1() {
        return unos1.get();
    }

    public void setUnos1(String unos1) {
        this.unos1.set(unos1);
    }

    public String getOperacija() {
        return operacija.get();
    }

    public SimpleStringProperty operacijaProperty() {
        return operacija;
    }

    public void setOperacija(String operacija) {
        this.operacija.set(operacija);
    }

    public SimpleStringProperty unos1Property() {
        return unos1;
    }

    public String getPrikaz() {
        return prikaz.get();
    }

    public SimpleStringProperty displejProperty() {
        return prikaz;
    }

    public void setPrikaz(String u) {
        this.prikaz.set(u);
    }

    public void za0(ActionEvent event) {
        setPrikaz("0");
    }

    public void za1(ActionEvent event) {
        setPrikaz(getPrikaz() + "1");
    }

    public void za2(ActionEvent event) {
        setPrikaz(getPrikaz() + "2");
    }

    public void za3(ActionEvent event) {
        setPrikaz(getPrikaz() + "3");
    }

    public void za4(ActionEvent event) {
        setPrikaz(getPrikaz() + "4");
    }

    public void za5(ActionEvent event) {
        setPrikaz(getPrikaz() + "5");
    }

    public void za6(ActionEvent event) {
        setPrikaz(getPrikaz() + "6");
    }

    public void za7(ActionEvent event) {
        setPrikaz(getPrikaz() + "7");
    }

    public void za8(ActionEvent event) {
        setPrikaz(getPrikaz() + "8");
    }

    public void za9(ActionEvent event) {
        setPrikaz(getPrikaz() + "9");
    }

    public void zaMinus(ActionEvent event){
        setUnos1(getPrikaz());
        setPrikaz("");
        setOperacija("-");
    }

    public void zaPlus(ActionEvent event){
        setUnos1(getPrikaz());
        setPrikaz("");
        setOperacija("+");
    }

    public void zaMod(ActionEvent event){
        setUnos1(getPrikaz());
        setPrikaz("");
        setOperacija("%");
    }

    public void zaDijeljenje(ActionEvent event){
        setUnos1(getPrikaz());
        setPrikaz("");
        setOperacija("/");
    }

    public void zaMnozenje(ActionEvent event){
        setUnos1(getPrikaz());
        setPrikaz("");
        setOperacija("*");
    }

    public void zaTacku(ActionEvent event){
        setPrikaz(getPrikaz()+".");
    }

    public void zaJednako(ActionEvent event){
        if(getOperacija().equals("+")){
            setPrikaz(Double.toString(Double.parseDouble(unos1.get())+Double.parseDouble(getPrikaz())));
        }
        else if(getOperacija().equals("-")){
            setPrikaz(Double.toString(Double.parseDouble(unos1.get())-Double.parseDouble(getPrikaz())));
        }
        else if(getOperacija().equals("*")){
            setPrikaz(Double.toString(Double.parseDouble(unos1.get())*Double.parseDouble(getPrikaz())));
        }
        else if(getOperacija().equals("/")) {
            setPrikaz(Double.toString(Double.parseDouble(unos1.get()) / Double.parseDouble(getPrikaz())));
        }
        else if(getOperacija().equals("%")){
            setPrikaz(Double.toString(Double.parseDouble(unos1.get())+Double.parseDouble(getPrikaz())));
        }
        setOperacija("=");
    }

}
