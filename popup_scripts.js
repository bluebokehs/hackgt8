let count = 0;
function incCount() {
    if (count < 100) {
        count++;
    }
    document.getElementById("time").innerHTML = count + "%";
    console.log(count);
}

function removeElement() {
    var x = document.getElementById("myDIV");
    var y = document.getElementById("myDIV");
    if (x.style.display === "none") {
      x.style.display = "block";
    } else {
      x.style.display = "none";
    }
}

function closeSupple() {
    window.close();
}

document.addEventListener('DOMContentLoaded', function() {
    var link = document.getElementById('link');
    // onClick's logic below:
    link.addEventListener('click', function() {
        removeElement();
    });
});
document.addEventListener('DOMContentLoaded', function() {
    var e = document.getElementById('close');
    // onClick's logic below:
    e.addEventListener('click', function() {
        closeSupple();
    });
});

$(document).ready(function() {
    $("#close").click(function() {
      window.close();
    });
});

setInterval(function(){ incCount(); }, 80);

document.getElementById("keysNum").innerHTML = k.getAmount();
document.getElementById("chest1").innerHTML = boxes[0].getAmountBoxes();
document.getElementById("chest1N").innerHTML = boxes[0].getCompany();
document.getElementById("chest2").innerHTML = boxes[1].getAmountBoxes();
document.getElementById("chest2N").innerHTML = boxes[1].getCompany();
document.getElementById("chest3").innerHTML = boxes[2].getAmountBoxes();
document.getElementById("chest3N").innerHTML = boxes[2].getCompany();
document.getElementById("chest4").innerHTML = boxes[3].getAmountBoxes();
document.getElementById("chest4N").innerHTML = boxes[3].getCompany();
document.getElementById("chest5").innerHTML = boxes[4].getAmountBoxes();
document.getElementById("chest5N").innerHTML = boxes[4].getCompany();
document.getElementById("chest6").innerHTML = boxes[5].getAmountBoxes();
document.getElementById("chest6N").innerHTML = boxes[5].getCompany();
document.getElementById("chest7").innerHTML = boxes[6].getAmountBoxes();
document.getElementById("chest7N").innerHTML = boxes[6].getCompany();