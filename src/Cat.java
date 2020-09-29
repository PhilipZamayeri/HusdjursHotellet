import javax.swing.*;

/**
 * Created by Philip Zamayeri
 * Date: 2020-09-27
 * Time: 08:31
 * Project: HusdjursHotellet
 * Copyright: MIT
 */
public class Cat extends HealthyPets{

    public Cat(Guest name, double weight){
        super(name, weight);
    }

    //Polymorfism
    @Override
    public void whatToFeed() {

        double feed = getWeight() * 1000 / 150;

            JOptionPane.showMessageDialog(null,"Katten " +
                    getName() + " " + String.format(" ska matas med %3.1f gram kattfoder.",feed)
                    ,"Foder",JOptionPane.INFORMATION_MESSAGE);
    }
}
