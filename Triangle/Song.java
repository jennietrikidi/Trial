public class Song {
    private String name;
    private String performerName;
    private int length;
    public Song(String name,String performerName,int length) {
        this.name = name;
        this.performerName = performerName;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String performerName) {
        this.performerName = performerName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", performerName=" + performerName +
                ", length=" + length;
    }
}