var app = angular.module("myApp", ['ngRoute']);
app.config(function($routeProvider) {
    $routeProvider
    .when('/', {
        templateUrl : 'index.html'
    })
    .when('/home', {
        templateUrl : 'home.html'
    })
    .when('/index', {
        templateUrl : 'index.html'
    });
});