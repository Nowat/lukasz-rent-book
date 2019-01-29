angular.module('book-create')
    .controller('BookCreateController', function(bookService, $location) {
        var vm = this;

        vm.book = {};

        vm.create = create;

        function create() {
            bookService.create(vm.book)
                .then(function() {
                    $location.path('/books');
                })
                .catch(function(response) {
                    vm.errors = response.data;
                });
        }
    });