/**
 * MusicPlayerDemo.java
 *
 * Tests the playlist
 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        // Create the playlist object
        MusicPlaylist playlist = new MusicPlaylist();

        // Add songs
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        // 1. Display Playlist
        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();
        System.out.println();

        // 2. Display Current Song
        System.out.println("=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();
        System.out.println();

        // 3. Move Next
        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();

        // 4. Move Next
        System.out.println("=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println();

        // 5. Move Previous
        System.out.println("=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();
        System.out.println();

        // 6. Remove "Shape of You" and display playlist
        System.out.println("=== AFTER REMOVING Shape of You SONG ===");
        playlist.removeSong("Shape of You - Ed Sheeran");
        playlist.displayPlaylist();
        System.out.println();

        // 7. Remove "Snap" and display playlist
        System.out.println("=== AFTER REMOVING Snap SONG ===");
        playlist.removeSong("Snap - Manifest");
        playlist.displayPlaylist();
    }
}