/**
 * Created by Philip Zamayeri
 * Date: 2020-09-27
 * Time: 08:25
 * Project: HusdjursHotellet
 * Copyright: MIT
 */

public class HealthyPets implements IDietCoach{
    private Guest name;
    private double weight;


    public HealthyPets(Guest name, double weight){
        this.name = name;
        setWeight(weight);
    }

    // Inkapsling
    public Guest getName(){return name;}

    public void setWeight(double weight){
        if (weight > 0)
            this.weight = weight;
        else throw new IllegalArgumentException("Du har ej angivit en giltig vikt.");
    }
    public double getWeight(){return weight;}


    @Override
    public void whatToFeed(){}
}
