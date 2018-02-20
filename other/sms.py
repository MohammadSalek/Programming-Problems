list1 = ["A", "B", "C"]
list2 = ["a", "b", "c"]
list3 = ["D", "E", "F"]
list4 = ["d", "e", "f"]
list5 = ["G", "H", "I"]
list6 = ["g", "h", "i"]
list7 = ["J", "K", "L"]
list8 = ["j", "k", "l"]
list9 = ["M", "N", "O"]
list10 = ["m", "n", "o"]
list11 = ["P", "Q", "R", "S"]
list12 = ["p", "q", "r", "s"]
list13 = ["T", "U", "V"]
list14 = ["t", "u", "v"]
list15 = ["W", "X", "Y", "Z"]
list16 = ["w", "x", "y", "z"]

answer_list = ""
mylist = []

while(True):

	mystring = input()
	
	if (mystring == "#"):
		break

	for k in range(0,len(mystring)):

		for i in range(1, 17):

			exec("%s = list%d" % ("mylist", i))

			if (mystring[k] in mylist):
				listIndex = mylist.index(mystring[k])

				jump = listIndex-(k+1)

				while(jump < -len(mylist)):
					jump = jump+(len(mylist))

				new_letter = mylist[jump]
				answer_list += new_letter

	print(answer_list)
	answer_list = ""

