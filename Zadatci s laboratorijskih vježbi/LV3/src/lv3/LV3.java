
package lv3;

import java.util.Scanner;
import java.util.Random; 

public class LV3 {
    
    public static void main(String[] args) {
        int n,m;
        Scanner unos = new Scanner(System.in);
        
        System.out.print("Unesite maksimalan broj elemenata vektora V (2-10): ");
        do{
            try {
                n = unos.nextInt();
            } catch (Exception e) {
                System.out.println("Unesena kriva vrijednost");
                throw e;
            }
        }while(n<2 || n>10);
        
        System.out.print("Unesite maksimalan broj elemenata matrice (1-5): ");
        do{
            try {
                m = unos.nextInt();
            } catch (Exception e) {
                System.out.println("Unesena kriva vrijednost");
                throw e;
            }
            
        }while(m<2 || m>10);
        
        int matrica[][];
        matrica = new int[5][5];
        
        Random rand = new Random();
        
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    int randNum = rand.nextInt(100);
                    matrica[i][j] = randNum;
//                    System.out.println(matrica[i][j] + " ");
                }
            }
            System.out.println("Matrica:");
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matrica[i][j] + " ");
                }
                System.out.println("");
            }
            
            int V[];
            V = new int[10];
            
            Random rand1 = new Random();
            
            System.out.println("Vektor:");
            for(int i=0; i<n; i++){
                int randNum = rand1.nextInt(100);
                V[i] = randNum;
                System.out.print(V[i] + " ");
            }
            System.out.println("");
            
            int izbor;
            
            do{
                
                System.out.println("######################################################################################");
                System.out.println("1. Izračunati aritmetičku sredinu sporedne dijagonale");
                System.out.println("2. Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice. Ukoliko\n" +
                "ne postoje neparni elementi ispisati da nije bilo moguće izračunati sumu");
                System.out.println("3. Ispisati sve brojeve na parnim indeksima vektora V");
                System.out.println("######################################################################################\n");
                System.out.print("Izbor: ");
                
                Scanner input = new Scanner(System.in);
                
                try {
                    izbor = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Krivo unešeni podatci");
                    break;
                }
                
                switch(izbor){
                    
                    case 1:
                        double sum = 0;
                        int j = m-1; 
                        for(int i=0; i<m; i++){
                            sum += matrica[i][j];
                            System.out.print(matrica[i][j] + " ");
                            j--;
                        }
                        System.out.println("\nAritmetička sredina sporedne dijagonale iznosi = " + sum/m);
                        System.out.println("Sum = " + sum);
                        break;
                        
                    case 2:
                        int sumN = 0;
                        for(int i=0;i<m;i++){
                            if(matrica[0][i] % 2 != 0){
                                sumN += matrica[0][i];
                                System.out.print(matrica[0][i] + " ");
                            }
                        }
                        for(int i=1;i<m;i++){
                            if(matrica[i][0] % 2 != 0){
                                sumN += matrica[i][0];
                                System.out.print(matrica[i][0] + " ");
                            }
                        }
                        
                        if(sumN != 0){
                            System.out.println("\nSuma neparnih elemenata prvog retka i prvog stupca matrice iznosi: " + sumN); 
                        }
                        else
                            System.out.println("\nSuma se ne može izračunati jer nema neparnih brojeva");
                        
                        break;
                        
                    case 3:
                        for (int i = 0; i < n; i++) {
                             if(i % 2 == 0 && i != 0) {
                                System.out.println("Na indeksu [" + i + "] : " + V[i]);
                    }
                }
                break;
                }
                
            }while(izbor != 0);
        }
    }