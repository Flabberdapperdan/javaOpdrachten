
//waarde van kenmerk
// Strongly typed
// code conventie is klasse met hoofdletter

// has-a relatie - richting zichtbaarheid - multipliciteit
// de zichtbaarheid loopt van ... naar ...
// is-a relatie

// Konijn Dier ja
// Konijn Konijn ja
// Dier Konijn nee
// Konijn OliteTanker nee

// classe
// object
// type van een var strongly typed
// parameter
// methode
// returntype
// een aanroep van een methode kun je vervangen 
            //door datgene dat hij returned
// Has-a relatie     Mens Telefoon     Auto Wiel   // richting zichtbaarheid multipliciteit
// Is-a relatie    Mens Leraar      Auto Voertuig
// Konijn    Dier       ja
// Konijn    Konijn     ja
// Dier      Konijn     (misschien ligt eraan )
// Konijn    OlieTanker nee

// shadowing - als twee var

// Constructor
// Casten
// abstract

// Casten
// abstract

// final - niet te veranderen
// static - variabelen die voor iedereen gelijk zijn (maar wel gewijzigd kunnen worden) 
// 

public class learnJava {
    public static void main(String[] args) {
        String zinnetje = "Het is vandaag bewolkt en morgen waarschijnlijk ook";
        String newString = zinnetje.substring(5, 15);
        System.out.println(newString);
    }
}
