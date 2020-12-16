const assert = require("assert");
const solveV1 = require("./solve").solveV1;
const solveV2 = require("./solve").solveV2;

describe('* APP TEST *', function() {
    it('testcase1-1: solveV1([1, 2, 3, 4, 3, 2, 1]) should be return 3', function() {
        assert.equal(solveV1([1, 2, 3, 4, 3, 2, 1]), 3);
    });
    it('testcase1-2: solveV1([20, 10, -80, 10, 10, 15, 35]) should be return 0', function() {
        assert.equal(solveV1([20, 10, -80, 10, 10, 15, 35]), 0);
    });
    it('testcase2-1: solveV2([1, 2, 3, 4, 3, 2, 1]) should be return 3', function() {
        assert.equal(solveV2([1, 2, 3, 4, 3, 2, 1]), 3);
    });
    it('testcase2-2: solveV2([20, 10, -80, 10, 10, 15, 35]) should be return 0', function() {
        assert.equal(solveV2([20, 10, -80, 10, 10, 15, 35]), 0);
    });
});