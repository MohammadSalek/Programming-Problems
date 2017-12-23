while(1==1):

	avali = input().split()
	for i in range(0,2):
		avali[i] = int(avali[i])

	if avali[0]<1:
		quit()

	costumerKey = input().split()
	for i in range(0,avali[0]):
		costumerKey[i] = int(costumerKey[i])


	satra = avali[1]
	satrCounter = 0
	keyCounter = 0
	while(satrCounter<satra):

		trashKey = input().split()
		for i in range(0,avali[0]):
			trashKey[i] = int(trashKey[i])

		dandunCounter = 0
		for i in range(0, avali[0]):
			if trashKey[i]<=costumerKey[i]:
				dandunCounter+=1
		if dandunCounter==avali[0]:
			keyCounter+=1

		satrCounter+=1
	print(keyCounter)