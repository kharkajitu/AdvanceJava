package com.cubic.service;

import java.util.List;
import com.cubic.vo.ProductVO;

public interface ProductService {
	
	ProductVO save(final ProductVO vo);
	
	List<ProductVO> searchByName(final String productName);
	
	List<ProductVO> searchByUpc(final String productUpc);
	
	List<ProductVO> searchByNumber(final Long productNumber);
	
	List<ProductVO> searchAll();
	
	List<ProductVO> searchByCatagory(final String productCatagory);
	
	List<ProductVO> searchByManufacture(final String productManufacture);
	
	void remove(final Long productId);
	
	ProductVO findProduct(final Long productId);

	

}
