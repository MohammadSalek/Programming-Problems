while 1==1:
	income = int(input())

	if income==0:
		quit()

	if income>1000000:

		if income>5000000:
			income -= income*20//100

		elif 1000000<income<=5000000:
			income -= income*10//100

		print(int(income))


	else:
		print(income)