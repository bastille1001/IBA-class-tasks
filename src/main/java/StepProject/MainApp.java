package StepProject;
import StepProject.dao.Console;
import java.io.IOException;
import java.text.ParseException;

public class MainApp {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        Console app = new Console();

        while (true){
            app.mainMenu();
        }
    }
}
