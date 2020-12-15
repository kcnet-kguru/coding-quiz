module.exports = {
    solve: function (startPriceOld, startPriceNew, savingPerMonth, percentLossByMonth) {
        var month = 0;
        while (savingPerMonth*month + startPriceOld - startPriceNew < 0) {
            month++;
            if (month % 2 === 0) percentLossByMonth += 0.5;
            startPriceOld *= 1 - percentLossByMonth/100;
            startPriceNew *= 1 - percentLossByMonth/100;
        }
        return [month, Math.round(savingPerMonth*month + startPriceOld - startPriceNew)];
    }
}