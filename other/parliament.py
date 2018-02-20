while(True):

	satr = input().split()
	if satr[0]=="0":
		quit()
	for i in range(0 , len(satr)):
		satr[i] = int(satr[i])

	total = satr[0]
	usul = satr[1]
	eslah = satr[2]
	nesfe_total = total/2

	if usul>=eslah:
		gurupe_max = usul
	else:
		gurupe_max = eslah

	# 0 checker

	if gurupe_max==eslah and eslah>=nesfe_total:
		print(-1)

	elif usul+eslah == total:
		print(0)


	elif gurupe_max==usul and usul>=nesfe_total:
		print(0)

	else:
		ray_counter = 0
		while ray_counter+usul<=nesfe_total:
			ray_counter+=1

		print(ray_counter)
