angular.module('blogApp', [])
    .controller('BlogListController', function() {
        var blogList = this;
        blogList.blogs = [];

        blogList.addTodo = function() {
            blogList.blogs.push({text:blogList.blogText, done:false});
            blogList.blogText = '';
        };
    });