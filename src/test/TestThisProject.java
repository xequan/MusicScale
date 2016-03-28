package test;

import main.business.MusicProgram;
import main.db.MusicDB;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author DM53848 on 3/14/2016.
 * Test the methods of this project
 */
public class TestThisProject {



    public void TestListScale() {
        System.out.println("@Test TestListScale()");
        String testKey = "D#";
        int index = 0;
        MusicProgram testMusicProgram = new MusicProgram();
        testMusicProgram.listScale("major", "c");
        System.out.println();
        testMusicProgram.listScale("major", "F#");
        System.out.println();
        testMusicProgram.listScale("minor", "A");
        System.out.println();
        testMusicProgram.listScale("dorian", "D#");
        System.out.println();
        testMusicProgram.listScale("blues", "C");
        System.out.println();
        testMusicProgram.listScale("majorchord", "c");
        System.out.println();
        testMusicProgram.listScale("minorchord", "A");
        System.out.println();
        testMusicProgram.listScale("majorSeventhChord", "C");
        System.out.println();
        testMusicProgram.listScale("minorSeventhChord", "A");

    }

    @Test
    public void asciiNotes() {
        System.out.println("The flat symbol is: \u266D_____________\u266D_________");
        System.out.println("The flat symbol is: _____________\u266D________");
    }

}