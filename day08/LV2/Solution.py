def solution1(bridge_length, weight, truck_weights):
    time = 0
    now_truck = 0
    bridge = [0] * bridge_length

    while len(truck_weights) > 0:
        now_truck -= bridge.pop(0)
        time += 1
        if now_truck + truck_weights[0] <= weight:
            truck = truck_weights.pop(0)
            now_truck += truck
            bridge.append(truck)
        else:
            bridge.append(0)
        
    return time + bridge_length