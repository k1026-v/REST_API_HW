
package de.ait.products.repositories;

import de.ait.products.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
