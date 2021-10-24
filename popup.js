document.addEventListener('DOMContentLoaded', function() {
    var link = document.getElementById('exit');
    // onClick's logic below:
    link.addEventListener('click', function() {
        window.close();
    });
});