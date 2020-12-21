const assert = require("assert");
const solveQ1 = require("./solve").solveQ1;
const solveQ2 = require("./solve").solveQ2;

describe('* APP TEST *', function() {
    it('testcase1-1: solveQ1(6, "I") should be return "IIIIII"', function() {
        assert.equal(solveQ1(6, "I"), "IIIIII");
    });
    it('testcase1-2: solveQ1(5, "Hello") should be return "HelloHelloHelloHelloHello"', function() {
        assert.equal(solveQ1(5, "Hello"), "HelloHelloHelloHelloHello");
    });
    it('testcase2-1: solveQ2(3, 1, 3) should be return true', function() {
        assert.equal(solveQ2(3, 1, 3), true);
    });
    it('testcase2-2: solveQ2(12, 2, 6) should be return true', function() {
        assert.equal(solveQ2(12, 2, 6), true);
    });
    it('testcase2-3: solveQ2(100, 5, 3) should be return false', function() {
        assert.equal(solveQ2(100, 5, 3), false);
    });
    it('testcase2-4: solveQ2(12, 7, 5) should be return false', function() {
        assert.equal(solveQ2(12, 7, 5), false);
    });
});