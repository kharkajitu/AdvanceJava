package com.cubic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import com.cubic.entity.ProductEntity;
import com.cubic.vo.ProductVO;
@Component
public class ProductMapper {
	
	public ProductEntity mapToProductEntity(final ProductEntity entity, final ProductVO input) {
		entity.setProductId(input.getProductId());
		entity.setProductName(input.getProductName());
		entity.setProductNumber(input.getProductNumber());
		entity.setProductDesc(input.getProductDesc());
		entity.setProductUpc(input.getProductUpc());
		entity.setProductCatagory(input.getProductCatagory());
		entity.setProductManufac(input.getProductManufac());
		entity.setProductVersion(input.getProductVersion());
//		entity.setActiveDate(input.getActiveDate());
//		entity.setInactiveDate(input.getInactiveDate());
		entity.setCreatedDate(new Date());
		entity.setProductQuantity(input.getProductQuantity());
		entity.setThresholdQuantity(input.getThresholdQuantity());
		entity.setOrderedQuantity(input.getOrderedQuantity());
		entity.setProductPrice(input.getProductPrice());
		
		if(input.isActiveStatus())
		{
			entity.setActiveDate(new Date());
			entity.setInactiveDate(null);
		}
		else{
			entity.setActiveDate(null);
			entity.setInactiveDate(new Date());
		}
		
		
		return entity;
	}
	
	public ProductEntity mapToProductEntity(final ProductVO input) {
		return mapToProductEntity(new ProductEntity(),input);
	}	
	
	public ProductVO mapToProductVO(final ProductEntity entity) {
		ProductVO vo = new ProductVO();
		vo.setProductId(entity.getProductId());
		vo.setProductName(entity.getProductName());
		vo.setProductNumber(entity.getProductNumber());
		vo.setProductDesc(entity.getProductDesc());
		vo.setProductUpc(entity.getProductUpc());
		vo.setProductCatagory(entity.getProductCatagory());
		vo.setProductManufac(entity.getProductManufac());
		vo.setProductVersion(entity.getProductVersion());
		vo.setActiveDate(entity.getActiveDate());
		vo.setInactiveDate(entity.getInactiveDate());
		vo.setCreatedDate(entity.getCreatedDate());
		vo.setProductQuantity(entity.getProductQuantity());
		vo.setThresholdQuantity(entity.getThresholdQuantity());
		vo.setOrderedQuantity(entity.getOrderedQuantity());
		vo.setProductPrice(entity.getProductPrice());
		
		return vo;
	}
	
	public List<ProductVO> mapToProductVOList(final List<ProductEntity> entities) {
		List<ProductVO> results = new ArrayList<ProductVO>();
		
		for(ProductEntity entity:entities) {
			results.add(mapToProductVO(entity));
		}
		return results;
	}	

}
