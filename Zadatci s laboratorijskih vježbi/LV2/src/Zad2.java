

import java.util.Scanner;

 class Zaposlenik {
    
    private double staz;
    private double starost;
    private double placa;
    
    Zaposlenik(double s, double god, double pl){
        
        staz = s;
        starost = god;
        placa = pl;
        
    }
     
     public void izmjenaPodataka(Zaposlenik Vjeran){
         double x;
         Scanner unos = new Scanner(System.in);
         
         System.out.print("Izmijenite radni staž Zaposlenika Vjeran\nTrenutni radni staž: " + Vjeran.staz + "\nNovi radni staž = ");
         x = unos.nextInt();
         Vjeran.staz = x;
         
         System.out.print("Izmijenite starost Zaposlenika Vjeran\nTrenutna starost: " + Vjeran.starost + "\nNova starost: ");
         x = unos.nextInt();
         Vjeran.starost = x;
         
         System.out.print("Izmijenite placu Zaposlenika Vjeran\nTrenutni iznos place: " + Vjeran.placa + "\nNovi iznos place: ");
         x = unos.nextInt();
         Vjeran.placa = x;
         
     }
     
     public void ispisiPodatke(Zaposlenik Vjeran){
         System.out.println("Zaposlenik: Vjeran");
         System.out.println("Starost: " + Vjeran.starost);
         System.out.println("Radni staz: " + Vjeran.staz);
         System.out.println("Iznos place: " + Vjeran.placa);
     }
     
     public double ukupnaZarada(){
         return (staz * 12) * placa;    //staz je izrazen u godinama, zato mnozimo s 12
     }
    
     public static double ukupnaZarada1(Zaposlenik Vjeran){
         return (Vjeran.staz * 12) * Vjeran.placa;
     }
     
    
    
}

public class Zad2 {
    
    public static void main(String[] args) {
        
        Zaposlenik Vjeran = new Zaposlenik(0, 0, 0);
        
        Vjeran.ispisiPodatke(Vjeran);
        Vjeran.izmjenaPodataka(Vjeran);
        Vjeran.ispisiPodatke(Vjeran);
        System.out.println("Zaposlenik Vjeran do sada je ukupno zaradio " + Vjeran.ukupnaZarada() + "kn");
        System.out.println("Zaposlenik Vjeran do sada je ukupno zaradio " + Vjeran.ukupnaZarada1(Vjeran) + "kn");
        
    }
    
}
