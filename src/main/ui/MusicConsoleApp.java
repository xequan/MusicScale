package main.ui;

import main.business.MusicProgram;

import java.util.Scanner;

import static main.ui.IOFactory.getConsole;

/**
 * @author Team A on 3/15/2016.
 * This applicaiton will list music notes for different scales and chords
 */
public class MusicConsoleApp {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String continueString = null;
        MusicProgram userMusicProgram = new MusicProgram();
        int menuOption = 0;

        MusicConsole console = getConsole();
        console.print("Welcome to the Music Database!");


        do {
            menuOption = mainMenu(console);
            runMainMenuOption(menuOption, userMusicProgram, console);
            System.out.println("Continue? (y/n): ");
            continueString = inputScanner.next();
        } while (continueString.equalsIgnoreCase("y"));

        inputScanner.close();
        System.out.println("bye");


    }

    /**
     * List all menu options and return the user selected menu option number
     * @return user selected menu option
     */
    public static int mainMenu(MusicConsole console) {
        String inputString = "";
        StringBuilder menuString = new StringBuilder();
        int menuNumber = 0;

        menuString.append("Please select one of the following options\n");
        menuString.append("1.  List all chromatic notes: \n");
        menuString.append("2.  List major notes of a scale: \n");
        menuString.append("3.  List minor notes of a scale: \n");
        menuString.append("4.  List blues scale: \n");
        menuString.append("5.  List dorion scale: \n");
        menuString.append("6.  List major chord triad: \n");
        menuString.append("7.  List minor chord triad: \n");
        menuString.append("8.  List 4 notes of major 7th chord: \n");
        menuString.append("9.  List 4 notes of a minor 7th chord: \n");
        menuString.append("10. Display a note in bass or treble: ");

        menuNumber = console.getIntWithinRange(menuString.toString(), 1, 10);

        return menuNumber;
    }

    public static String subMenu(MusicConsole console){
        String choice = "";
        choice = console.getChoiceString("Choose one of the following: (bass/treble)", "bass", "treble");
        return choice;
    }

    /**
     * Run the menu option the user selects
     * @param menuOption user selected menu option
     * @param userMusicProgram MusicProgram class
     */
    public static void runMainMenuOption(int menuOption, MusicProgram userMusicProgram, MusicConsole console) {
        String inputString = "";
        String[] chromaticScale = userMusicProgram.getChromaticMusicScale();
        String subMenuOption;

        switch (menuOption) {
            case 1:
                userMusicProgram.listAllChromaticNotes();
                break;
            case 2:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("major", inputString);
                break;
            case 3:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("minor", inputString);
                break;
            case 4:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("blues", inputString);
                break;
            case 5:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("dorian", inputString);
                break;
            case 6:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("majorchord", inputString);
                break;
            case 7:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("minorchord", inputString);
                break;
            case 8:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("majorSeventhChord", inputString);
                break;
            case 9:
                inputString = console.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale("minorseventhchord", inputString);
                break;
            case 10:
                subMenuOption = subMenu(console);
                runSubMenuOption(subMenuOption, console, chromaticScale);
                break;
        }
    }

    public static void runSubMenuOption(String menuOption, MusicConsole console, String[] chromaticScale){
        String inputString;
        String choice;
        String[] choices;

       switch (menuOption.toLowerCase()){
           case "bass":
               choice = subMenuChoice(console, chromaticScale);
               choices = choice.split(" ");
               for (int i = 0; i < choices.length; i++){
                   System.out.print(choices[i] + " ");
               }
               break;
           case "treble":
               choice = subMenuChoice(console, chromaticScale);
               choices = choice.split(" ");
               for (int i = 0; i < choices.length; i++){
                   System.out.print(choices[i] + " ");
               }
               break;
           default:
               break;

       }
    }

    public static String subMenuChoice(MusicConsole console, String[] chromaticScale) {
        String inputString;
        String returnString = "";
        String choice;
        int count = 0;

        System.out.println("Enter up to 3 notes.");
        do {
            inputString = console.getChoiceArray("Enter a note on the chromatic scale.", chromaticScale) + " ";
            returnString += inputString;
            if (count > 1){
                break;
            }
            choice = console.getChoiceString("Enter another note? (y/n)", "y", "n");
            count++;
        } while (choice.equalsIgnoreCase("y"));
        return returnString;
    }
}
