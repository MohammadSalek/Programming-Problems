colors = {"255255255":"White", "192192192":"Silver", "128128128":"Gray", "000":"Black", "25500":"Red", "12800":"Maroon", "2552550":"Yellow" ,"1281280":"Olive" ,"02550":"Lime" ,"01280":"Green" ,"0255255":"Aqua" ,"0128128":"Teal" ,"00255":"Blue" ,"00128":"Navy" ,"2550255":"Fuchsia" ,"1280128":"Purple"}


R = [255, 192, 128, 0, 255, 128, 255, 128, 0, 0, 0, 0, 0, 0, 255, 128]
G = [255, 192, 128, 0, 0, 0, 255, 128, 255, 128, 255, 128, 0, 0, 0, 0]
B = [255, 192, 128, 0, 0, 0, 0, 0, 0, 0, 255, 128, 255, 128, 255, 128]

while(1==1):

	color_list = str(input()).split()

	for i in range(0,3):
		color_list[i] = int(color_list[i])

	r = color_list[0]
	g = color_list[1]
	b = color_list[2]

	if r < 0:
		break

	dif_list = []
	for i in range(0, 16):
		dif = ((R[i]-r)**2 + (G[i]-g)**2 + (B[i]-b)**2)**0.5

		dif_list.append(dif)

	#print(dif_list)
	j = dif_list.index(min(dif_list))
	r = str(R[j])
	b = str(B[j])
	g = str(G[j])
	

	code = r+g+b

	print(colors[code])