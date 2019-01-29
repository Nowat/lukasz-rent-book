var productListModule = angular.module('book-list');

productListModule.config(function($routeProvider) {
    $routeProvider.when('/books', {
        templateUrl: '/book-list/book-list.html',
        controller: 'BookListController',
        controllerAs: 'vm'
    });
});