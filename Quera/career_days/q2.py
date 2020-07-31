""" Quera Career Days Contest
Problem link:
https://quera.ir/contest/assignments/19581/problems/62951
"""


def por_rect_maker(n_var, m_var, symbol):
    """Makes symbol-p    print(*reversed(result), sep='\n')
or (e.g. "X-por", ".-por") small rectangles

    >>> por_rect_maker(2, 3, 'X')
    [['X', 'X', 'X'], ['X', 'X', 'X']]
    """

    return [[symbol] * m_var for _ in range(n_var)]


def final_rect_maker(x_por, dot_por):
    """Makes the final 3n*3m rectangles"""
    return (
        [x_por[i] + dot_por[i] + x_por[i] for i in range(len(x_por))]
        + [dot_por[i] + x_por[i] + dot_por[i] for i in range(len(x_por))]
        + [x_por[i] + dot_por[i] + x_por[i] for i in range(len(x_por))]
    )


def main():
    """Entrypoint function"""

    # get n and m and convert them to int:
    (n_var, m_var) = [int(i) for i in input().split()]

    # create the "por" rectangles:
    x_por = por_rect_maker(n_var, m_var, "X")
    dot_por = por_rect_maker(n_var, m_var, ".")

    # create the final 3n*3m rectangle and put it into output:
    final_rect = ["".join(row) for row in final_rect_maker(x_por, dot_por)]
    print(*final_rect, sep="\n")


if __name__ == "__main__":
    main()
