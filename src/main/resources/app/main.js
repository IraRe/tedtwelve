/**
 * Created by dcreutz on 20.10.2016.
 */
$(function() {
    $("#submitButton").click(function () {
        var val = $("#nameInput").val();
        $.ajax({
            type: "POST",
            url: "http://192.168.99.100:8080/user",
            data: val,
            success: function () {
                alert('success');
            }
        });
    });
});