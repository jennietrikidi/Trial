import jdk.jfr.EventFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Playlist[]playlists=new Playlist[4];
        Random random=new Random();
        Scanner input =new Scanner(System.in);
        for (int i=0;i< playlists.length;i++){
            System.out.println("Enter playlist name: ");
            String name =input.nextLine();
            int length = random.nextInt(2,8);
            Song []songs = new Song[length];
            songs=createSongs(songs);
            playlists[i]=new Playlist(name,songs);
        }
        String longestP= longestPlaylist(playlists);
        System.out.println(longestP);
        for (int i=0;i< playlists.length;i++){
            playlists[i].exists("holy","danny");
            System.out.println(playlists[i]);
        }
    }
    public static String longestPlaylist(Playlist[]playlists){
        String longestP=null;
        int count=0;
        int biggest=0;
        for (int i=0;i< playlists.length;i++){
            for (int j=i;j<playlists[i].getSongs().length;j++){
                count++;
            }if(count>biggest){
                biggest=count;
                longestP=playlists[i].getName();
            }
            count=0;
        }
        return longestP;
    }
    public static Song[]createSongs(Song[]songs){
        Scanner input = new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i< songs.length;i++){
            System.out.println("enter songs name:");
            String name= input.nextLine();
            System.out.println("enter performers name:");
            String performer= input.nextLine();
            System.out.println("enter songs length:");
            int length= scanner.nextInt();
            songs[i]=new Song(name,performer,length);
        }
        return songs;
    }
}

