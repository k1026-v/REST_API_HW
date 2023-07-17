
package de.ait.products.controllers;

import de.ait.products.serveses.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService service) {
        this.productService = service;
    }
}
