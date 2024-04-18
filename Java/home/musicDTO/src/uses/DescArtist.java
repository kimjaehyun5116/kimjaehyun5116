package uses;

import java.util.Comparator;

public class DescArtist implements Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o1.getArtist().compareTo(o2.getTitle());
    }
}
