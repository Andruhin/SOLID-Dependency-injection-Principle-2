package org.kotlin.test2.repositories;

import org.kotlin.test2.useCases.GetItemsUseCase;

public class ServiceLocator {

    NetworkRepository provideNetworkRepository(){
        return new FirstNetworkRepositoryImpl();
    }

    LocalRepository provideLocalDbRepository(){
        return new LocalDbRepositoryImpl();
    }

    public ProductRepository provideProductRepository(){
        return new ProductRepositoryImpl(provideNetworkRepository(), provideLocalDbRepository());
    }

    public GetItemsUseCase provideGetItemsUseCase(){
        return new GetItemsUseCase(provideProductRepository());
    }

}
