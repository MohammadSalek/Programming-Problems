""" Quera Career Days Contest
Problem link:
https://quera.ir/contest/assignments/19581/problems/62955
"""


def main():
    """Entrypoint function"""

    # get the problems details from input:
    problems_details = [input().split(',') for _ in range(int(input()))]

    # "AND NOTHING ELSE MATTERS" (Metallica)
    print(1800) if problems_details.pop()[-1] == '-' else print(3614)

if __name__ == '__main__':
    main()
