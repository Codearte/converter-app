angular.module('ConverterApp')
    .controller('ConversionController', function ($scope, Conversion, $location) {
        $scope.conversion = new Conversion({
            properties:'props.to.convert = 0.1',
            yaml:''
        });
        $scope.save = function () {
            $scope.conversion.$save();
        };
    });