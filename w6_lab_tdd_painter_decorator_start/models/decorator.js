const Decorator = function () {
    this.paintStock = [];
};

Decorator.prototype.addCanOfPaint = function (can_of_paint) {
    this.paintStock.push(can_of_paint);
};

Decorator.prototype.calculateAmountOfPaint = function () {
    let total = 0;
    for (const paint of this.paintStock) {
        total += paint.litresOfPaint;
    }
    return total;
};

Decorator.prototype.hasEnoughPaint = function (room) {
    return this.calculateAmountOfPaint() >= room.areaInSquareMeters;
};

Decorator.prototype.paintRoom = function (room) {
    if (!this.hasEnoughPaint(room)) {
        return;
    }
    room.paint()
};

module.exports = Decorator 