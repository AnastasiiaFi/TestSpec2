package presenter;

import data.Toy;

public interface ToyShop {
    Toy createToy (int id, int weight, String name);
}
