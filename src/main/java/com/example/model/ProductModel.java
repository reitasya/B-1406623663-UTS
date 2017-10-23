package com.example.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductModel {
	private Integer id_product;
	private String nama;
	private String deskripsi;
	private String kategori;
	private String pabrikan;
	private double berat;
	private int harga;
	private int tahunProduksi;
	private int jumlahStok;
	private String kondisi;
}