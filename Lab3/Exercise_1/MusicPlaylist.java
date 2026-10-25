/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Muhammed Said Genç
 * Your Student ID:  240446015
 * Your Date:        25.10.2026
 */

public class MusicPlaylist {

    // private instances of the doubly linked list:
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // constructor: head, tail, and current are initialized to null
    public MusicPlaylist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove a song from the playlist
    public void removeSong(String title) {
        if (head == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        SongNode nodeToRemove = head;
        while (nodeToRemove != null && !nodeToRemove.title.equals(title)) {
            nodeToRemove = nodeToRemove.next;
        }

        if (nodeToRemove == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        System.out.println("Removed: " + nodeToRemove.title);

        // Update current pointer if the current song is being removed
        if (nodeToRemove == current) {
            if (current.next != null) {
                current = current.next;
            } else {
                current = current.prev;
            }
        }

        // Handle single element list
        if (head == tail) {
            head = null;
            tail = null;
            current = null;
            return;
        }

        // Handle head removal
        if (nodeToRemove == head) {
            head = head.next;
            head.prev = null;
            return;
        }

        // Handle tail removal
        if (nodeToRemove == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        // Handle middle node removal
        nodeToRemove.prev.next = nodeToRemove.next;
        nodeToRemove.next.prev = nodeToRemove.prev;
    }

    // Move to the next song
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }

    // Move to the previous song
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    // Display the current song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.title);
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    // Display all songs
    public void displayPlaylist() {
        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}