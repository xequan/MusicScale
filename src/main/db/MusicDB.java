package main.db;

/**
 * @author Team A on 3/14/2016.
 * Store chromatic Music Scale, and the steps for major and minor scales, blues scale, dorian scale, major and minor
 * chords, major seventh and minor seventh chords.
 */
public class MusicDB {
    private final String[] chromaticMusicScale = {"C",  "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    public int musicScaleLength = 0;
    private final String[] majorScale = {"W", "W", "H", "W", "W", "W", "H"};
    private final String[] minorScale = {"W", "H", "W", "W", "H", "W", "W"};
    private final String[] bluesScale = {"3", "W", "W", "3", "W"};
    private final String[] dorianScale = {"W", "H", "W", "W", "W", "H", "W"};
    private final String[] majorChord = {"4","3"};
    private final String[] minorChord = {"3","4"};
    private final String[] majorSeventhChord = {"4","3","4"};
    private final String[] minorSeventhChord = {"3","4","3"};

    //Look Joe added something to the code


    public String[] getChromaticMusicScale() {
        return chromaticMusicScale;
    }

    public int getChromaticMusicScaleLength() {
        return this.chromaticMusicScale.length;
    }

    /**
     * Returns the array for the target music scale
     * @param targetScale passed string that contains which music scale to return
     * @return return music scale array
     */
    public String[] getScale(String targetScale) {
        if (targetScale == "major") {
            this.musicScaleLength = majorScale.length;
            return majorScale;
        } else if (targetScale.equalsIgnoreCase("minor")) {
            this.musicScaleLength = minorScale.length;
            return minorScale;
        } else if (targetScale.equalsIgnoreCase("dorian")) {
            this.musicScaleLength = dorianScale.length;
            return  dorianScale;
        } else if (targetScale.equalsIgnoreCase("blues")) {
            this.musicScaleLength = bluesScale.length;
            return  bluesScale;
        } else if (targetScale.equalsIgnoreCase("majorchord")) {
            this.musicScaleLength = majorChord.length;
            return  majorChord;
        } else if (targetScale.equalsIgnoreCase("minorchord")) {
            this.musicScaleLength = minorChord.length;
            return  minorChord;
        }  else if (targetScale.equalsIgnoreCase("majorSeventhChord")) {
            this.musicScaleLength = majorSeventhChord.length;
            return  majorSeventhChord;
        } else if (targetScale.equalsIgnoreCase("minorSeventhChord")) {
            this.musicScaleLength = minorSeventhChord.length;
            return  minorSeventhChord;
        } else {
            return null;
        }
    }

    public int getMusicScaleLength() {
        return musicScaleLength;
    }



}
