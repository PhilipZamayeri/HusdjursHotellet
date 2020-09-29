import javax.swing.*;

/**
 * Created by Philip Zamayeri
 * Date: 2020-09-27
 * Time: 08:48
 * Project: HusdjursHotellet
 * Copyright: MIT
 */

public class FeedDemo {

    public FeedDemo() {
        HealthyPets Sixten = new Dog(Guest.SIXTEN, 5);
        HealthyPets Dogge = new Dog(Guest.DOGGE, 10);
        HealthyPets Venus = new Cat(Guest.VENUS, 5);
        HealthyPets Ove = new Cat(Guest.OVE, 3);
        HealthyPets Hypno = new Snake(Guest.HYPNO, 1);



        String userInput = JOptionPane.showInputDialog(null, "Vilket djur vill du mata: ",
                "HealthyPets", JOptionPane.INFORMATION_MESSAGE);

        if (userInput == null) {
            JOptionPane.showMessageDialog(null,
                    "Du har valt att avbryta programmet.");
            System.exit(0);
        }


        userInput = userInput.trim();


        if (userInput.equalsIgnoreCase(Guest.SIXTEN.toString()))
            printMe(Sixten);
        else if (userInput.equalsIgnoreCase(Guest.DOGGE.toString()))
            printMe(Dogge);
        else if (userInput.equalsIgnoreCase(Guest.VENUS.toString()))
            printMe(Venus);
        else if (userInput.equalsIgnoreCase(Guest.OVE.toString()))
            printMe(Ove);
        else if (userInput.equalsIgnoreCase(Guest.HYPNO.toString()))
            printMe(Hypno);
        else JOptionPane.showMessageDialog(null,
                    "Du har ej angett ett djur som bor på hotellet.");

    }

    public void printMe(IDietCoach feed) {
        feed.whatToFeed();
    }

    public static void main(String[] args) {
        FeedDemo print = new FeedDemo();
    }

}
