const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve([1, 1, 1, 2, 2, 3]) should be return 18', function() {
        assert.equal(solve([1, 1, 1, 2, 2, 3]), 18);
    });
    it('testcase2: solve([6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200]) should be return 4000000', function() {
        assert.equal(solve([6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200]), 4000000);
    });    
});