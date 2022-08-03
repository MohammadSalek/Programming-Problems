# https://quera.org/problemset/129726/

def separator(ls):
    odd_list = []
    even_list = []
    for num in ls:
        even_list.append(num) if num % 2 == 0 else odd_list.append(num)
    return even_list, odd_list
