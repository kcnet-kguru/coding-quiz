const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve(1, 9) should be return 1', function() {
        assert.equal(solve(1, 9), 1);
    });
    it('testcase2: solve(4, 17) should be return 2', function() {
        assert.equal(solve(4, 17), 2);
    });    
});