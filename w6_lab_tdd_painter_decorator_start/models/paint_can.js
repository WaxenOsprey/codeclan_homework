const PaintCan = function(litresOfPaint) {
    this.litresOfPaint = litresOfPaint;
};

PaintCan.prototype.isEmpty = function () {
    // return !this.litresofPaint;
    if (this.litresOfPaint === 0)
        return true;
    else 
        return false;
};

PaintCan.prototype.empty = function () {
    this.litresOfPaint = 0;
};


module.exports = PaintCan;