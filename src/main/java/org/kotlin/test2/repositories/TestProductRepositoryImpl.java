package org.kotlin.test2.repositories;

import org.kotlin.test2.data.Food;
import org.kotlin.test2.data.Item;

import java.util.List;

public class TestProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Item> getItems(boolean isInternetAvailable) {
        return List.of(new Food("test name", "test icon", 0.0, "10cal"));
    }
}
