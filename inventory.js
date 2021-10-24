

const images = [
  {
    id: 1,
    company: "Amazon",
    num: 2,
    imgSrc: "images/amazon_box.png"
  },
  {
    id: 2,
    company: "Walmart",
    num: 4,
    imgSrc: "images/walmart_box.png"
  },
  {
    id: 3,
    company: "Walmart",
    num: 2,
    imgSrc: "images/walmart_box.png"
  },
];

window.onload = inventory;

function inventory() {
  images.forEach(element => {
    let cElem = document.createElement("div");
    cElem.className = "cardElements";
    let cBounds = document.createElement("div");
    cBounds.className = "cardBounds";
    let cImg = document.createElement("img");
    cImg.className = "images";
    cImg.src=element.imgSrc;
    let cH3 = document.createElement("h3");
    cH3.textContent=element.company;
    let cH4 = document.createElement("h4");
    cH4.textContent=element.num + " boxes";

    cElem.appendChild(cBounds);
    cBounds.appendChild(cImg);
    cBounds.appendChild(cH3);
    cBounds.appendChild(cH4);

    let container_block = document.getElementById( 'container' );
    container_block.appendChild(cElem);
  });
}
