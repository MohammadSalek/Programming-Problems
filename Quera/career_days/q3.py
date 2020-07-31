""" Quera Career Days Contest
Problem link:
https://quera.ir/contest/assignments/19581/problems/62952
"""


def calculate_area(chart, n_var, m_var):
    """Calculates the area under graph"""

    area = 0

    # boolean list to check whether we have seen the graph in a col or not:
    seen_graph = [False] * m_var

    # iterate over chart:
    for row in range(n_var):
        for col in range(m_var):
            point = chart[row][col]

            # if seen the graph:
            if point in '_/\\':
                seen_graph[col] = True

            if seen_graph[col]:
                if point != '_':  # because area under "_" is zero
                    area += 0.5 if point in '/\\' else 1.0

    return f"{area:.3f}"


def main():
    """Entrypoint function"""

    areas = []

    # get input and save the chart as list:
    cases = int(input())
    for _ in range(cases):
        (n_var, m_var) = [int(i) for i in input().split()]
        chart = [input() for row in range(n_var)]

        # save the area:
        areas.append(calculate_area(chart, n_var, m_var))

    # print the output:
    print(*areas, sep='\n')


if __name__ == "__main__":
    main()
