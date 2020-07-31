""" Quera Career Days Contest
Problem link:
https://quera.ir/contest/assignments/19581/problems/62953
"""


def check_for_horseshoe(farm, n_var, m_var, horseshoe) -> int:
    """Brute-froces the farm to find possible horseshoe places"""

    found = 0
    row = 0
    col = 0
    horseshoe_length = len(horseshoe)

    while row < n_var:

        # check if we can separate a 3x3 square:
        if (
                row + horseshoe_length <= n_var
                and col + horseshoe_length <= m_var
        ):

            can_fit_horseshoe = True
            for i in range(horseshoe_length):
                for j in range(horseshoe_length):
                    # print(f"row:{row}, col:{col}, i:{i}, j:{j}")
                    if (
                            horseshoe[i][j] == "*"
                            and farm[row + i][col + j] == "."
                    ):
                        can_fit_horseshoe = False
                        break
                if not can_fit_horseshoe:
                    break

                if can_fit_horseshoe and i == horseshoe_length - 1:
                    found += 1
        col += 1

        if col >= m_var:
            col = 0
            row += 1

    return found


def find_rotated_horseshoes(farm, n_var, m_var, horseshoe) -> int:
    """Finds the rotated horseshoes in all 90-degree-rotated shapes"""
    found = check_for_horseshoe(farm, n_var, m_var, horseshoe)
    for __ in range(3):
        horseshoe = rotate_right(horseshoe)
        found += check_for_horseshoe(farm, n_var, m_var, horseshoe)

    return found


def rotate_right(horseshoe) -> list:
    """Rotates the horseshoe (list) 90 degrees to the right"""

    return list(zip(*reversed(horseshoe)))


def invert(horseshoe) -> list:
    """Inverts the horseshoe like mirror"""
    return [row[::-1] for row in horseshoe]


def main():
    """Entrypoint function"""

    horseshoe = [["*", "*", "*"], ["*", ".", "*"], [".", ".", "*"]]

    found = 0

    # get n and m then convert them into int:
    (n_var, m_var) = [int(i) for i in input().split()]

    # save farm shape:
    farm = [input() for _ in range(n_var)]

    # find horseshoes:
    found += find_rotated_horseshoes(farm, n_var, m_var, horseshoe)

    # invert and find again the horseshoes:
    horseshoe = invert(horseshoe)
    found += find_rotated_horseshoes(farm, n_var, m_var, horseshoe)

    # print the result:
    print(found)


if __name__ == "__main__":
    main()
