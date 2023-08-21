# Recently Played Songs Memory

This project provides an in-memory store for managing recently played songs per user. It can accommodate a fixed number of songs per user and manages the capacity by eliminating the least recently played songs when the store becomes full.

## Overview

The goal of this project is to create an in-memory store that can hold recently played songs for multiple users. The store has the following features:

- Each user can have a list of recently played songs.
- The store can accommodate a specified number of songs per user.
- When a new song is added for a user, the least recently played song is removed if the capacity is exceeded.

## Usage

To use this in-memory store, follow these steps:

1. Instantiate a `RecentlyPlayedSongsMemory` object with the desired initial capacity:

    ```java
    int initialCapacity = 3;
    RecentlyPlayedSongsMemory memory = new RecentlyPlayedSongsMemory(initialCapacity);
    ```

2. Add recently played songs for a user:

    ```java
    memory.addRecentlyPlayedSong("User1", "S1");
    memory.addRecentlyPlayedSong("User1", "S2");
    memory.addRecentlyPlayedSong("User1", "S3");
    ```

3. Retrieve a user's recently played songs:

    ```java
    LinkedList<String> user1Songs = memory.getRecentlyPlayedSongs("User1");
    ```

4. Play new songs for a user:

    ```java
    memory.addRecentlyPlayedSong("User1", "S4");
    ```

5. Display the updated list of recently played songs:

    ```java
    LinkedList<String> user1UpdatedSongs = memory.getRecentlyPlayedSongs("User1");
    ```

## Code Explanation

The core features of this project are implemented through the `RecentlyPlayedSongsMemory` class. The key methods and their explanations are as follows:

- `addRecentlyPlayedSong(String user, String song)`: Adds a recently played song for a user. If the user's list exceeds the capacity, the least recently played song is removed.

- `getRecentlyPlayedSongs(String user)`: Retrieves the list of recently played songs for a user. If the user doesn't exist, an empty list is returned.

- The `computeIfAbsent` method is used to ensure that each user has an associated list of songs. If the user key is not present in the map, a new `LinkedList` is created for that user.

## Example

Please refer to the provided code examples in the source files for a detailed illustration of how to use the `RecentlyPlayedSongsMemory` class.

## License

This project is licensed under the MIT License. Feel free to use and modify it according to your needs.

---

For more information, feel free to reach out to the author.
