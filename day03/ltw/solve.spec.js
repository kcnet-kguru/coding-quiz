const assert = require("assert");
const solve = require("./solve").solve;

describe('* APP TEST *', function() {
    it('testcase1: solve([[1,2],[4],[5,6]]) should be return 4', function() {
        assert.equal(solve([[1,2],[4],[5,6]]), 4);
    });
    it('testcase2: solve([[1,2],[4,4],[5,6,6]]) should be return 4', function() {
        assert.equal(solve([[1,2],[4,4],[5,6,6]]), 4);
    });
    it('testcase3: solve([[1,2],[3,4],[5,6]]) should be return 8', function() {
        assert.equal(solve([[1,2],[3,4],[5,6]]), 8);
    });
    it('testcase4: solve([[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]]) should be return 72', function() {
        assert.equal(solve([[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]]), 72);
    });    
});