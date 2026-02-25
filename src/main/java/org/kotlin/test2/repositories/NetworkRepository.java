package org.kotlin.test2.repositories;

import org.kotlin.test2.data.Item;

import java.util.List;

public interface NetworkRepository {
    List<Item> getItems();
    void sortItems();
}
