# 12 Katas of Christmas

12 katas [Simple, self contained problems], 1 released every day of Christmas.

To play:

  1. Write solution
  2. Optionally fork this repo, commit your implementation & file a PR


For more info on what Katas are, see [here](http://codekata.com/) or have a Google :)

The objective of a kata is to solve it yourself and learn from the process. While Git & GitHub aren’t part of that process, you may find it interesting to submit your solutions in a PR to this repository. More info on that process is available [here](https://help.github.com/articles/fork-a-repo/).

Note: I don’t know whether the 12 days begin on Christmas Day or Boxing Day. If it’s Boxing Day - great; I knew that. If it’s Christmas Day, assume this is a joke about off by one errors or something witty like that.

## Kata 01 (December 26)

Write a program to determine whether a `word` is `even`; where

 - a `word` is an arbitrary length letter sequence using only a-z or A-Z
 - a `word` is `even` when the product of its letters’ integer values is even
 - a letter’s integer value is its index in the alphabet; so a=1, b=2 (A=1 too)

Your program should read in a word from standard input; and write out the string "true" if the word is even, or "false" otherwise.

Examples input -> output:

  - `aaa` -> `false`
  - `bbb` -> `true`
