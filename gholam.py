satr = 0
lines = int(input())

while(satr<lines):
	steps = int(input().split()[1])
	
	list_asli = input().split()
	le = len(list_asli)

	for i in range(0, le):
		list_asli[i] = int(list_asli[i])
		#list_asli = list(map(int, list_asli)

	if 2 in list_asli:
		L0 = list_asli.index(2)
		move = +1
	elif 3 in list_asli:
		L0 = list_asli.index(3)
		move = -1


	next_move = L0
	step_counter=0
	yellow_counter = 0
	while(step_counter<steps):

		if next_move+move>(le-1):
			move = -1
		elif next_move+move<0:
			move = +1

		next_move+=move

		if list_asli[next_move] == 0:
			yellow_counter+=1
			

		step_counter +=1

	print(yellow_counter)

	satr+=1
