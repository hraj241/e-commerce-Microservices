package com.harsh.microservices.product.service;

import com.harsh.microservices.product.dto.ProductRequest;
import com.harsh.microservices.product.dto.ProductResponse;
import com.harsh.microservices.product.model.Product;
import com.harsh.microservices.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = Product.builder().name(productRequest.name()).price(productRequest.price()).description(productRequest.description()).skuCode(productRequest.skuCode()).build();
        productRepository.save(product);
        log.info("product created successfully");
        return new ProductResponse(product.getId(),
                product.getName(), product.getDescription(), product.getPrice());
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream().map(product -> new ProductResponse(product.getId(),
                product.getName(), product.getDescription(), product.getPrice())).toList();

    }
}
