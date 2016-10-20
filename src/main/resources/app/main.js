/**
 * Created by dcreutz on 20.10.2016.
 */
$(function() {
    $("#submitButton").click(function () {
        var val = $("#submitButton").val();
        $.ajax({
            type: "POST",
            url: "/user",
            data: val,
            success: function () {
                alert('success');
            }
        });
    });
});