def board_check(board):
    if board[0][2] == board[1][1] == board[2][0] and board[0][2] != 0:
        return board[0][2]
    elif board[0][0] == board[1][1] == board[2][2] and board[0][0] != 0:
        return board[0][0]
        
    answer_set = set()
    for i in range(3):
        col_set = set(board[i])
        row_set = set(map(lambda x:x[i],board))
        
        if len(col_set) == 1:
            answer_set.update(col_set)
        if len(row_set) == 1:
            answer_set.update(row_set)

    answer_sum = sum(answer_set)
    if answer_sum == 3:
        return 0
    elif answer_sum == 0:
        return -1
    else:
        return answer_sum