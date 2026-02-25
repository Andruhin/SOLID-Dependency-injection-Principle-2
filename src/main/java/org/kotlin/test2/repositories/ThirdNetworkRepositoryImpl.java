package org.kotlin.test2.repositories;

import org.kotlin.test2.data.Food;
import org.kotlin.test2.data.Item;
import org.kotlin.test2.data.Tool;
import org.kotlin.test2.data.Toy;

import java.util.ArrayList;
import java.util.List;

public class ThirdNetworkRepositoryImpl extends FirstNetworkRepositoryImpl {

    @Override
    public List<Item> getItems() {
        System.out.println("Retrieve Items from THIRD Network Repository implementation");
        Toy toy = new Toy("Toy1", "ToyIcon1", 10.0, 12);
        ArrayList<Item> list = new ArrayList<>();
        list.add(toy);
        return list;
    }
}
