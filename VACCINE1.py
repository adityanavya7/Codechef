D1, V1, D2, V2, total = map(int, input().split())

if(D2 < D1):
    D1, D2 = D2, D1
    V1, V2 = V2, V1

C = 0
day = 0

while(total > C):
    if(day >= D1 and day < D2):
        C+= V1
    elif (day >= D2):
        C+= V1+V2
    day+=1
    
print(day - 1)