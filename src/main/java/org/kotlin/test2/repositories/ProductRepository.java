package org.kotlin.test2.repositories;

import org.kotlin.test2.data.Item;

import java.util.List;

public interface ProductRepository {
    List<Item> getItems(boolean isInternetAvailable);
}
