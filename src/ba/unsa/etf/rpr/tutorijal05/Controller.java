package ba.unsa.etf.rpr.tutorijal05;

//ne mogu instalirati JavaFX pa ne radi!!

public class Controller {

    //nije zavrsen Controller!!

    private SimpleStringProperty unos;

    public String getUnos(){
        return unos.get();
    }

    public String setUnos(String u) { this.unos.set(u); }

    public void za0(ActionEvent event){
        setUnos("0");
    }

    public void za1(ActionEvent event){
        setUnos(unos.get()+"1");
    }

    public void za2(ActionEvent event){
        setUnos(unos.get()+"2");
    }

    public void za3(ActionEvent event){
        setUnos(unos.get()+"3");
    }

    public void za4(ActionEvent event){
        setUnos(unos.get()+"4");
    }

    public void za5(ActionEvent event){
        setUnos(unos.get()+"5");
    }

    public void za6(ActionEvent event){
        setUnos(unos.get()+"6");
    }

    public void za7(ActionEvent event){
        setUnos(unos.get()+"7");
    }

    public void za8(ActionEvent event){
        setUnos(unos.get()+"8");
    }

    public void za9(ActionEvent event){
        setUnos(unos.get()+"9");
    }
}
