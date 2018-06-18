angular.module('blogApp', [])
    .controller('BlogController', ['$scope', '$http', function ($scope, $http){
        $scope.save = function(article){
            article.date = new Date().toJSON();
            $http.post("http://localhost:8080/publication", JSON.stringify(article)).
            then(function(response) {
                $scope.publications = response.data;
            });
        };
        $http.get("http://localhost:8080/publications").
        then(function(response) {
            $scope.publications = response.data;
        });
    }]
);

