import java.util.Date;

public class DigitalWatch implements Watch{
    @Override
    public void showtime() {
        System.out.println(new Date());
    }
}
