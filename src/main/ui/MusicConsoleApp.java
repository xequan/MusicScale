package main.ui;

import main.business.BassDisplay;
import main.business.MusicProgram;
import main.business.TrebleDisplay;

import java.util.Scanner;


import main.db.Scales;
import main.ui.util.Displayable;
import main.ui.util.IOFactory;
import main.ui.util.Validatable;

/**
 * @author Team A on 3/15/2016.
 * This applicaiton will list music notes for different scales and chords
 */
public class MusicConsoleApp {
    static Displayable output = IOFactory.getDisplayable();
    static Validatable input = IOFactory.getValidatable();

    public static void main(String[] args) {

        String continueString = null;
        MusicProgram userMusicProgram = new MusicProgram();
        int menuOption = 0;


        output.display("Welcome to the Music Database!");


        do {
            menuOption = mainMenu();
            runMainMenuOption(menuOption, userMusicProgram);
            continueString = input.getChoiceString("Continue? (y/n)", "y", "n");
        } while (continueString.equalsIgnoreCase("y"));

        output.display("bye");


    }

    /**
     * List all menu options and return the user selected menu option number
     * @return user selected menu option
     */
    public static int mainMenu() {
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

        menuNumber = input.getIntWithinRange(menuString.toString(), 1, 10);

        return menuNumber;
    }

    public static String subMenu(){
        String choice = "";
        choice = input.getChoiceString("Choose one of the following: (bass/treble)", "bass", "treble");
        return choice;
    }

    /**
     * Run the menu option the user selects
     * @param menuOption user selected menu option
     * @param userMusicProgram MusicProgram class
     */
    public static void runMainMenuOption(int menuOption, MusicProgram userMusicProgram) {
        String inputString = "";
        String[] chromaticScale = userMusicProgram.getChromaticMusicScale();
        String subMenuOption;
        Scales userScale;

        switch (menuOption) {
            case 1:
                userMusicProgram.listAllChromaticNotes();
                break;
            case 2:
            	userScale = Scales.MAJOR;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 3:
            	userScale = Scales.MINOR;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 4:
            	userScale = Scales.DORIAN;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 5:
            	userScale = Scales.BLUES;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 6:
            	userScale = Scales.MAJORCHORD;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 7:
            	userScale = Scales.MINORCHORD;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 8:
            	userScale = Scales.MAJORSEVENTHCHORD;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 9:
            	userScale = Scales.MINORSEVENTHCHORD;
                inputString = input.getChoiceArray("Enter a note on the chromatic scale", chromaticScale);
                userMusicProgram.listScale(userScale, inputString);
                break;
            case 10:
                subMenuOption = subMenu();
                runSubMenuOption(subMenuOption, chromaticScale);
                break;
        }
    }

    public static void runSubMenuOption(String menuOption, String[] chromaticScale){
        String inputString;
        String choice;
        String[] choices;
        BassDisplay myBassDisplay = new BassDisplay();
        TrebleDisplay myTrebleChoice = new TrebleDisplay();

       switch (menuOption.toLowerCase()){
           case "bass":
               choice = subMenuChoice(chromaticScale);
               choices = choice.split(" ");
               if (choices.length == 1) {
                   myBassDisplay.BassNoteDisplay(choices[0]);
               } else if (choices.length == 2) {
                   myBassDisplay.BassNoteDisplay(choices[0], choices[1]);
               } else if (choices.length == 3){
                   myBassDisplay.BassNoteDisplay(choices[0], choices[1], choices[2]);
               }
               break;
           case "treble":
               choice = subMenuChoice(chromaticScale);
               choices = choice.split(" ");
               if (choices.length == 1) {
                   myTrebleChoice.TrebleNoteDisplay(choices[0]);
               } else if (choices.length == 2) {
                   myTrebleChoice.TrebleNoteDisplay(choices[0], choices[1]);
               } else if (choices.length == 3){
                   myTrebleChoice.TrebleNoteDisplay(choices[0], choices[1], choices[2]);
               }
               myTrebleChoice.TrebleNoteDisplay(choices[0]);
               break;
           default:
               break;

       }
    }

    public static String subMenuChoice(String[] chromaticScale) {
        String inputString;
        String returnString = "";
        String choice;
        int count = 0;

        output.display("Enter up to 3 notes.");
        do {
            inputString = input.getChoiceArray("Enter a note on the chromatic scale.", chromaticScale) + " ";
            returnString += inputString;
            if (count > 1){
                break;
            }
            choice = input.getChoiceString("Enter another note? (y/n)", "y", "n");
            count++;
        } while (choice.equalsIgnoreCase("y"));
        return returnString;
    }
}
