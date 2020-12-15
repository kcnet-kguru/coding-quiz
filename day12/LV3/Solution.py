def orderWeight(weight_list):
    return ' '.join(sorted(sorted(weight_list.split()),key=lambda x: sum(list(map(int,x)))))