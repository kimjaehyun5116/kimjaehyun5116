package uses;

import java.util.Comparator;

public class DescTitle implements Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o1.getArtist().compareTo(o2.getTitle());
    }
}
