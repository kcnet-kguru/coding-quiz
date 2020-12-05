def ticTacToe(board):
    #00 01 02
    #10 11 12
    #20 21 22
    draw = 0
    #같은 행 판단
    for i in range(0,3):
        result = 1
        for j in range(0,3):
            result *= board[i][j]
        if result == 1:
            return 1
        elif result == 8:
            return 2
        elif result == 0:
            draw = -1
    #같은 열
    for i in range(0,3):
        result = 1
        for j in range(0,3):
            result *= board[j][i]
        if result == 1:
            return 1
        elif result == 8:
            return 2
        elif result == 0:
            draw = -1
    #대각선
    result = board[0][0]*board[1][1]*board[2][2] 
    if result == 1:
        return 1
    elif result == 8:
        return 2
    elif result == 0:
        draw = -1
    result = board[0][2]*board[1][1]*board[2][0]
    if result == 1:
        return 1
    elif result == 8:
        return 2
    elif result == 0:
        draw = -1

    return draw
