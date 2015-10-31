angular.module('ConverterApp', ['ngRoute', 'ngResource'])
    .config(function ($routeProvider, $locationProvider) {
        $routeProvider
            .when('/conversion', {
                controller: 'ConversionController',
                templateUrl: 'views/conversion.html'
            });
        $locationProvider.html5Mode(true);
    });