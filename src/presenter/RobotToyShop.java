package presenter;

import data.RobotToy;
import data.Toy;

public class RobotToyShop implements ToyShop{
    public Toy createToy(int id, int weight, String name) {
        return new RobotToy(id, weight, name);
    }
}
