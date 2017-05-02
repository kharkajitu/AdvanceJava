"use strict";

angular.module("productApp", ["ngRoute"]);

angular.module("productApp").config(function($routeProvider) {
    $routeProvider
        .when("/home", {
            templateUrl: "home.html"
        })
        .when("/login", {
            templateUrl: "login.html"
        })
        .when("/displaytable", {
            templateUrl: "displaytable.html"
        })
        .when("/addEdit", {
            templateUrl: "addEditProduct.html"
        })
        .when("/contactus", {
            templateUrl: "contactus.html"
        });
});