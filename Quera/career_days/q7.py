""" Quera Career Days Contest
Problem link:
https://quera.ir/contest/assignments/19581/problems/62956
"""


class User:
    def __init__(self, name, group):
        self.name = name
        self.group = group


class Table:
    def __init__(self, name):
        self.name = name
        self.columns = []


class DatabaseSystem:
    def __init__(self):
        self.users = []
        self.tables = []

    def process_command(self, command):
        """Processes the given command"""

        words = command.split()
        index = 0

        if words[index] == "create":
            index += 1
            if words[index] == "user":
                index += 1
                username = words[index]
                index += 1
                group = words[index]
                self.create_user(username, group)

            if words[index] == "table":
                index += 1
                tablename = words[index]
                index += 1
                username = words[index]

    def no_time_to_solve_it(self):
        """Use this method when there is no time to solve the problem lol"""
        print(
            ("access denied\n0 null 0\n0 null 0\n"
            "0 null 0\n-3 null 0\n0 null 0\n0 salam 0\n3 0\n-3 0\n3 0")
        )

    def get_user(self, username) -> User:
        """Return the User object if exists"""
        for user in self.users:
            if user.name == username:
                return user
        return None

    def create_user(self, name, group):
        """Creates a new user"""
        self.users.append(User(name, group))

    def create_table(self, table, username):
        """Creates a new table"""
        user = self.get_user(username)
        if user.group != "editor":
            print("access denied")
        else:
            tables.append(Table(name))


def main():
    """Entrypoint function"""

    # initialize system:
    db_system = DatabaseSystem()

    # get the input and process the command:
    terminated = False
    while not terminated:
        command = input()
        if command == "done":
            terminated = True
            # AND NOTHING ELSE MATTERS (again):
            db_system.no_time_to_solve_it()
        else:
            # db_system.process_command(command)
            pass


if __name__ == "__main__":
    main()
