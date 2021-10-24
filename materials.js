class Box {
    constructor(
        company,
        amountBoxes
    ) {
        this.company = company;
        this.amountBoxes = amountBoxes;
    }
    addBoxes(a) {
        this.amountBoxes += a;
    }
    getCompany() {
        console.log(this.company);
        return this.company;
    }
    getAmountBoxes() {
        console.log(this.amountBoxes);
        return this.amountBoxes;
    }
    useBox(k) {
        k.useKeys();
        this.amountBoxes -= 1;
    }
    //Developer Method
    displayBoxType() {
        console.log("Box Name: " + this.company + ". Amount: " + this.amountBoxes + ".");
    }
}

class Key {
    constructor(amountKeys) {
        this.amountKeys = amountKeys;
    }
    addKeys() {
        this.amountKeys += 1;
    }
    getAmount() {
        console.log(this.amountKeys);
        return this.amountKeys;
    }
    useKeys() {
        this.amountKeys -= 1;
    }
}

class Discount {
    constructor(
        company,
        percentage_off
    ) {
        this.company = company;
        this.percentage_off = percentage_off;
        this.used = false;
    }
    getDiscCompany() {
        return this.percentage_off = this.percentage_off;
    }
    getPercentOff() {
        return this.percentage_off = this.percentage_off;
    }
    useDiscount() {
        this.used = true;
    }
}

k = new Key(13);
boxes = [];
boxes[0] = new Box("Target", 2);
boxes[1] = new Box("Amazon", 3);
boxes[2] = new Box("Walmart", 2);
boxes[3] = new Box("Chick-fil-a", 1)
boxes[4] = new Box("Khol's", 0);
boxes[5] = new Box("McDonald's", 0);
boxes[6] = new Box("Steam", 0);