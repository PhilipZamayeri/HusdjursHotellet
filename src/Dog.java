import javax.swing.*;

/**
 * Created by Philip Zamayeri
 * Date: 2020-09-27
 * Time: 08:31
 * Project: HusdjursHotellet
 * Copyright: MIT
 */
public class Dog extends HealthyPets{

    public Dog(Guest name, double weight){
        super(name, weight);
    }

    //Polymorfism
    @Override
    public void whatToFeed(){

        double feed = getWeight() * 1000 / 100;

            JOptionPane.showMessageDialog(null,"Hunden " +
                    getName() + " ska matas med " + String.format("%3.1f gram hundfoder.",
                    feed),"Foder",JOptionPane.INFORMATION_MESSAGE);

    }

}
