

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args){
        Zarulja Osram = new Zarulja();
        
        Zaposlenik Vjeran = new Zaposlenik(0, 0, 0);
        
        Vjeran.ispisiPodatke(Vjeran);
        Vjeran.izmjenaPodataka(Vjeran);
        Vjeran.ispisiPodatke(Vjeran);
        System.out.println("Zaposlenik Vjeran do sada je ukupno zaradio " + Vjeran.ukupnaZarada() + "kn");
        System.out.println("Zaposlenik Vjeran do sada je ukupno zaradio " + Vjeran.ukupnaZarada1(Vjeran) + "kn");
    
        while(true){
            System.out.print("Stanje zarulje: ");
            Osram.provjeri();
            if(Osram.stanje == false){
                int izbor;
                Scanner unos = new Scanner(System.in);
                System.out.println("Upaliti žarulju? 1.Da 2.Izađi iz programa");
                izbor = unos.nextInt();
                if(izbor == 1){
                Osram.pritisniPrekidac();
                }
                else
                    return;
            }
            else{
                int izbor;
                Scanner unos = new Scanner(System.in);
                System.out.println("Ugasiti1 žarulju? 1.Da 2.Izađi iz programa");
                izbor = unos.nextInt();
                if(izbor == 1){
                    Osram.pritisniPrekidac();
                }
                else
                    return;
            }
        }
    }
}
