def nbMonths(old, new, saving, percent):
    month = 0
    while old - new + saving * month < 0:
        month += 1
        devalue = (100.0 - percent - 0.5 * (month / 2)) / 100.0
        old *= devalue
        new *= devalue
    return [month, round(old - new + saving * month)]