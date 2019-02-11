app.controller('mainController', function($scope, $location) {
  $scope.login = function(mode){
	  $location.path('product');
	};
});