const assert = require('assert');
const PaintCan = require('../paint_can.js');

describe('Paint Can', function () {

    let paintCan;

    beforeEach(function () {
        paintCan = new PaintCan(10);
    });

    it('should have a number of litres of paint', function () {
        const expected = 10;
        assert.strictEqual(paintCan.litresOfPaint, expected)
    });

    it('should be able to check if it is empty', function () {
        const expected = false;
        const result = paintCan.isEmpty();
        assert.strictEqual(result, expected)
    });

    it('should be able to empty itself of paint', function () {
        const expected = true;
        paintCan.empty()
        assert.strictEqual(paintCan.isEmpty(), expected)
    })
})