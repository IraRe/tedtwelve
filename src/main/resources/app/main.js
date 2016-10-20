/**
 * Created by dcreutz on 20.10.2016.
 */
$(function () {
    $("#submitButton").click(function () {
        var params = {
            name: $("#nameInput").val()
        };

        $.ajax({
            type: "POST",
            url: "http://192.168.99.100:8080/user",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(params),
            success: function (e) {
                console.log("It worked! Id: "+e.id);
            }
        });
    });
});