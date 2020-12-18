const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve([11,3,7,5], 10) should be return [3,7]', function() {
        assert.deepEqual(solve([11,3,7,5], 10), [3,7]);
    });
    it('testcase2: solve([4,3,2,3,4], 6) should be return [4,2]', function() {
        assert.deepEqual(solve([4,3,2,3,4], 6), [4,2]);
    });
    it('testcase3: solve([0,0,-2,3], 2) should be return "undefined"', function() {
        assert.equal(solve([0,0,-2,3], 2), undefined);
    });
    it('testcase4: solve([10,5,2,3,7,5], 10) should be return [3,7]', function() {
        assert.deepEqual(solve([10,5,2,3,7,5], 10), [3,7]);
    });
});