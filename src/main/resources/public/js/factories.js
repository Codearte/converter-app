angular.module('ConverterApp')
    .factory('Conversion', function ($resource) {
        return $resource('/api/conversions/:id', {id: '@id'}, {
            'update': {method: 'PUT'}
        });
    });