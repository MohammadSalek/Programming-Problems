# The IOI Logo Design - Tehran Regional


def IndexInList(list_esh, id_esh):

	try:
		Index_esh = list_esh.index(id_esh)
		return Index_esh
	except:
		return -1

while(1==1):

	satra = int(input())
	if satra == 0:
		break

	list_total = []
	satr_counter = 0
	breaker = -1
	while satr_counter<satra:

		#making the lists from list0 
		exec("list%d = input().split()" % (satr_counter))
		#0 checker
		exec("list_test = list%d" % (satr_counter))
		if "0" in list_test or 0 in list_test :
			breaker = 0
			break

		# purifying the list
		exec("del list%d[0]"%(satr_counter))
		#make a total list
		exec("list_total += list%d"%(satr_counter))
		satr_counter+=1

	if breaker==0:
		break

	# tekraria hazf:
	pure_list = list(set(list_total))

	#point bandi
	points_list = []
	for j in pure_list:
		points = 0
		for i in range(0, satra):
			exec(("search_list=list%d")%(i))
			if j in search_list:
				#ye chize riazie sade 0=>3 , 1=>2 , 2=>1 ; ke yani index*-1 + 3
				points += search_list.index(j)*(-1)+3
		points_list.append(points)

	max_point = -1
	winner_list = []
	for i in range(0,len(points_list)):
		if points_list[i]>max_point:
			max_point = points_list[i]

	for i in range(0,len(points_list)):
		if points_list[i]==max_point:
			winner_list.append(pure_list[i])

	if len(winner_list) == 1:
		final_answer = winner_list[0]

	# jaygah_points ro hesab kon
	else:
		jaygah_points_list = []
		for i in winner_list:
			jaygah_points = 0
			for j in range(0, satra):
				exec(("search_list=list%d")%(j))
				if i in search_list:
					jaygah_points += search_list.index(i)
			jaygah_points_list.append(jaygah_points)


		# min point is the winner
		min_point = min(jaygah_points_list)
		if jaygah_points_list.count(min_point) == 1:
			final_answer = winner_list[jaygah_points_list.index(min_point)]
		else:

			#purify winner list : because shyd ke 3 ta bashan ke winner bashn, va emtiaze 3 tashunm yeki bashe, vali jaygahe 2 tashun frq kone!!!
			winner_list_final = []
			indexe_min = 10
			while(indexe_min>-1):

				indexe_min = IndexInList(jaygah_points_list, min_point)
				if indexe_min>(-1):
					jaygah_points_list[indexe_min] = -1
					winner_list_final.append(winner_list[indexe_min])

			#moratab sazi + amade sazi baraye print
			for i in range(0, len(winner_list_final)):
				winner_list_final[i] = int(winner_list_final[i])
			winner_list_final = sorted(winner_list_final)
			for i in range(0, len(winner_list_final)):
				winner_list_final[i] = str(winner_list_final[i])
			winner_str = ""
			for i in range(0, len(winner_list_final)):
				winner_str += winner_list_final[i]+" "
			final_answer = ""
			for i in range(0, len(winner_str)-1):
				final_answer+= winner_str[i]

	print(final_answer)
