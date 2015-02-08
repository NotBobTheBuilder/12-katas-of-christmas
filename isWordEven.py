# -*- coding: utf-8 -*-
# Write a program to determine whether a word is even; where
#
#    a word is an arbitrary length letter sequence using only a-z or A-Z
#    a word is even when the product of its letters’ integer values is even
#    a letter’s integer value is its index in the alphabet; so a=1, b=2 (A=1 too)
#
#Your program should read in a word from standard input; and write out the string "true" if the word is even, or "false" otherwise.
#
#Examples input -> output:   aaa -> false,   bbb -> true
import sys
from string import ascii_lowercase
alphabet = list(ascii_lowercase)
wordSum = 0

#Read from stdin, cast to lowercase, remove newline character.
line = sys.stdin.readline().lower().strip() 
if line:
	for letter in list(line):
		wordSum += alphabet.index(letter)+1 #Increment as list is zero-indexed.
print "false" if wordSum%2 else "true"
