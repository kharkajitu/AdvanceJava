package com.cubic.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.service.ProductService;
import com.cubic.vo.ProductSearchResult;
import com.cubic.vo.ProductVO;


@Service
@Path("/product")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductRest {
	
	@Autowired
	private ProductService service;
	
	@POST
	public Response create(final ProductVO vo) {
		ProductVO result = service.save(vo);
		return Response.ok().entity(result).build();
	}
	
	@PUT
	public Response update(final ProductVO vo) {
		ProductVO result = service.save(vo);
		return Response.ok().entity(result).build();
	}
	
	@GET
	@Path("/{productId}")
	public Response findProduct(@PathParam("productId") final Long productId) {
		ProductVO result = service.findProduct(productId);
		return Response.ok().entity(result).build();
	}
	
	@GET
	@Path("/searchStr")
	public Response searchProduct(@QueryParam("searchStr") final String productName) {
		List<ProductVO> products = service.searchByName(productName);
		ProductSearchResult entity = new ProductSearchResult();
		entity.setProducts(products);
		return Response.ok().entity(entity).build();
	}	
	
	@GET
	@Path("/searchProductNumber")
	public Response searchProductByNumber(@QueryParam("searchProductNumber") final Long productNumber) {
		List<ProductVO> products = service.searchByNumber(productNumber);
		ProductSearchResult entity = new ProductSearchResult();
		entity.setProducts(products);
		return Response.ok().entity(entity).build();
	}	
	
	@GET
	@Path("/searchProductUpc")
	public Response searchProductByUpc(@QueryParam("searchProductUpc") final String productUpc) {
		List<ProductVO> products = service.searchByUpc(productUpc);
		ProductSearchResult entity = new ProductSearchResult();
		entity.setProducts(products);
		return Response.ok().entity(entity).build();
	}	
	
	@GET
	@Path("/searchProductCatagory")
	public Response searchProductByCatagory(@QueryParam("searchProductCatagory") final String productCatagory) {
		List<ProductVO> product = service.searchByCatagory(productCatagory);
		ProductSearchResult entity = new ProductSearchResult();
		entity.setProducts(product);
		return Response.ok().entity(entity).build();
	}	
	
	@GET
	@Path("/searchProductManuf")
	public Response searchProductByManuf(@QueryParam("searchProductManuf") final String productManufacture) {
		List<ProductVO> products = service.searchByManufacture(productManufacture);
		ProductSearchResult entity = new ProductSearchResult();
		entity.setProducts(products);
		return Response.ok().entity(entity).build();
	}	
	
	
	@GET
	@Path("/searchAll")
	public Response searchAll() {
		List<ProductVO> products = service.searchAll();
		ProductSearchResult entity = new ProductSearchResult();
		entity.setProducts(products);
		return Response.ok().entity(entity).build();
	}	
	
	
	@DELETE
	@Path("/{productId}")
	public Response remove(@PathParam("productId") final Long productId) {
		service.remove(productId);
		return Response.noContent().build();
	}	

}
