var bookListModule = angular.module('book-list');

bookListModule.config(function($routeProvider) {
    $routeProvider.when('/books', {
        templateUrl: '/book-list/book-list.html',
        controller: 'BookListController',
        controllerAs: 'vm'
    });
});