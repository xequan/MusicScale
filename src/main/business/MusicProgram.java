package main.business;

import main.db.MusicDB;
import main.ui.MusicConsoleApp;

import java.util.Scanner;

/**
 * @author Team A on 3/16/2016.
 * use the MusicDB and MusicConsoleApp to get user input and display the menu option results to the console
 */
public class MusicProgram {
    private MusicDB userMusicDB;
    private String[] chromaticMusicScale;
    private String[] musicScale;
    private String key = "";
    private int keyIndex = 0;

    public MusicProgram() {
        this.userMusicDB = new MusicDB();
        this.chromaticMusicScale = this.userMusicDB.getChromaticMusicScale();
    }

    public String[] returnChromaticScaleArray() {
        return this.chromaticMusicScale;
    }


    public void setKey(String key) {
        this.key = key;
        setInitialKeyIndex();
    }

    public String[] getChromaticMusicScale() {
        return chromaticMusicScale;
    }


    public void listAllChromaticNotes() {
        int musicScaleLength = userMusicDB.getChromaticMusicScaleLength();
        StringBuilder chromaticNotesString = new StringBuilder();
        for (int i = 0; i < musicScaleLength; i++) {
            System.out.print(this.chromaticMusicScale[i] + " ");
        }
        System.out.println();
    }


    /**
     * This will display all notes of a user selected scale.  Music scale data is taken from the MusicDB
     * @param scale MusicDB targetScale
     * @param key starting note on the chromatic scale
     */
    public void listScale(String scale, String key) {
        setKey(key);
        this.musicScale = this.userMusicDB.getScale(scale);
        int musicScaleIndex = 0;
        try {
            System.out.print(this.chromaticMusicScale[this.keyIndex] + " ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You must print out a valid note.");
        }

        for (; musicScaleIndex < this.userMusicDB.getMusicScaleLength() ; musicScaleIndex++) {

            switch (this.musicScale[musicScaleIndex]) {
                case "W":
                    this.keyIndex += 2;
                    break;
                case "H":
                    this.keyIndex += 1;
                    break;
                case "3":
                    this.keyIndex += 3;
                    break;
                case "4":
                    this.keyIndex += 4;
                    break;
                default:
            }
            if (this.keyIndex >= this.userMusicDB.getChromaticMusicScaleLength()){
                this.keyIndex = this.keyIndex - this.userMusicDB.getChromaticMusicScaleLength();
            }
            System.out.print(this.chromaticMusicScale[this.keyIndex] + " ");
        }
    }


    /**
     * When the user inputs a starting note/key this will get the index from the MusicDB chromaticMusicScale array
     * for that note/key
     */
    private void setInitialKeyIndex() {
        int index = 0;

        for (; index < this.userMusicDB.getChromaticMusicScaleLength(); index++ ) {
            if (this.chromaticMusicScale[index].equalsIgnoreCase(this.key)) {
                break;
            }
        }
        this.keyIndex = index;

    }


