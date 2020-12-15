const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve([1,2,3,4,3,2,1]) should be return 3', function() {
        assert.equal(solve([1,2,3,4,3,2,1]), 3);
    });
    it('testcase2: solve([20,10,-80,10,10,15,35]) should be return 0', function() {
        assert.equal(solve([20,10,-80,10,10,15,35]), 0);
    });   
});