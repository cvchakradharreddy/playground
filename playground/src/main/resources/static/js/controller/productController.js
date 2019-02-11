app.controller('productController', function($scope, productService) {
	
	var mockProducts = [
		{
			"product_id" : "P0001",
			"name" : "Apple MacAir",
			"price" : 999
		},
		{
			"product_id" : "P0002",
			"name" : "Apple MacBook Pro",
			"price" : 1799
		},
		{
			"product_id" : "P0003",
			"name" : "Acer",
			"price" : 500
		}
	];
	$scope.products = [];
	productService.getAllProducts().then(function(products){
		$scope.products = products.length == 0 ? mockProducts : products;
	}, function(error){
		// error handling
	});
	
	
	  $scope.selection = [];

	  
	  $scope.toggleSelection = function toggleSelection(fruitName) {
	    var idx = $scope.selection.indexOf(fruitName);

	    
	    if (idx > -1) {
	      $scope.selection.splice(idx, 1);
	    }

	  
	    else {
	      $scope.selection.push(fruitName);
	    }
	  };
	  
	  $scope.checkout = function(){
		  
	  };
});