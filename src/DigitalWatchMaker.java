public class DigitalWatchMaker implements WatchMaker{ // це фабрика цифорових часів, яка імплементить фабрику часів, та повертає об'єкт Watch (або той об'єкт, який наслідує/реалізує Watch)
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
