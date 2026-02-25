package org.kotlin.test2.useCases;

import org.kotlin.test2.data.Item;
import org.kotlin.test2.repositories.ProductRepository;
import org.kotlin.test2.repositories.ProductRepositoryImpl;

import java.util.List;

public class GetItemsUseCase {
    private ProductRepository productRepository;

    public GetItemsUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Item> getItems(boolean isInternetAvailable){
        return productRepository.getItems(isInternetAvailable);
    }
}
