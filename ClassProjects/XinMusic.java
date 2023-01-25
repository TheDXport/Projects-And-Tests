package ClassProjects;

public class XinMusic {

    private String artistName;
    private String pinnedSong;
    private String pinnedAlbum;
    private String[] topSongs;
    private boolean verified;

  public XinMusic (String artistName, String pinnedSong, String[] topSongs, boolean verified) {
    this.artistName = artistName;
    this.pinnedSong = pinnedSong;
    this.topSongs = topSongs;
    this.verified = verified;
  }
  public XinMusic (String artistName, String[] topSongs, String pinnedAlbum, boolean verified ) {
    this.artistName = artistName;
    this.pinnedAlbum = pinnedAlbum;
    this.topSongs = topSongs;
    this.verified = verified;
  }

 public String getArtistName() {
    return "Artist Name: " + artistName + "\n";
 }

 public String getPinnedSong() {
    
    return "Pinned Song: " + pinnedSong + "\n";
 }

 public String getPinnedAlbum() {
   
    return "Pinned Album: " + pinnedAlbum + "\n";
 }

 public String getTopSongs() {
    String s = "";
    for (int i = 0; i < topSongs.length; i++) {
        s += topSongs[i];
        if (i == topSongs.length-1) {
        } else {
            s += ", ";
        }
    }
    return "Top Songs: " + s + "\n";
 }


 public String getVerification() {
   return "Verification Status: " +  verified + "\n";
 }



// 1) Allow the user to choose a playlist from
// 2) After, display the songs with the artist name in the form of :
//          1. [Song Name] - [Artist Name]
//          2. [Song Name] - [Artist Name]
//          3. [Song Name] - [Artist Name]
// 3) Scan for the user input for a specific song
// 4) Add song to queue
// 5) After the song's timer is over, remove from queue
// 6) During the song that is currently playing, write a method to display the artist's stats:
//      
//   Metro Boomin + ANSI_BLUE_BACKGROUND + "✓"
//      Top Songs:
//       1) s1 explicit
//       2) s2 explicit
//       3) s3 explicit



}
