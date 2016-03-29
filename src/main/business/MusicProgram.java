package main.business;

import main.db.MusicDB;

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


}
