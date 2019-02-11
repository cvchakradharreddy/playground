  app.factory("productService", ["appConfig", "$http", "$q",
    function(config, $http, $q) {
      return {
    	  getAllProducts: function(){
    		  var defer = $q.defer();
    		  $http({
		    	        method: "get",
		    	        url: config.basePath+"/products"
    		  	}).
    	        then(function (response) {
    	            console.log(response);
    	            defer.resolve(response.data);
    	        }, function (error) {
    	            alert("Error getting users.");
    	            defer.reject(error);
    	        });
    		  return defer.promise;
    	  }
      }
    }
  ]);