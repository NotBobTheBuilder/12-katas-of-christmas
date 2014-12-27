# 12 Katas of Christmas

12 katas [Simple, self contained problems], 1 released every day of Christmas.

To play:

  1. Write solution
  2. Optionally fork this repo, commit your implementation & file a PR


For more info on what Katas are, see [here](http://codekata.com/) or have a Google :)

The objective of a kata is to solve it yourself and learn from the process. While Git & GitHub aren’t part of that process, you may find it interesting to submit your solutions in a PR to this repository. More info on that process is available [here](https://help.github.com/articles/fork-a-repo/).

Note: I don’t know whether the 12 days begin on Christmas Day or Boxing Day. If it’s Boxing Day - great; I knew that. If it’s Christmas Day, assume this is a joke about off by one errors or something witty like that.

## Kata 01

Write a program to determine whether a `word` is `even`; where

 - a `word` is an arbitrary length letter sequence using only a-z or A-Z
 - a `word` is `even` when the product of its letters’ integer values is even
 - a letter’s integer value is its index in the alphabet; so a=1, b=2 (A=1 too)

Your program should read in a word from standard input; and write out the string "true" if the word is even, or "false" otherwise.

Examples input -> output:

  - `aaa` -> `false`
  - `bbb` -> `true`

## Kata 02

All time and accounting of it is inherently evil. Dates are evil, clocks are evil and [time zones are especially evil](http://stackoverflow.com/questions/6841333/why-is-subtracting-these-two-times-in-1927-giving-a-strange-result/6841479#6841479).

Write a program which reads in an [ISO 8601 date](https://en.wikipedia.org/wiki/ISO_8601) - for example, 2014-12-25 - and prints out the US & UK variants, and spoken form including month.

It will be more rewarding to avoid your language’s inbuilt Date/Time utilities.

Examples input -> output:
 - `2014-12-25` ->
    US: 12/25/2014
    UK: 25/12/2014
    Spoken: 25th of December 2014
 - `2015-01-01` ->
    US: 01/01/2015
    UK: 01/01/2015
    Spoken: 1st of January 2015

## Kata 03

7 Segment Displays look like this, when all cells are switched on:

     —
    | |
     —
    | |
     —

Write a program which reads in two numbers, and shows which 7-segment cells are common between them.

Examples input -> output

 - `1 8` ->


      |

      |

- `2 5` ->


     —

     —

     —

## Kata 04

An IPv4 address is a 32 bit integer, often represented in “dot notation” where the number is divided into 4 8-bit segments written in base 10, separated by dots.

For example, the IP address `127.0.0.1` converts to `2130706433`:

    2130706433 == 11111111 00000000 00000000 00000001
                  \      / \      / \      / \      /
                    127   .    0   .    0   .   1

Write a program which converts IPv4 addresses between dot notation and base 10 numerical form.
