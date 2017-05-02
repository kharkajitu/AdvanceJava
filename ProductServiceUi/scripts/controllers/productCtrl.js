"use strict";
// alert("from outside");
angular.module("productApp").controller("productCtrl", function($scope,productService) {
    // alert("from inside");
    $scope.productList = [];
    $scope.forAddProduct = true;
    $scope.allOtherButtonEnable = true;
    $scope.showNavBar = false;
    $scope.productModel ={};
    getAllProduct();


    $scope.showEditPanel = function(editProduct) {
        $scope.forAddProduct = false;
        $scope.productModel = editProduct;
    }

    $scope.showAddPanel = function() {
        initializeEmptyProductModel();
        $scope.forAddProduct = true;
    }

    $scope.loginButtonClicked = function() {
        $scope.showNavBar = true;
    }

    $scope.addProduct = function(){
        console.log($scope.productModel);
        productService.addProductS(angular.copy($scope.productModel)).then(function(){
            getAllProduct();
        });
        initializeEmptyProductModel();
    }

    $scope.editProduct = function(){
        console.log($scope.productModel);
        productService.editProdcutS(angular.copy($scope.productModel)).then(function(){
            getAllProduct();
        });
        initializeEmptyProductModel();
    }

    $scope.cancelButton = function(){
         initializeEmptyProductModel();
    }

    $scope.deleteButton = function(){
        productService.deleteProductS(angular.copy($scope.productModel.productId)).then(function(){
            getAllProduct();
        });
         initializeEmptyProductModel();
    }

    $scope.getCatagory = function(catagory){
       productService.getAllFromCatagoryS(catagory).then(function(result){
            $scope.productList = result.products;
            console.log($scope.productList);
        })
         initializeEmptyProductModel();
    }

     $scope.getManufacture = function(manufacture){
       productService.getAllFromManufactureS(manufacture).then(function(result){
            $scope.productList = result.products;
        })
         initializeEmptyProductModel();
    }

    $scope.allProduct = function(){
        getAllProduct();
    }

    function getAllProduct(){
        productService.getAll().then(function(result){
            $scope.productList = result.products;
            console.log($scope.productList);
        })
    }

    function initializeEmptyProductModel(){
        $scope.productModel = {
            productId:"",
            productName:"",
            productNumber:"",	
            productDesc:"",
            productUpc:"",
            productCatagory:"camera",
            productManufac:"",
            productVersion:"",
            activeDate:"",
            inactiveDate:"",
            createdDate:"",
            productQuantity:"",
            thresholdQuantity:"",
            orderedQuantity:"",
            productPrice:"",
            activeStatus:"true"
        }
    }
});