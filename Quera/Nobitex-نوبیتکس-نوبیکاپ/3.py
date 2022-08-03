# https://quera.org/problemset/129729/

class Chain:

    def __init__(self, item):
        if isinstance(item, (str, int, float)):
            try:
                _ = int(item)
                self.is_num = True
            except ValueError:
                self.is_num = False
        else:
            raise Exception('invalid operation')
        self.val = item

    def __call__(self, item):
        if self.is_num:
            if not isinstance(item, (int, float)):
                raise Exception('invalid operation')
            self.val += item
        else:
            if isinstance(item, (int, float)):
                raise Exception('invalid operation')
            self.val += ' ' + item
        return self

    def __eq__(self, other):
        return self.val == other

    def __str__(self):
        if self.is_num and int(self.val) == self.val:
            return str(int(self.val))
        return str(self.val)

    def __repr__(self):
        if self.is_num and int(self.val) == self.val:
            return str(int(self.val))
        return str(self.val)

    def __unicode__(self):
        if self.is_num and int(self.val) == self.val:
            return str(int(self.val))
        return str(self.val)
