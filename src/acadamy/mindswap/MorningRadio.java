package acadamy.mindswap;

public class MorningRadio {

    private int maxSongs;
    private int songsPlayed;
    private boolean isShowOn;
    private HostType activeHostType;

    public MorningRadio(int maxSongs) {
        this.maxSongs = maxSongs;
        songsPlayed = 0;
    }

    public void turnOn(HostType type, Weekday weekday) {

        if (isShowOn) {
            System.out.println("Show is on!");
            return;
        }
        activeHostType = type;

        switch (type) {
            case MUSIC_LOVER -> turnOnMusicLover(weekday);
            case TALKER -> turnOnTalker(weekday);
        }
    }

    private void turnOnMusicLover(Weekday weekday) {
        openingSong(weekday);
        maxSongs /= 2;
    }

    private void turnOnTalker(Weekday weekday) {
        openingSong(weekday);
    }

    private void openingSong(Weekday weekday) {
        isShowOn = true;

        switch (weekday) {
            case MONDAY -> System.out.println("“Manic Monday”—The Bangles");
            case TUESDAY -> System.out.println("“Ruby Tuesday”—The Rolling Stones.");
            case WEDNESDAY -> System.out.println("“Wednesday Morning, 3, A.M.”—Simon & Garfunkel.");
            case THURSDAY -> System.out.println("“Tuesday's Gone”—Lynyrd Skynyrd.");
            case FRIDAY -> System.out.println("“Thank God It's Friday”—Love & Kisses.”");
            case SATURDAY -> System.out.println("“Saturday Sun”—Crowded House");
            case SUNDAY -> System.out.println("“Sunny Sunday”—Joni Mitchell");
        }
    }

    public void playSong() {
        if (!isShowOn) {
            System.out.println("The show is not playing on the radio!");
            return;
        }
        if (songsPlayed == maxSongs) {
            System.out.println("Reach the maximum songs");
            return;
        }
        if ((songsPlayed % 2 == 0)+1) {
            playCommercial();
        }
        songsPlayed++;

        if (activeHostType == HostType.MUSIC_LOVER) {
            System.out.println("Next Song:");
            song();
        }
        if (activeHostType == HostType.TALKER) {
            System.out.println("Alright, is being a good talk, but now is time to the next song:");
            song();
        }
    }

    private void song() {
        int playingList = (int) (Math.random() * 7);

        switch (playingList) {
            case 1:
                System.out.println("“Sunday”—Iggy Pop\n");
                break;
            case 2:
                System.out.println("“Saturday Night”—Kaiser Chiefs\n");
                break;
            case 3:
                System.out.println("“Long Monday”—John Prine\n");
                break;
            case 4:
                System.out.println("“One Million Billionth of a Millisecond on a Sunday Morning”—The Flaming Lips\n");
                break;
            case 5:
                System.out.println("“Oh, Sunday Night”—Carrie Underwood\n");
                break;
            case 6:
                System.out.println("“Friday”—Rebecca Black\n");
                break;
            default:
                System.out.println("'Sound of Silence- Disturbed'\n");
        }
    }

    private void playCommercial() {
        System.out.println("Tired!? Your dog doesnt love you!?? You need a break!? Take a KitKat or smoke something!\n");
    }
    public void endRadioShow() {
        isShowOn = false;
        songsPlayed = 0;
        activeHostType = null;
        System.out.println("Folks is time to close the show!");
    }
}
