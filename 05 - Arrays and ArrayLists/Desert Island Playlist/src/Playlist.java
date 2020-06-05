import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Life");
    desertIslandPlaylist.add("Bonfire Heart");
    desertIslandPlaylist.add("Wait");
    desertIslandPlaylist.add("Yellow");
    desertIslandPlaylist.add("Go Solo");
    desertIslandPlaylist.add("Great Escape");
    desertIslandPlaylist.add("Karma Police");

    System.out.println(desertIslandPlaylist );
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("Yellow");
    desertIslandPlaylist.remove("Karma Police");

    System.out.println(desertIslandPlaylist );
    System.out.println(desertIslandPlaylist.size());

    int indexOfBH = desertIslandPlaylist.indexOf("Bonfire Heart");
    int indexOfGE = desertIslandPlaylist.indexOf("Great Escape");
    String temporaryString = desertIslandPlaylist.get(indexOfGE);

    desertIslandPlaylist.set(indexOfGE, desertIslandPlaylist.get(indexOfBH));
    desertIslandPlaylist.set(indexOfBH, temporaryString);

    System.out.println(desertIslandPlaylist );
  }

}