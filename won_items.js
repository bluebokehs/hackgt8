function toggleElement() {
    var x = document.getElementById("myDIV");
    x.style.display = "block";
    var y = document.getElementById("home_button");
    y.style.display = "block";
}

function randomGift() {
    let per = Math.random() * 61;
    document.getElementById("myDIV").innerHTML = Math.round(per) + "% Off Target Coupon!"
}

var delayInMilliseconds = 6000; //1 second

setTimeout(function() {
    toggleElement();
    randomGift();
    console.log("done");
}, delayInMilliseconds);