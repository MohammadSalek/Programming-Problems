def inte_tush(stringe):
	try:
		stringe = int(stringe)
		return stringe
	except:
		return
breaker = 1
total_total = 0
while(breaker>0):
	vurudi = input()
	if vurudi == "$$$":

		total_saat = total_total//60
		total_saat = str(total_saat)

		total_deiqe = total_total%60
		total_deiqe = str(total_deiqe)
		#print(total_deiqe)

		if len(total_deiqe)<2:
			total_deiqe = "0" + total_deiqe

		total_total = total_saat+":"+total_deiqe

		print(total_total)
		total_total = 0
		vurudi = input()

	if vurudi == "###":

		total_saat = total_total//60
		total_saat = str(total_saat)

		total_deiqe = total_total%60
		total_deiqe = str(total_deiqe)
		#print(total_deiqe)

		if len(total_deiqe)<2:
			total_deiqe = "0" + total_deiqe

		total_total = total_saat+":"+total_deiqe

		print(total_total)
		total_total = 0

		
		breaker = -1
		break

	#if breaker>0:
	vurudi_list = []
	for i in range(0, len(vurudi)):
		vurudi_list.append(vurudi[i])

	numad = vurudi_list[0]

	for i in range(0, len(vurudi)):
		if vurudi_list[i]==":" or vurudi_list[i]=="." :
			donoqte = vurudi_list[i]

	string_saat = ""
	for j in range(1, vurudi_list.index(donoqte)):
		string_saat += vurudi_list[j]
	saat = inte_tush(string_saat)

	string_deiqe = ""
	for k in range(vurudi_list.index(donoqte)+1, len(vurudi)):
		string_deiqe += vurudi_list[k]
	deiqe = inte_tush(string_deiqe)

	#print(numad ,saat, string_deiqe)
	total = 0
	if saat != None:
		if numad == "-":
			total -= saat*60
		elif numad == "+":
			total += saat*60

	if deiqe != None:
		if numad == "-":
			total -= deiqe
		elif numad == "+":
			total += deiqe

	total_total += total
