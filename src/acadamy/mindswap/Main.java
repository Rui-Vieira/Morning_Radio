package acadamy.mindswap;

public class Main {

    public static void main(String[] args) {
        MorningRadio comercial = new MorningRadio(10);
        comercial.turnOn(HostType.MUSIC_LOVER, Weekday.MONDAY);
        comercial.playSong();
        comercial.playSong();
        comercial.playSong();
        comercial.playSong();
    }
}
/* Create a Morning Radio class that complies to the following rules:

1. Depending on the weekday, it plays a different opening song
2. Plays a maximum number of songs per day, before the emission is closed
3. Every time it plays two songs, it should take a commercial break
+half the time talking, reducing the number of maximum songs to a half
5. An emission must be closed in order to change the type of host, and restarted in order to play more songs

NOTE: Try to keep it simple!! :)*/