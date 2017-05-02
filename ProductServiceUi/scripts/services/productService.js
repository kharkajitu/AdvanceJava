"use strict";
// alert("from service outside");
angular.module("productApp").service("productService", function($http){
    // alert("from service inside");

    this.getAll = function(){
        return $http({
            method:"get",
            url:"http://localhost:9898/product-service/product/searchAll"
        }).then(function(result){
            //   console.log(result.data);
            return result.data;
        });
    }

    this.addProductS = function(product){
        console.log(product);
        return $http({
            method:"post",
            url:"http://localhost:9898/product-service/product/",
            data:product
        }).then(function(result){
            return result.status;
        })
    }

    this.editProdcutS = function(editProduct){
         console.log(editProduct);
        return $http({
            method:"put",
            url:"http://localhost:9898/product-service/product/",
            data:editProduct
        }).then(function(result){
            return result.status;
        })
    }

    this.deleteProductS = function(id){
        return $http({
            method:"delete",
            url:"http://localhost:9898/product-service/product/"+id
        }).then(function(result){
            return result.status;
        })
    }

    this.getAllFromCatagoryS = function(catagory){
        console.log(catagory);
        return $http({
            method:"get",
            url:"http://localhost:9898/product-service/product/searchProductCatagory?searchProductCatagory="+catagory
        }).then(function(result){
            return result.data;
        })
    }

     this.getAllFromManufactureS = function(manufacture){
        return $http({
            method:"get",
            url:"http://localhost:9898/product-service/product/searchProductManuf?searchProductManuf="+manufacture
        }).then(function(result){
            return result.data;
        })
    }
});