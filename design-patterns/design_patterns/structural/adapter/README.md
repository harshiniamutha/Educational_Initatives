# Adapter



Make incompatible interfaces work together by creating a bridge between them.


Code Flow Explanation:

What This Example Does:
This example demonstrates how to use the Adapter pattern to make an audio player support different audio formats. The AudioPlayer can natively play MP3 files, but uses adapters to play VLC and MP4 files through existing AdvancedMediaPlayer implementations.

Step-by-Step Code Flow:

1. MediaPlayer Interface (MediaPlayer.java)
   - Purpose: The target interface that the client expects
   - Contains: play() method that takes audioType and fileName
   - Represents: The standard interface for playing media files

2. AdvancedMediaPlayer Interface (AdvancedMediaPlayer.java)
   - Purpose: The existing/legacy interface that needs to be adapted
   - Contains: playVlc() and playMp4() methods
   - Represents: Third-party or existing media player functionality

3. Concrete Player Classes (VlcPlayer.java, Mp4Player.java)
   - Purpose: Implement the AdvancedMediaPlayer interface
   - Contains: Specific logic for playing VLC and MP4 files
   - Each class: Handles only its specific format

4. MediaAdapter Class (MediaAdapter.java)
   - Purpose: The adapter that bridges the two interfaces
   - Implements: MediaPlayer interface (target)
   - Contains: Reference to AdvancedMediaPlayer (adaptee)
   - Translates: MediaPlayer.play() calls to appropriate AdvancedMediaPlayer methods

5. AudioPlayer Class (AudioPlayer.java)
   - Purpose: The client that uses the MediaPlayer interface
   - Contains: Logic to handle different audio formats
   - Uses: MediaAdapter for VLC and MP4 formats
   - Handles: MP3 natively, delegates others to adapter

How to execute the code:

1. Navigate to the adapter folder in terminal:
   cd structural/adapter

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Adapter Pattern Demo ===

1. Playing MP3 (built-in support):
Playing mp3 file. Name: beyond the horizon.mp3

2. Playing MP4 (using adapter):
Playing mp4 file. Name: alone.mp4

3. Playing VLC (using adapter):
Playing vlc file. Name: far far away.vlc

4. Trying unsupported format:
Invalid media. avi format not supported

5. Direct adapter usage:
Playing mp4 file. Name: sample.mp4
Playing vlc file. Name: sample.vlc

Key Takeaways:
1. Interface Translation: Adapter translates calls between incompatible interfaces
2. Wrapper Pattern: Adapter wraps the existing class and provides new interface
3. Client Isolation: Client code doesn't need to know about the adapted class
4. Extensibility: Easy to add new adapters for different interfaces
5. Legacy Integration: Perfect for integrating existing systems with new code


