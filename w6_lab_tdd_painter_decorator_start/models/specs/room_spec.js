const assert = require('assert');
const Room = require('../room.js');

describe('Room', function () {

    let room;

    beforeEach(function () {
        room = new Room(20);
    });

    it('should have an area in square meters', function () {
        const expected = 20;
        assert.strictEqual(room.areaInSquareMeters, expected);
    });

    it('should start not painted', function () {
        const expected = false;
        assert.strictEqual(room.isPainted, expected);
    });

    it('should be able to be painted', function () {
        const expected = true;
        room.paint();
        assert.strictEqual(room.isPainted, expected);
    });
});