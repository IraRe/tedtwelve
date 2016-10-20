/**
 * Created by dcreutz on 20.10.2016.
 */

$('#formMe').on('submit', function(e){
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "/postinfo.php",
        data: $(this).serialize(),
        success: function() {
            alert('success');
        }
    });
});