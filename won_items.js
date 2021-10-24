function toggleElement() {
    document.getElementById("myDIV").style.display = "block";
    document.getElementById("home_button").style.display = "block";
    document.getElementById("hidden").style.display = "block";
    document.getElementById("more_hidden").style.display = "block";
}

function randomGift() {
    let per = (15 + (Math.random() * 61));
    document.getElementById("myDIV").innerHTML = Math.round(per) + "% Off Target Coupon!"
}

var delayInMilliseconds = 6000; //1 second

setTimeout(function() {
    toggleElement();
    randomGift();
    console.log("done");
}, delayInMilliseconds);