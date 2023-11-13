"""
    Task: Gegeben int x und int i, berechne x^i ohne *-Operator zu benutzen.
    Solution: For i number of times add x to temp, effectively multiplying it.
    Pseudocode:
    set answer 1 for case i = 0
        for i
            reset temp
            for x
                add answer to temp
            set answer to temp
        return answer
"""

def PenguPowers(x, i):
    answer = 1
    for num1 in range(i):
        temp = 0
        for num2 in range(x):
            temp += answer
        answer = temp
    return answer

print(PenguPowers(5,1))
