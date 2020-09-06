num = int(input())
first = []
second = []
for i in range(num):
    line = input().split(' ')
    name = line[0]
    t1 = float(line[1])
    t2 = float(line[2])
    first.append([name, t1])
    second.append([name, t2])

first.sort(key=lambda x: x[1])
second.sort(key=lambda x: x[1])

total_time = 0
squad_list_of_lists = []
for i in first:
    name = i[0]

    squad = []
    time = 0
    for j in second:
        if len(squad) < 3:
            if j[0] != name:
                squad.append(j[0])
                time += j[1]
        else:
            break
    squad.insert(0, name)
    time += i[1]

    squad_list_of_lists.append([squad, time])

squad_list_of_lists.sort(key=lambda x: x[1])
print(squad_list_of_lists[0][1])
for runner in squad_list_of_lists[0][0]:
    print(runner)
