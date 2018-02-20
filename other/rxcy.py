# convert RXCY model to BC23 and vice versa

data = {"A":1, "B":2 , "C":3 ,"D":4, "E":5, "F":6, "G":7, "H":8, "I":9, "J":10, "K":11, "L":12, "M":13, "N":14, "O":15, "P":16, "Q":17, "R":18, "S":19, "T":20, "U":21, "V":22, "W":23 , "X":24, "Y":25 ,"Z":26}


def Int_checker(s):
    try: 
        int(s)
        return True
    except ValueError:
        return False



satra = int(input())
satr_counter = 0

while(satr_counter < satra):

	final_answer = ""
	y = ""
	x = ""

	list1 = str(input())

	#model = RXCY
	if  list1[0]=="R" and Int_checker(list1[1]) and ("C" in list1):
		
		for i in range(1, int(list1.index("C"))):
			x += str(list1[i])
		for i in range(list1.index("C")+1 , len(list1)):
			y += str(list1[i])

		n = int(y)
		kh_qesmat = []
		answer = ""
		while(n>0):
			kh_qesmat.append(n%26)
			n = n//26

		#print(kh_qesmat)
		# 0 and -1 checker
		while 0 in kh_qesmat or -1 in kh_qesmat:
			#location zero
			if 0 in kh_qesmat:
				L0 = (kh_qesmat.index(0))
				if L0==(len(kh_qesmat)-1):
					del kh_qesmat[-1]

				else:
					kh_qesmat[L0] = 26
					kh_qesmat[L0+1] -= 1

			#-1 checker
			if -1 in kh_qesmat:
				L_1 = kh_qesmat.index(-1)
				kh_qesmat[L_1] = 25
				kh_qesmat[L_1+1] -= 1
				#del kh_qesmat[kh_qesmat.index(-1)]

		#print(kh_qesmat)
		for i in range(1, len(kh_qesmat)+1):
			num = kh_qesmat[-i]
			answer += list(data.keys())[list(data.values()).index(num)]

		y = answer
		final_answer = y+x
		print(final_answer)



	#model = BC23
	else:
		y = ""
		x = ""
		y_pirim = 0
		for j in range(0, len(list1)):
			#print(list1[j].isdigit())
			if list1[j].isdigit():
				x += list1[j]
			else:
				y += list1[j]

		for i in range(0, len(y)):
			y_pirim += data[y[i]]*(26**((len(y)-1) - i))
		y = str(y_pirim)

		final_answer = "R"+x+"C"+y
		print(final_answer)



	satr_counter+=1
