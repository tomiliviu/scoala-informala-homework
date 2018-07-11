package OOP;

public class Masina {
    public String marca;
    public String culoarea;
    public int numarPersoane;


    public Motor motor;

    public void porneste() {

    }

    public void transporta(int nrPersoane) {


        System.out.println("Se transporta "+ nrPersoane +" persoane");

    }

    public void spuneTotulDespreMine(){
        System.out.println("Sunt o masina marca " + marca + " de culoare " + culoarea + ", si pot transporta maxim " + numarPersoane + " Persoane.");

    }





}
