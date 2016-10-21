/**
 * Created by dcreutz on 20.10.2016.
 */
var myApp = angular.module('myApp', []);

myApp.controller('MainController', ['$scope', function ($scope) {

    $scope.onSubmitClick = function () {
        var params = {
            name: $("#nameInput").val()
        };

        $.ajax({
            type: "POST",
            url: getUrl() + restUrls.addUser,
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(params),
            success: function (e) {
                console.log("It worked! Id: " + e.id);
                console.log("Refresh usernames.");

                getUsernames();
            },
            error: function (request, status, error) {
                console.error("Error: " + request.responseText);
            }
        });
    };

    var REST_PORT = "8080";
    var restUrls = {
        addUser: '/user',
        showUser: '/username',
        helloworld: '/helloworld'
    };

    function getUrl() {
        return window.location.protocol + "//" + window.location.hostname + ":" + REST_PORT;
    }


    function getUsernames() {
        $.ajax({
            type: "GET",
            url: getUrl() + restUrls.showUser,
            contentType: "application/json; charset=utf-8",
            success: function (e) {
                console.log("It worked! Data: " + e);

                $scope.userNames = e;
            },
            error: function (request, status, error) {
                console.error("Error: " + request.responseText);
            }
        });
    }

    $scope.userNames = [];
    $scope.showList = false;
    getUsernames();

}]);