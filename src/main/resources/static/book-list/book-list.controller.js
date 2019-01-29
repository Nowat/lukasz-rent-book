bookListModule.controller('BookListController', function (bookService, $location) {
    var vm = this;

    vm.sortOptions = [
        {
            displayName: 'Name ASC',
            value: 'name,asc'
        },
        {
            displayName: 'Name DESC',
            value: 'name,desc'
        },
        {
            displayName: 'Price ASC',
            value: 'price,asc'
        },
        {
            displayName: 'Price DESC',
            value: 'price,desc'
        }
    ];

    vm.params = {};

    vm.search = search;

    vm.remove = remove;

    vm.edit = edit;

    search();

    function search() {
        productService.search(vm.params)
            .then(function (response) {
                vm.books = response.content;
            })
            .catch(function (response) {
                alert(response.data.message);
                vm.error = response.data.message;
            });
    }

    function remove(bookId) {
        bookService.remove(bookId)
            .then(function () {
                search();
            });
    }

    function edit(id) {
        $location.path('/books/edit/' + id);
    }
});