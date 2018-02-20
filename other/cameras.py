list_ABC= ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
list_adad = ["1","2","3","4","5","6","7","8","9"]


satra = int(input())
pelak_list = []
vaziat = "ok"
lineCounter = 0

while(lineCounter<satra):

	pelak = str(input())


	#kharab checker
	if len(pelak)!=8:
		pass
	
	elif pelak[4] not in list_ABC:
		pass

	elif pelak[0] != pelak[1]:
		pass
		
	elif (pelak[0] not in list_adad) or (pelak[1] not in list_adad) or (pelak[2] not in list_adad) or (pelak[3] not in list_adad) or (pelak[5] not in list_adad) or (pelak[6] not in list_adad) or (pelak[7] not in list_adad):
		pass
	else:
		print(pelak)

	lineCounter+=1
