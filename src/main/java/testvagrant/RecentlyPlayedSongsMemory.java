package testvagrant;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RecentlyPlayedSongsMemory {
	  /* OVERVIEW
    Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. This store must have the capability to store a list of song-user pairs, with each song linked to a user. It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.
    EXAMPLE
    Illustration, when 4 different songs were played by a user & Initial capacity is 3:
    Let's assume that the user has played 3 songs - S1, S2 and S3.
    The playlist would look like -> S1,S2,S3
    When S4 song is played -> S2,S3,S4
    When S2 song is played -> S3,S4,S2
    When S1 song is played -> S4,S2,S1
    */
   //Time Complexity = O(N)
   //Space Complexity = O(U*N) where U is users
	
	private int capacity;
	private Map<String, LinkedList<String>> recentPlayedSongs;
	
	
	
	
	public RecentlyPlayedSongsMemory(int capacity) {
		this.capacity = capacity;
		this.recentPlayedSongs = new HashMap<>();
	}
	
	public void addRecentlyPlayedSong(String user,String song) {
		recentPlayedSongs.computeIfAbsent(user, k -> new LinkedList<>());
		
		LinkedList<String> songList = recentPlayedSongs.get(user);
		
		// Remove the song if already exists in the list to update its recentness
		songList.remove(song);
		
		// Add the song to the beginning of the list
		songList.add(0,song);
		
		// Check if the list has exceeded the capacity, remove the least recently played song
		if (songList.size() > capacity) {
			songList.removeLast();
		}

	}
	
	public LinkedList<String> getRecentlyPlayedSongs(String user) {
		 return recentPlayedSongs.getOrDefault(user, new LinkedList<>());

	}
	
	
	public static void main(String[] args) {
		int initalCapacity = 3;
		RecentlyPlayedSongsMemory memory = new RecentlyPlayedSongsMemory(initalCapacity);
		
		// User 1 
		memory.addRecentlyPlayedSong("User1", "S1");
		memory.addRecentlyPlayedSong("User1", "S2");
		memory.addRecentlyPlayedSong("User1", "S3");
		
		System.out.println("User1's recently played songs: " + memory.getRecentlyPlayedSongs("User1"));
		
		
		// User 1 - plays song S4
		memory.addRecentlyPlayedSong("User1", "S4");
		System.out.println("User1's recently played songs after playing song S4: " + memory.getRecentlyPlayedSongs("User1"));
		// User 1 - plays song S2 again
		memory.addRecentlyPlayedSong("User1", "S2");
		System.out.println("User1's recently played songs after playing song S2 again: " + memory.getRecentlyPlayedSongs("User1"));
		// User 1 - plays song S1 again
		memory.addRecentlyPlayedSong("User1", "S1");
		System.out.println("User1's recently played songs after playing song S1 again: " + memory.getRecentlyPlayedSongs("User1"));
		
		
		
		
	}
	
	
	

}
