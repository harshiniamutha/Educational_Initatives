public class Main {
    public static void main(String[] args) {
        System.out.println("=== Adapter Pattern Demo ===\n");
        
        AudioPlayer audioPlayer = new AudioPlayer();
        
        // Example 1: Play MP3 (built-in support)
        System.out.println("1. Playing MP3 (built-in support):");
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        System.out.println();
        
        // Example 2: Play MP4 (using adapter)
        System.out.println("2. Playing MP4 (using adapter):");
        audioPlayer.play("mp4", "alone.mp4");
        System.out.println();
        
        // Example 3: Play VLC (using adapter)
        System.out.println("3. Playing VLC (using adapter):");
        audioPlayer.play("vlc", "far far away.vlc");
        System.out.println();
        
        // Example 4: Try unsupported format
        System.out.println("4. Trying unsupported format:");
        audioPlayer.play("avi", "mind me.avi");
        System.out.println();
        
        // Example 5: Show how adapter works internally
        System.out.println("5. Direct adapter usage:");
        MediaAdapter mp4Adapter = new MediaAdapter("mp4");
        mp4Adapter.play("mp4", "sample.mp4");
        
        MediaAdapter vlcAdapter = new MediaAdapter("vlc");
        vlcAdapter.play("vlc", "sample.vlc");
    }
}
