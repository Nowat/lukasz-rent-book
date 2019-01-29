angular.module('book')
    .service('bookService', function($resource) {
        var service = this;

        var bookResource = $resource('http://localhost:8080/books/:bookId', {}, {
            query: {
                method: 'GET',
                isArray: false
            },
            update:{
                method:'PUT',

            }
        });

        service.search = function(params) {
            return productResource.query(params).$promise;
        };

        service.create = function(product) {
            return productResource.save({}, product).$promise;
        };

        service.remove = function(id) {
            return productResource.remove({
                productId: id
            }).$promise;
        };
        service.get = function (id) {
            return productResource.get({
                productId:id
            }).$promise;
        };

    });