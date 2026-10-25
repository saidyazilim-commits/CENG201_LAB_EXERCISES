# Lab 3: Doubly Linked List - Music Player Playlist

This laboratory exercise covers the implementation and manipulation of a **Doubly Linked List (DLL)** through a simulated real-world music playlist system.

---

## 🎵 Overview

In contrast to singly linked lists, each node in a doubly linked list maintains references to both its successor (`next`) and its predecessor (`prev`). This structure allows bidirectional traversal and efficient node removal operations.

---

## 🛠️ Components

* **`SongNode.java`**: The basic node structure holding the song title string and two pointers: `prev` and `next`.
* **`MusicPlaylist.java`**: Manages the playlist via three internal pointer references:
  * `head`: Points to the first song.
  * `tail`: Points to the last song (enabling $O(1)$ additions at the end).
  * `current`: Tracks the actively playing track.
* **`MusicPlayerDemo.java`**: Driver application executing test cases according to the lab specifications.

---

## ⚙️ Core Operations & Logic

### 1. Appending Songs (`addSong`)
* **Empty List:** When no songs exist, the new node simultaneously becomes `head`, `tail`, and `current`.
* **Non-Empty List:** The new node links backwards to the current `tail` (`newNode.prev = tail`), the current `tail` links forward to the new node (`tail.next = newNode`), and `tail` is updated to the new node.

### 2. Bidirectional Traversal (`nextSong` & `previousSong`)
* **Forward Movement:** Moves `current` to `current.next` if a forward node exists; flags an alert when reaching the boundary.
* **Backward Movement:** Moves `current` to `current.prev` if a preceding node exists; flags an alert when at the start.

### 3. Comprehensive Removal (`removeSong`)
Handles pointer relinking across multiple scenarios to maintain list integrity:
* **Current Song Deleted:** Safely advances `current` to `current.next` (or shifts to `current.prev` if at the end) prior to removal.
* **Single Element:** If `head == tail`, all pointers (`head`, `tail`, `current`) reset to `null`.
* **Head Node:** Reassigns `head = head.next` and disconnects `head.prev = null`.
* **Tail Node:** Reassigns `tail = tail.prev` and disconnects `tail.next = null`.
* **Intermediate Node:** Bridges the neighboring nodes directly:
  ```java
  nodeToRemove.prev.next = nodeToRemove.next;
  nodeToRemove.next.prev = nodeToRemove.prev;