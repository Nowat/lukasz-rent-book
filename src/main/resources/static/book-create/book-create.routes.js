angular.module('book-create')
    .config(function($routeProvider) {
        $routeProvider.when('/books/add', {
            templateUrl: '/book-create/book-create.html',
            controller: 'BookCreateController',
            controllerAs: 'vm'
        });
    });