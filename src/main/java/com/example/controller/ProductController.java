package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    //fitur 2
    @RequestMapping("/product/viewall")
    public String view (Model model)
    {
        List<ProductModel> products = productDAO.selectAllProducts ();
        model.addAttribute ("products", products);

        return "viewall";
    }
    
    
    //fitur 1
    @RequestMapping("/product/view/{id_product}")
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
    
    @RequestMapping("/product/add")
    public String add ()
    {
        return "form-add";
    }


    @RequestMapping("/product/add/submit")
    public String addSubmit (
//    		 	@RequestParam(value = "id_product", required = false) int id_product,
            @RequestParam(value = "nama", required = false) String nama,
            @RequestParam(value = "deskripsi", required = false) String deskripsi,
            @RequestParam(value = "kategori", required = false) String kategori,
            @RequestParam(value = "pabrikan", required = false) String pabrikan,
            @RequestParam(value = "berat", required = false) double berat,
            @RequestParam(value = "harga", required = false) int harga,
            @RequestParam(value = "tahun_produksi", required = false) int tahun_produksi,
            @RequestParam(value = "jumlah_stok", required = false) int jumlah_stok,
            @RequestParam(value = "kondisi", required = false) String kondisi)

    {
        ProductModel product = new ProductModel (0, nama, deskripsi, kategori, pabrikan, berat, harga, tahun_produksi, jumlah_stok, kondisi);
        productDAO.addProduct (product);

        return "success-add";
    }
   
    
    
}
