#!/usr/bin/env python3

class Date():
    @staticmethod
    def from_str(plain):
        from re import match
        (year, month, day) = match(r"(\d\d\d\d)-(\d\d)-(\d\d)", plain).groups()
        return Date(int(year), int(month), int(day))

    def __init__(self, year, month, day):
        self.year = year
        self.month = month
        self.day = day
        self.month_name = "January February March April May June July August September October November December".split(" ")[self.month - 1]
        self.day_suffix = {1: "st", 2: "nd", 3: "rd"}.get(self.day % 10, "th")

    def __format__(self, format_spec):
        return format_spec.format(y=self.year, m=self.month, d=self.day, M=self.month_name, s=self.day_suffix)

    def to_us(self):
        return format(self, "{m:2}/{d:2}/{y:4}")

    def to_gb(self):
        return format(self, "{d:2}/{m:2}/{y:4}")

    def to_spoken(self):
        return format(self, "{d}{s} of {M} {y}")

if __name__ == "__main__":
    date = Date.from_str(input("Enter ISO Date: "))
    print("GB: ", date.to_gb())
    print("US: ", date.to_us())
    print("Spoken: ", date.to_spoken())
