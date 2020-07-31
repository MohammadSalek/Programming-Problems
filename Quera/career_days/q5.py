""" Quera Career Days Contest
Problem link:
https://quera.ir/contest/assignments/19581/problems/62954
"""


def fix_format(word, cap=False) -> str:
    """Fixes the format of the words as requested in the problem"""

    return word.lower() if not cap else word.lower().capitalize()


def count_ending_spaces(line) -> int:
    """Counts the ending spaces of a line (string)"""

    spaces = 0
    for i in reversed(line):
        if i == " ":
            spaces += 1
        else:
            break

    return spaces


def distribute_spaces(line, spaces) -> str:
    """Distributes spaces in the line as requested in the problem"""

    words = line.split()

    if len(words) == 1:  # if it is the only word:
        words[0] = words[0] + ' ' * spaces

    else:
        space_round = spaces // (len(words) - 1)
        remaining_spaces = spaces - (len(words) - 1) * space_round

        # add remaining spaces:
        if remaining_spaces > 0:
            left_spaces = remaining_spaces // 2
            right_spaces = remaining_spaces - left_spaces

            # add spaces to left side
            while left_spaces > 0:
                for i, word in enumerate(words):
                    if i == len(words) - 1:
                        continue
                    words[i] = word + ' '
                    left_spaces -= 1
                    if left_spaces <= 0:
                        break

            # add spaces to right side
            while right_spaces > 0:
                for i, word in enumerate(reversed(words)):
                    if i == 0:
                        continue
                    words[len(words) - 1 - i] = word + ' '
                    right_spaces -= 1
                    if right_spaces <= 0:
                        break

        # add space rounds to all words(except the last right one):
        while space_round >= 0:
            words = [
                word + ' ' if (
                    i != len(words)-1
                ) else word for i, word in enumerate(words)
            ]
            space_round -= 1

    # join with their original one-space:
    return "".join(words)


def justify(words, line_length) -> list:
    """Justifies the text"""

    # fix the format first:
    fixed_words = []
    for i, word in enumerate(words):
        new_word = ""
        if i == 0:  # first of sentence:
            new_word = fix_format(word, True)
        elif i != 0 and words[i - 1].endswith(("!", "?", ".")):  # first word:
            new_word = fix_format(word, True)
        else:
            new_word = fix_format(word)

        fixed_words.append(new_word)

    # set fixed_words instead of old ones:
    words = fixed_words

    # justify:
    final_lines = []
    temp_line = ""
    for word in words:

        temp = temp_line + " " + word if temp_line else word

        if len(temp) == line_length:
            final_lines.append(f"{temp}")
            temp_line = ""

        elif len(temp) > line_length:
            final_lines.append(
                f"{temp_line + ' ' * (line_length - len(temp_line))}"
            )
            temp_line = word

        elif len(temp) < line_length:
            temp_line = temp

    # add rest of remaining temp_line cache:
    if temp_line:
        final_lines.append(
            f"{temp_line + ' ' * (line_length - len(temp_line))}"
        )

    # fix extra ending spaces:
    for i, line in enumerate(final_lines):
        end_spaces = count_ending_spaces(line)
        if end_spaces > 0:
            final_lines[i] = distribute_spaces(line, end_spaces)

    # add pipe('|') to 'em:
    final_lines = [f"|{line}|" for line in final_lines]

    return final_lines


def main():
    """Entrypoint function"""

    # get the inputs and the sentence(s):
    sentences = []
    cases = int(input())
    for _ in range(cases):
        (_, w_var) = [int(i) for i in input().split()]
        words = input().split()

        # justify 'em:
        sentences.append(justify(words, w_var))

    # print the sentences:
    for res in sentences:
        print(*res, sep="\n")


if __name__ == "__main__":
    main()
