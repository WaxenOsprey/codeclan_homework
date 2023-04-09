const assert = require('assert');
const Decorator = require('../decorator.js');
const PaintCan = require('../paint_can.js');
const Room = require('../room.js');

describe('Decorator', function () {

    let paintCan1;
    let paintCan2;
    let paintCan3;
    let paintCan4;
    let paintCan5;
    let room;
    let decorator;

    beforeEach(function () {
        paintCan1 = new PaintCan(5);
        paintCan2 = new PaintCan(10);
        paintCan3 = new PaintCan(15);
        paintCan4 = new PaintCan(20);
        paintCan5 = new PaintCan(0);
        room = new Room(30);
        decorator = new Decorator();    
    });

    it('should start with an empty paint stock', function () {
        const expected = [];
        assert.deepStrictEqual(decorator.paintStock, expected);
    });

    it('should be able to add a can of paint to stock', function () {
        const expected = [paintCan1];
        decorator.addCanOfPaint(paintCan1);
        assert.deepStrictEqual(decorator.paintStock, expected)
    });

    it('should be able to calculate total litres of paint it has in stock', function () {
        decorator.addCanOfPaint(paintCan1);
        decorator.addCanOfPaint(paintCan2);
        const expected = 15;
        assert.deepStrictEqual(decorator.calculateAmountOfPaint(), expected)
    });

    it('should be able to calculate whether it has enough paint to paint a room', function () {
        decorator.addCanOfPaint(paintCan1);
        decorator.addCanOfPaint(paintCan2);
        decorator.addCanOfPaint(paintCan3);
        const expected = true;
        assert.deepStrictEqual(decorator.hasEnoughPaint(room), expected)
    });

    it('should be able to calculate if it doesnt have enough paint to paint a room', function () {
        decorator.addCanOfPaint(paintCan1);
        decorator.addCanOfPaint(paintCan2);
        const expected = false;
        assert.deepStrictEqual(decorator.hasEnoughPaint(room), expected)

    })

    it('should be able to paint room if it has enough stock', function() {
        decorator.addCanOfPaint(paintCan1);
        decorator.addCanOfPaint(paintCan2);
        decorator.addCanOfPaint(paintCan3);
        decorator.addCanOfPaint(paintCan4);
        const expected = true;
        decorator.paintRoom(room);
        assert.strictEqual(room.isPainted, expected);

    });

})