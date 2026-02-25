package org.kotlin.test2.repositories;

import org.kotlin.test2.data.Food;
import org.kotlin.test2.data.Item;
import org.kotlin.test2.data.Tool;
import org.kotlin.test2.data.Toy;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    public NetworkRepository networkRepository;
    public LocalRepository localDbRepository;

    public ProductRepositoryImpl(NetworkRepository networkRepository, LocalRepository localRepository) {
        this.networkRepository = networkRepository;
        this.localDbRepository = localRepository;
    }

    @Override
    public List<Item> getItems(boolean isInternetAvailable) {
        System.out.println("Retrieve Items from Repository");
        System.out.println("isInternetAvailable =" + isInternetAvailable);
        if (isInternetAvailable){
            networkRepository.sortItems();
            return networkRepository.getItems();
        } else  {
            return localDbRepository.getItems();
        }
    }
}
