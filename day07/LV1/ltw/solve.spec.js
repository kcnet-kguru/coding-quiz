const assert = require("assert");
const solveQ1 = require("./solve").solveQ1;
const solveQ2 = require("./solve").solveQ2;

describe('* APP TEST *', function() {
    it('testcase1-1: solveQ1(2) should be return "Even"', function() {
        assert.equal(solveQ1(2), "Even");
    });
    it('testcase1-2: solveQ1(1) should be return "Odd"', function() {
        assert.equal(solveQ1(1), "Odd");
    });
    it('testcase2-1: solveQ2("test") should be return "es"', function() {
        assert.equal(solveQ2("test"), "es");
    });
    it('testcase2-2: solveQ2("testing") should be return "t"', function() {
        assert.equal(solveQ2("testing"), "t");
    });
    it('testcase2-3: solveQ2("middle") should be return "dd"', function() {
        assert.equal(solveQ2("middle"), "dd");
    });
    it('testcase2-4: solveQ2("A") should be return "A"', function() {
        assert.equal(solveQ2("A"), "A");
    });
});