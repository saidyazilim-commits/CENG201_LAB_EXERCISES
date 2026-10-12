/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Muhammed Said Genç
 * Student ID:  240446015
 * Date:        10.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // TODO: Create one Track object using EACH of the four constructors.
        //       Print each track's toString() result.
        //       Also test getDurationFormatted() and individual getters.
        //       Test the invalid-duration case (negative value).

        // --- Default constructor ---
        System.out.println("Default Track:");
        Track track = new Track();
        System.out.println(track);
        System.out.println();
        // --- Title-only constructor ---
        System.out.println("Title-only track");
        Track track2 = new Track("Neon Lights");
        System.out.println(track2);
        System.out.println();
        // --- Title + artist constructor ---
        System.out.println("Title + Artist Track:");
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println(track3);
        System.out.println();
        // --- Full constructor ---
        System.out.println("Full Track (non-explicit):");
        Track track4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(track4);
        System.out.println();
        // --- Getter test ---
        System.out.println("Getter Test:");
        Track track5 = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:    " + track5.getTitle());
        System.out.println("Artist:   " + track5.getArtist());
        System.out.println("Duration: " + track5.getDurationFormatted());
        System.out.println("Explicit: " + track5.isExplicit());
        System.out.println();
        // --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        Track track6 = new Track("Broken Clock", "Static Noise", -50, false);
        System.out.println(track6);
        System.out.println();


    }
}