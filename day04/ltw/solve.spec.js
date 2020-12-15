const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: nbMonths(2000, 8000, 1000, 1.5) should be return [6, 766]', function() {
        assert.deepEqual(solve(2000, 8000, 1000, 1.5), [6, 766]);
    });    
});