    /**
     * The user enters a note and this will display it on the scale.
     * This method has UI elements and will loop back if the user enters y
     */
    public void displayNote() {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        String noteOne="";
        String noteTwo="";
        String noteThree="";
        String noteFour="";
        String clefChoice = "";

        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Would you like Treble or Bass Clef? ");
            clefChoice = sc.nextLine();
            clefChoice=clefChoice.toLowerCase();


            switch(clefChoice){

                case ("treble"):


                    System.out.print("What is the first note you would you like displayed? ");
                    noteOne = sc.nextLine();
                    noteOne=noteOne.toLowerCase();
                    System.out.print("What is the second note you would you like displayed? ");
                    noteTwo = sc.nextLine();
                    noteTwo=noteTwo.toLowerCase();
                    System.out.print("What is the third note you would you like displayed? ");
                    noteThree = sc.nextLine();
                    noteThree=noteThree.toLowerCase();
                    System.out.print("What is the fourth note you would you like displayed? ");
                    noteFour = sc.nextLine();
                    noteFour=noteFour.toLowerCase();

                    String c1="";
                    String d1="";
                    String e1="-";
                    String f1="";
                    String g1="-";
                    String a1="";
                    String b1="";
                    String c2="";
                    String d2="";
                    String e2="-";
                    String f2="";
                    String g2="-";
                    String a2="";
                    String b2="";
                    String c3="";
                    String d3="";
                    String e3="-";
                    String f3="";
                    String g3="-";
                    String a3="";
                    String b3="";
                    String c4="";
                    String d4="";
                    String e4="-";
                    String f4="";
                    String g4="-";
                    String a4="";
                    String b4="";


                    switch(noteOne){
                        case "b":
                            b1="O";
                            break;
                        case "a":
                            a1="O";
                            break;
                        case "g":
                            g1="O";
                            break;
                        case "f":
                            f1="O";
                            break;
                        case "e":
                            e1="O";
                            break;
                        case "d":
                            d1="O";
                            break;
                        case "c":
                            c1="--O--";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }

                    switch(noteTwo){
                        case "b":
                            b2="O";
                            break;
                        case "a":
                            a2="O";
                            break;
                        case "g":
                            g2="O";
                            break;
                        case "f":
                            f2="O";
                            break;
                        case "e":
                            e2="O";
                            break;
                        case "d":
                            d2="O";
                            break;
                        case "c":
                            c2="--O--";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }

                    switch(noteThree){
                        case "b":
                            b3="O";
                            break;
                        case "a":
                            a3="O";
                            break;
                        case "g":
                            g3="O";
                            break;
                        case "f":
                            f3="O";
                            break;
                        case "e":
                            e3="O";
                            break;
                        case "d":
                            d3="O";
                            break;
                        case "c":
                            c3="--O--";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }

                    switch(noteFour){
                        case "b":
                            b4="O";
                            break;
                        case "a":
                            a4="O";
                            break;
                        case "g":
                            g4="O";
                            break;
                        case "f":
                            f4="O";
                            break;
                        case "e":
                            e4="O";
                            break;
                        case "d":
                            d4="O";
                            break;
                        case "c":
                            c4="--O--";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }




                    System.out.println("T---------------------------------------------");
                    System.out.println("R            ");
                    System.out.println("E---------------------------------------------");
                    System.out.println("B              ");
                    System.out.println("L--"+b1+"----"+b2+"----"+b3+"----"+b4+"-------------------------------");
                    System.out.println("E  "+a1+"    "+a2+"    "+a3+"    "+a4+"     ");
                    System.out.println(" --"+g1+"----"+g2+"----"+g3+"----"+g4+"---------------------------");
                    System.out.println("   "+f1+"    "+f2+"    "+f3+"    "+f4);
                    System.out.println(" --"+e1+"----"+e2+"----"+e3+"----"+e4+"---------------------------");
                    System.out.println(""+"   "+d1+"    "+d2+"    "+d3+"    "+d4);
                    System.out.println(" "+c1+"    "+c2+"    "+c3+"    "+c4);
                    break;


                case("bass"):
                    System.out.print("What is the first note you would you like displayed? ");
                    noteOne = sc.nextLine();
                    noteOne=noteOne.toLowerCase();
                    System.out.print("What is the second note you would you like displayed? ");
                    noteTwo = sc.nextLine();
                    noteTwo=noteTwo.toLowerCase();
                    System.out.print("What is the third note you would you like displayed? ");
                    noteThree = sc.nextLine();
                    noteThree=noteThree.toLowerCase();
                    System.out.print("What is the fourth note you would you like displayed? ");
                    noteFour = sc.nextLine();
                    noteFour=noteFour.toLowerCase();

                    String cb1="-";
                    String db1="";
                    String eb1="-";
                    String fb1="";
                    String gb1="-";
                    String ab1="";
                    String bb1="-";
                    String cb2="-";
                    String db2="";
                    String eb2="-";
                    String fb2="";
                    String gb2="-";
                    String ab2="";
                    String bb2="-";
                    String cb3="-";
                    String db3="";
                    String eb3="-";
                    String fb3="";
                    String gb3="-";
                    String ab3="";
                    String bb3="-";
                    String cb4="-";
                    String db4="";
                    String eb4="-";
                    String fb4="";
                    String gb4="-";
                    String ab4="";
                    String bb4="";

                    switch(noteOne){
                        case "b":
                            bb1="O";
                            break;
                        case "a":
                            ab1="O";
                            break;
                        case "g":
                            gb1="O";
                            break;
                        case "f":
                            fb1="O";
                            break;
                        case "e":
                            eb1="O";
                            break;
                        case "d":
                            db1="O";
                            break;
                        case "c":
                            cb1="O";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }

                    switch(noteTwo){
                        case "b":
                            bb2="O";
                            break;
                        case "a":
                            ab2="O";
                            break;
                        case "g":
                            gb2="O";
                            break;
                        case "f":
                            fb2="O";
                            break;
                        case "e":
                            eb2="O";
                            break;
                        case "d":
                            db2="O";
                            break;
                        case "c":
                            cb2="O";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }

                    switch(noteThree){
                        case "b":
                            bb3="O";
                            break;
                        case "a":
                            ab3="O";
                            break;
                        case "g":
                            gb3="O";
                            break;
                        case "f":
                            fb3="O";
                            break;
                        case "e":
                            eb3="O";
                            break;
                        case "d":
                            db3="O";
                            break;
                        case "c":
                            cb3="O";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }

                    switch(noteFour){
                        case "b":
                            bb4="O";
                            break;
                        case "a":
                            ab4="O";
                            break;
                        case "g":
                            gb4="O";
                            break;
                        case "f":
                            fb4="O";
                            break;
                        case "e":
                            eb4="O";
                            break;
                        case "d":
                            db4="O";
                            break;
                        case "c":
                            cb4="O";
                            break;
                        case "":
                            break;
                        default:
                            System.out.println("Invalid note, please try again.");
                            continue;
                    }

                    System.out.println("B--" + bb1 + "----" + bb2 + "----" + bb3 + "----" + bb4 + "-------------------------------");
                    System.out.println("A  " + ab1 + "    " + ab2 + "    " + ab3 + "    " + ab4 + "     ");
                    System.out.println("S--" + gb1 + "----" + gb2 + "----" + gb3 + "----" + gb4 + "------------------------------");
                    System.out.println("S  " + fb1 + "    " + fb2 + "    " + fb3 + "    " + fb4);
                    System.out.println(" --" + eb1 + "----" + eb2 + "----" + eb3 + "----" + eb4 + "------------------------------");
                    System.out.println("   " + db1 + "    " + db2 + "    " + db3 + "    " + db4);
                    System.out.println(" --" + cb1 + "----" + cb2 + "----" + cb3 + "----" + cb4 + "------------------------------");
                    break;


            }
            System.out.print("\nContinue with option 10? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }


}
