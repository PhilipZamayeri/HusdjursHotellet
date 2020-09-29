import javax.swing.*;

/**
 * Created by Philip Zamayeri
 * Date: 2020-09-27
 * Time: 08:31
 * Project: HusdjursHotellet
 * Copyright: MIT
 */
public class Snake extends HealthyPets{
    static final double ormpellets = 20.0;
    public Snake(Guest name, double weight){
        super(name, weight);
    }

    //Polymorfism
    @Override
    public void whatToFeed() {
        JOptionPane.showMessageDialog(null,
                "Ormen " + getName() + String.format(" ska matas med %2.1f gram ormpellets", ormpellets),
                "Foder",JOptionPane.INFORMATION_MESSAGE);
    }
}
