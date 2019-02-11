
var app = angular.module("myApp", ["ngRoute"]).value("appConfig", {
    basePath: "/playground" // Set your base path here
});


app.config(function($routeProvider) {
	  $routeProvider
	  .when("/", {
	    templateUrl : "view/main.html"
	  })
	  .when("/product", {
	    templateUrl : "view/product.html"
	  });
	});
