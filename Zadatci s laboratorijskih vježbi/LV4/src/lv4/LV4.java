/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class LV4 {

//    public static void analyzePath( String path ){
// // stvori File objekt na temelju korisničkog unosa
// File name = new File( path );
// if ( name.exists() ) {
// // ispiši informacije o datoteci ili direktoriju
// "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
// System.out.printf(
// name.getName(), " exists",
// ( name.isFile() ? "is a file" : "is not a file" ),
// ( name.isDirectory() ? "is a directory" :
// "is not a directory" ),
// ( name.isAbsolute() ? "is absolute path" :
// "is not absolute path" ), "Last modified: ",
// name.lastModified(), "Length: ", name.length(),
// "Path: ", name.getPath(), "Absolute path: ",
// name.getAbsolutePath(), "Parent: ", name.getParent() );
// if ( name.isDirectory() ){
// String[] directory = name.list();
// System.out.println( "\n\nDirectory contents:\n" );
//
// for ( String directoryName : directory )
// System.out.println( directoryName );
// }
// }
// else
// {
// System.out.printf( "%s %s", path, "does not exist." );
// }
// }
    public static void main(String[] args) {
        CreateTextFile application = new CreateTextFile();
        application.openFile();
        application.addRecords();
        application.closeFile(); 
    }
    public class AccountRecord{
        
        private int account;
        private String firstName;
        private String lastName;
        private double balance;

        public AccountRecord() {
            this( 0, "", "", 0.0 ); //pozivanje argumentiranog konstruktora
        }
        public AccountRecord( int acct, String first, String last, double bal ){
            setAccount( acct );
            setFirstName( first );
            setLastName( last );
            setBalance( bal );
        }
        // postavi broj računa
        public void setAccount( int acct ){
            account = acct;
        }
        // dohvati broj računa
        public int getAccount() {
            return account;
        }
        // postavi ime
        public void setFirstName( String first ){
            firstName = first;
        }
        // dohvati ime
        public String getFirstName() {
            return firstName;
        }
        // postavi prezime
        public void setLastName( String last ){
            lastName = last;
        }
        // dohvati prezime
        public String getLastName(){
            return lastName;
        }
        // postavi stanje računa
        public void setBalance( double bal ){
            balance = bal;
        }
        // dohvati stanje računa
        public double getBalance(){
            return balance;
        }
}
    
    
    public class CreateTextFile{
        private Formatter output; // objekt za unos u datoteku
        // otvori datoteku
        public void openFile(){
            
          output = new Formatter( "clients.txt" );
        }
        // dodaj u datoteku
        public void addRecords(){
            // objekt koji zapisujemo u datoteku
            AccountRecord record = new AccountRecord();
            record.setAccount(1 );
            record.setFirstName( "Pero" );
            record.setLastName( "Peric" );
            record.setBalance( 10.00 );
            if ( record.getAccount() > 0 ){
                // dodaj novi zapis
                output.format( "%d %s %s %.2f\n", record.getAccount(),
                record.getFirstName(), record.getLastName(),
                record.getBalance() );
            }
            else{
                System.out.println("Broj računa mora biti veći od 0" );
            }
        }
        public void closeFile(){
            if ( output != null )
                output.close();
        }
    
    }
}


