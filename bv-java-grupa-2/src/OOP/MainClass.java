package OOP;

public class MainClass {
    public static void main(String args []) {

        System.out.println("Start Main");

        Masina masinaNumarulUnu = new Masina();
        Masina masinaNumarulDoi = new Masina();



        masinaNumarulUnu.culoarea = "Rosie";

        masinaNumarulUnu.marca = "Opel";

        masinaNumarulUnu.numarPersoane = 5;


        masinaNumarulUnu.transporta (4 );
        masinaNumarulUnu.spuneTotulDespreMine();



        masinaNumarulDoi.culoarea = "Verde";

        masinaNumarulDoi.marca  = "Dacia";

        masinaNumarulDoi.numarPersoane = 7;

        masinaNumarulDoi.spuneTotulDespreMine();





    }
}
