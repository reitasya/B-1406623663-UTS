package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.model.ProductModel;



@Mapper
public interface ProductMapper {
	
	//fitur2
	@Select("select  id_product, nama, deskripsi, kategori, pabrikan, berat, harga, tahun_produksi, jumlah_stok, kondisi from product where product.id_product = #{id_product}")
	@Results(value = {
    @Result(property="id_product", column="id_product"),
    @Result(property="nama", column="nama"),
    @Result(property="deskripsi", column="deskripsi"),
    @Result(property="kategori", column="kategori"),
    @Result(property="pabrikan", column="pabrikan"),
    @Result(property="berat", column="berat"),
    @Result(property="harga", column="harga"),
    @Result(property="tahun_produksi", column="tahun_produksi"),
    @Result(property="jumlah_stok", column="jumlah_stok"),
    @Result(property="kondisi", column="kondisi")
	})
	ProductModel selectProduct (@Param("id_product") int id_product);
	
	//fitur1
	@Select("select id_product, nama, deskripsi, kategori, pabrikan from product")
	@Results(value = {
			 @Result(property="id_product", column="id_product"),
			    @Result(property="nama", column="nama"),
			    @Result(property="deskripsi", column="deskripsi"),
			    @Result(property="kategori", column="kategori"),
			    @Result(property="pabrikan", column="pabrikan")
	})
	List<ProductModel> selectAllProduct ();

	
	//fitur4
	@Insert("INSERT INTO product (nama, deskripsi, kategori, pabrikan, berat, harga, tahun_produksi, jumlah_stok, kondisi) "
			+ "VALUES (#{nama}, #{deskripsi}, #{kategori}, #{pabrikan}, #{berat}, #{harga}, #{tahun_produksi}, #{jumlah_stok}, #{kondisi})")
    void addProduct (ProductModel product);
}

