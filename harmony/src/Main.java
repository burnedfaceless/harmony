import com.staffcasts.harmony.SeventhChord;
import com.staffcasts.harmony.SeventhChordQuality;
import com.staffcasts.harmony.Triad;
import com.staffcasts.harmony.TriadQuality;

/**
 * File: ${NAME}.java
 * Class: CSCI 1302
 * Author: Brian Abbott
 * Created on: 2/16/26
 * Last modified: 2/16/26
 * Description: To be filled in by the user.
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triad cMajor = new Triad();
        Triad cMinor = new Triad("C", TriadQuality.MINOR);
        System.out.println(cMajor.getChord());
        System.out.println(cMinor.getChord());
        SeventhChord cMajor7 = new SeventhChord("C", SeventhChordQuality.MAJORSEVENTH);
        SeventhChord cMinor7 = new SeventhChord("C", SeventhChordQuality.MINORSEVENTH);
        System.out.println(cMajor7.getChord());
        System.out.println(cMinor7.getChord());
    }
}