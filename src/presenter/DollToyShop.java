package presenter;

import data.DollToy;
import data.Toy;

public class DollToyShop implements ToyShop{
    @Override
    public Toy createToy(int id, int weight, String name) {
        return new DollToy(id, weight, name);
    }
}
