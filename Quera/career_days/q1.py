""" Quera Career Days Contest
Problem link:
https://quera.ir/contest/assignments/19581/problems/62950
"""


def main():
    """Entrypoint function"""

    points = [1, 3, 5]

    # since the input is guaranteed to be a number we convert it directly:
    s_input = int(input())

    result = []

    # iterate from the biggest number (reversed list):
    for point in reversed(points):
        if s_input - point >= 0:
            s_input -= point
            result.append('Yes')
        else:
            result.append('No')

    # put the results in output:
    print(*reversed(result), sep='\n')


if __name__ == '__main__':
    main()
