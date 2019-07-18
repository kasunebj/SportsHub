package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

    ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String Home(){
        return "home" ;
    }

    @RequestMapping("/productList")
    public String getProductlist(Model model){
       List<Product> products = productDao.getProductList();
       model.addAttribute("products" ,products);

       return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException {
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }
}
