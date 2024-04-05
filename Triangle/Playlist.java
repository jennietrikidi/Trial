import java.util.Arrays;

public class Playlist {
    private String name;
    private Song []songs;
    private boolean exists=false;
    public Playlist(String name,Song[] song){
        this.songs=song;
        this.name=name;
    }
    public boolean exists(String name,String performerName){
        for (int i=0;i<songs.length;i++){
            if (songs[i].getName().equals(name)&&songs[i].getPerformerName().equals(performerName)){
                this.exists=true;
                break;
            }else {
                this.exists=false;
            }}
        return this.exists;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
                ", exists=" + exists +
                '}';
    }
}
