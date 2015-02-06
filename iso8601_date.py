# -*- coding: utf-8 -*-
# Program which reads in an ISO 8601 date - for example, 2014-12-25 - and prints out the US & UK variants, and spoken form including month.
import sys

def readStdIn():
	return sys.stdin.readline().lower().strip()
def err():
	print "Input is not consistent with ISO 8601 date format."
	print "Please use YYYY-MM-DD or YYYYMMDD"
	#quit()
def isDay( str ):
	if len(str) == 2 and str.isdigit() and int(str) >= 1 and int(str) <= 31:
		return True
	else:
		return False
def isMonth( str ):
	if len(str) == 2 and str.isdigit() and int(str) >= 1 and int(str) <= 12:
		return True
	else:
		return False
def isYear( str ):
	if len(str) == 4 and str.isdigit() and int(str) >= 1582 and int(str) <= 9999:
		return True
	else:
		return False
def getSpokenMonth( str ):
	months = ['', 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']
	return months[int(str)]
def getSpokenDay( day ):
	if day[0] == '0':
		day = day[1]
	n = int(day)
	return day + ("th" if 4<=n%100<=20 else {1:"st",2:"nd",3:"rd"}.get(n%10, "th"))

input = readStdIn() #Read from stdin, cast to lowercase, remove newline character.
while input:
	if len(input) == 10:
		date_parts = input.split('-')
		if len(date_parts) == 3:
			year = date_parts[0]
			month = date_parts[1]
			day = date_parts[2]
			if isYear( year ) and isMonth( month ) and isDay( day ):
				print "US: " + month + "/" + day + "/" + year,
				print "UK: " + day + "/" + month + "/" + year,
				print "Spoken: " + getSpokenDay( day ) + " of " + getSpokenMonth( month ) + " " + year
			else: #If parts do not fit year, date month requirements.
				err()
			
		else: #If there are not three date components.
			err()		
	else: #If thr input is not the expected length.
		err()
	input = readStdIn();
