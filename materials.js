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
        return this.amountKeys;
    }
}

class Discount {
    constructor(
        company,
        percentage_off
    ) {

    }
}

k = new Key(10);
