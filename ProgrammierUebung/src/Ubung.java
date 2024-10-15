import java.util.Scanner;


public class Ubung {
    /**
     * @param args
     * @throws Exception
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Welcome to Java Programming Language! \n We are going to do soem exercises in Java Programming Language. \n Let's get started! \n");



// Übung 1: Lesen Sie eine Zahl mit Nachkommastellen ein
// Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine Zahl mit Nachkommastellen einzugeben. Das Programm soll die eingegebene Zahl lesen und anschließend auf der Konsole ausgeben.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Zahl mit Nachkommastellen ein: ");
        double zahl = scanner.nextDouble();
        System.out.println("Ihre eingegebene Zahl mit Nachkommastellen ist: "+ zahl);


// Übung 2: Lesen Sie eine Textzeile ein
// Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine Textzeile einzugeben. Das Programm soll die eingegebene Textzeile lesen und anschließend auf der Konsole ausgeben.
        System.out.println("Bitte geben Sie eine Textzeile ein:");
        scanner.nextLine(); 
        String text = scanner.nextLine();
        System.out.println("Eingegebene Textzeile: " + text);

        System.out.println("Bitte gib diene Textzeile hier ein: ");
        String text1 = scanner.nextLine();
        System.out.println("Ihre eingegebene Textzeile sind: " + text1);


// Übung 3: Lesen Sie ein einzelnes Zeichen ein
// Schreiben Sie ein Java-Programm, das den Benutzer auffordert, ein einzelnes Zeichen einzugeben. Das Programm soll das eingegebene Zeichen lesen und anschließend auf der Konsole ausgeben.
        System.out.println("Bitte geben Sie ein einzelnes Zeichen ein:");
        char zeichen = scanner.next().charAt(0);
        System.out.println("Eingegebenes Zeichen: " + zeichen);


// Übung 4: Kombinierte Eingabe von verschiedenen Werten
// Schreiben Sie ein Java-Programm, das den Benutzer auffordert, den Vornamen, das Geschlecht, das Alter und die Größe in m einzugeben. Das Programm soll die eingegebenen Werte lesen und anschließend auf der Konsole ausgeben. Die Ausgabe soll wie folgt aussehen. (die Abstände sind ein Tab)

// Sie haben folgende Werte eingegeben:
// Vorname:    <eingegebener Vorname>

// Alter:    <eingegebens Alter>

// Groesse:    <eingegebene Groesse in m>

// Geschlecht:    <eingegebenes Geschlecht>
System.out.println("Bitte geben Sie Ihrem Vornamen ein: ");
String vorname = scanner.next();
System.out.println("Bitte geben Sie ihr Geschlecht ein: ");
String geschlecht = scanner.next();
System.out.println("Bitte geben Sie Ihr Alter ein: ");
short alter = scanner.nextShort();
System.out.println("Bitte geben Sie Ihre Groesse in m ein: ");
double grosse = scanner.nextDouble();

System.out.println("\n\nSie haben folgende Werte eingegeben: ");
System.out.println("Vorname:\t\t"+ vorname);
System.out.println("Geschlescht:\t\t"+ geschlecht);
System.out.println("Alter:\t \t\t "+ alter);
System.out.println("Groesse:\t\t"+ grosse + " m/2");



// Übung 5: Berechnen Sie den Flächeninhalt eines Rechtecks
// Schreiben Sie ein Java-Programm, das den Benutzer auffordert, die Länge und Breite eines Rechtecks einzugeben. Das Programm soll die eingegebenen Werte lesen und anschließend den Flächeninhalt des Rechtecks berechnen und auf der Konsole ausgeben.

        // Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Lange und Bretie des Rechtecks ein: ");
        double lange = scanner.nextDouble();
        double breite = scanner.nextDouble();
        double flacheninhalt = lange * breite;
        System.out.println("Der Flacheninhalt des Rechteck sind: "+ flacheninhalt + " m/2");
    }
}
