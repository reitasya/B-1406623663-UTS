package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.ProductModel;
import com.example.service.ProductService;

@Controller
public class ProductController {
	@Autowired
    ProductService productDAO;
	
	
	//index
    @RequestMapping("/")
    public String index ()
    {
        return "index";
    }
    
    @RequestMapping("/product/viewall")
    public String view (Model model)
    {
        List<ProductModel> products = productDAO.selectAllProducts ();
        model.addAttribute ("products", products);

        return "viewall";
    }
    
    
    
    @RequestMapping("/product/view")
    public String viewPath (Model model,
            @PathVariable(value = "id_product") int id_product)
    {
        ProductModel product = productDAO.selectProduct (id_product);

        if (product != null) {
            model.addAttribute ("product", product);
            return "view";
        } else {
            model.addAttribute ("product", product);
            return "not-found";
        }
    }
    
    
    
}
