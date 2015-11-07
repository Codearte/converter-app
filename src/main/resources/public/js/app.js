angular.module('ConverterApp', ['ngRoute', 'ngResource'])
    .config(function ($routeProvider, $locationProvider) {
        $routeProvider
            .when('/conversion', {
                controller: 'ConversionController',
                templateUrl: 'views/conversion.html'
            })
            .otherwise({
                redirectTo: '/conversion'
            });
        $locationProvider.html5Mode(true);
    });