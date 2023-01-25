package ClassProjects;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class XinMusicInterface {
    
    public static void main(String[] args) throws IOException {
    
        Scanner s = new Scanner(System.in);
        
        String[] metroBoominTopSongs = {"Ric Flair Drip", "X (feat. Future)", "No Heart", "10 Freaky Girls (feat. 21 Savage)", "Creepin'", "Superhero (Heroes & Villains)"};
        
        String[] songQueue = new String[0];
       
        String currentArtistrn = "";
        String[] currentArtistTopSongsrn = {};
        String currentArtistPinnedSongrn = "";
        boolean currentArtistVerifiedrn = false;
        

        XinMusic currentArtist = new XinMusic(currentArtistrn, currentArtistTopSongsrn, currentArtistPinnedSongrn, currentArtistVerifiedrn);



       // Find the amount of playlists the user has in the file from "{" to "}"
        int playlistNum = -1;

        File file = new File("/Users/dx/Desktop/VS CODE PROJECTS/ClassProjects/songs.txt");
        Scanner scanFile = new Scanner(file);
       while (scanFile.hasNextLine()) {
          
            String line = scanFile.nextLine();
            if (line.equals("}")) {
                break;
            } else {
                playlistNum++;
            }
            
       }
       String[] playlists = new String[playlistNum];
       
       int currentLine = 1;
       int i = 0;
       while (currentLine < playlists.length + 1) {
        String line = Files.readAllLines(Paths.get("/Users/dx/Desktop/VS CODE PROJECTS/ClassProjects/songs.txt")).get(currentLine);
        playlists[i] = line;
        currentLine++;
        i++;
       }
       

      System.out.println(getPlaylists(playlists));
      System.out.println("Choose a playlist: ");
      int recordOption = s.nextInt();
      String playlistSelected = playlists[recordOption-1];
      Scanner scanForPlaylist = new Scanner(new File("/Users/dx/Desktop/VS CODE PROJECTS/ClassProjects/songs.txt"));
      int start = 0;
      int end = 0;
      int currentLineff = 0;
      while (scanForPlaylist.hasNextLine()) {
       
        currentLineff++;
        String line = scanForPlaylist.nextLine();
        // System.out.println("line " + currentLineff + ": " + line);   // INFORMATION OF EACH LINE BEING READ
        if (line.equals("<" + recordOption + ">")) {
            start = currentLineff;
        } 
       
        if (line.equals("</" + recordOption + ">")) {
            end = currentLineff;
            break;
        }
      }
      end -= 3;
      System.out.println("starting line: " + start);
      System.out.println("ending line: " + end);
      int numOfSongsInPlaylist = (end - start)/5;

      System.out.println(numOfSongsInPlaylist + " songs in " + playlistSelected );       // NUMBER OF SONGS IN THE PLAYLIST



    // Create an array that has length of numOfSongsInPLaylist 

    String[] songNameArr = new String[numOfSongsInPlaylist+1];
    String[] artistNameArr = new String[numOfSongsInPlaylist];
    String[] albumNameArr = new String[numOfSongsInPlaylist];
    String[] explicitArr = new String[numOfSongsInPlaylist];
    //                                              ID                     Song Name            Artist              Album               Explicit?
    
    Scanner scanForSongs = new Scanner(new File("/Users/dx/Desktop/VS CODE PROJECTS/ClassProjects/songs.txt"));
    int currentLinesfs = 0;
    while (currentLinesfs < start) {
        currentLinesfs++;
    }
    currentLinesfs += 3;
    System.out.println("currentLinesfs: " + currentLinesfs);
    // Format in txt file:
    // Song Name
    // Artist
    // Album
    // Explicit?
    skipLines(scanForSongs, currentLinesfs);
    int id = 0;
    while (scanForSongs.hasNextLine()) {
        String line = scanForSongs.nextLine();
        if (line.equals("</" + recordOption + ">")) {
            break;
        } else if (line.equals("=")) {
            id++;
        } else {
            songNameArr[id] = line;
            
        }
    }
    

    System.out.println("songNameArr: " + Arrays.toString(songNameArr));
     
}

    

    public static String[] p(String[] songQueue, String songName, String artistName) {
        String[] newSongQueue = new String[songQueue.length+1];
        newSongQueue[newSongQueue.length-1] = songName + " - " + artistName;
        return songQueue;
    }

    public static String getArtistInfo(XinMusic artistName) {
        String s = artistName.getArtistName() + artistName.getPinnedAlbum() + artistName.getTopSongs();
        return s;
    }

    public static void menuList() {
        System.out.println("1) Play Song" + "\n" + 
                           "2) About Artist" + "\n" +
                           "3) Playlist" + "\n" +
                           "4) EXIT" + "\n");
    }

    public static String getPlaylists(String[] playlistArr) {
        String s = "Playlists: " + "\n";
        int i = 1;

        for (String playlistName : playlistArr) {
            s += i + ". " + playlistName;
            s += "\n";
            i++;
        }
        return s;
    }

    public static void skipLines(Scanner s, int lineNum){
        for(int i = 0; i < lineNum;i++){
            if(s.hasNextLine())s.nextLine();
        }
    }

   

}

