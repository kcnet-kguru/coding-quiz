const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve(10) should be return 22', function() {
        assert.equal(solve(10), 22);
    });
});