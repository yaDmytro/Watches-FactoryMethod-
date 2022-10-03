public class FactoryMethod {
    public static void main(String[] args){

        WatchMaker maker = new DigitalWatchMaker();
        Watch watch = maker.createWatch();
        watch.showtime();

        WatchMaker maker1 = getMakerByName("SunWatch");
        Watch watch1 = maker1.createWatch();
        watch1.showtime();

        WatchMaker maker2 = getMakerByName("Casio");
        Watch watch2 = maker2.createWatch();
        watch2.showtime();
    }

    public static WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital")){
            return new DigitalWatchMaker();
        } else if(maker.equals("SunWatch")){
            return new SunWatchMaker();
        } else{
            throw new RuntimeException("Невідома лінія виробництва годинників" + maker);
        }
    }
}
