package com.cubic.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.cubic.entity.ProductEntity;
import com.cubic.entity.QueryConstants;
import com.cubic.exception.InvalidInputException;
import com.cubic.vo.ProductVO;

@Service
@Transactional
public class ProductServiceJpaImpl implements ProductService{
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private ProductMapper mapper;
	
	public ProductVO save(final ProductVO vo) {
		ProductEntity entity = null;
		if(vo.getProductId() == null) {
			entity = mapper.mapToProductEntity(vo);
		}
		else
		{
			entity = em.find(ProductEntity.class, vo.getProductId());
			entity = mapper.mapToProductEntity(entity,vo);
		}
		em.persist(entity);
		vo.setProductId(entity.getProductId());
		return vo;
	}

	public List<ProductVO> searchByName(String productName) {
		
		if(StringUtils.isEmpty(productName) || productName.trim().length() < 4) {
			throw new InvalidInputException("Search should have atleast 3 characters");
		}		
		List<ProductEntity> entities;
		String queryParam = productName.trim()+"%";
		TypedQuery<ProductEntity> query = em.createNamedQuery("QueryConstants.PRODUCT_SEARCH_BY_NAME", ProductEntity.class);
		query.setParameter("c1", queryParam);		
		entities = query.getResultList();

		return mapper.mapToProductVOList(entities);
	}

	public void remove(Long productId) {
		ProductEntity entity = em.find(ProductEntity.class, productId);
		em.remove(entity);
	}

	public ProductVO findProduct(Long productId) {
		ProductEntity entity = em.find(ProductEntity.class, productId);
		return mapper.mapToProductVO(entity);
	}

	public List<ProductVO> searchAll() {
		List<ProductEntity> entities;
		TypedQuery<ProductEntity> query = em.createQuery("select c from ProductEntity c", ProductEntity.class);		
		entities = query.getResultList();
		return mapper.mapToProductVOList(entities);
	}

	public List<ProductVO> searchByCatagory(String productCatagory) {
		List<ProductEntity> entities;
		String queryParam = productCatagory.trim();
		TypedQuery<ProductEntity> query = em.createNamedQuery("QueryConstants.PRODUCT_SEARCH_BY_CATAGORY", ProductEntity.class);
		query.setParameter("c4", queryParam);	
		entities = query.getResultList();
		return mapper.mapToProductVOList(entities);
	}

	public List<ProductVO> searchByManufacture(String productManufacture) {
		List<ProductEntity> entities;
		String queryParam = productManufacture.trim();
		TypedQuery<ProductEntity> query = em.createNamedQuery("QueryConstants.PRODUCT_SEARCH_BY_MANUFACTURE", ProductEntity.class);
		query.setParameter("c5", queryParam);		
		entities = query.getResultList();

		return mapper.mapToProductVOList(entities);
	}

	public List<ProductVO> searchByUpc(String productUpc) {
		List<ProductEntity> entities;
		String queryParam = productUpc.trim();
		TypedQuery<ProductEntity> query = em.createNamedQuery("QueryConstants.PRODUCT_SEARCH_BY_UPC", ProductEntity.class);
		query.setParameter("c3", queryParam);		
		entities = query.getResultList();
		return mapper.mapToProductVOList(entities);
	}

	public List<ProductVO> searchByNumber(Long productNumber) {
		List<ProductEntity> entities;
		Long queryParam = productNumber;
		TypedQuery<ProductEntity> query = em.createNamedQuery("QueryConstants.PRODUCT_SEARCH_BY_NUMBER", ProductEntity.class);
		query.setParameter("c2", queryParam);		
		entities = query.getResultList();
		return mapper.mapToProductVOList(entities);
	}
	
}
