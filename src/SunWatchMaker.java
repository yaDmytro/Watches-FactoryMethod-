public class SunWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new SunWatch();
    }
}
