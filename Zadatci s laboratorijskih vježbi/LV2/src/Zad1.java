

import java.util.Scanner;

 class Zarulja{
    
    boolean stanje;
    
    Zarulja(){
        stanje = false;
    }
    public void provjeri(){
        if (stanje == false){
        System.out.println("Mrak je");
        }
        else
            System.out.println("Svijetli");
    }
    
    public void pritisniPrekidac(){
        stanje = !stanje;
    }
 }
    public class Zad1{
    
        public static void main(String[] args) {
        
        Zarulja Osram = new Zarulja();
        
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
