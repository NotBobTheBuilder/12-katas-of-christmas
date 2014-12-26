#!/usr/bin/env python3

def isEven(word):
    # A word is even if any of its letters are even (due to parity)
    return any(ord(l) % 2 == 0 for l in word)

if __name__ == "__main__":
    print(isEven(input("Enter word: ")))
