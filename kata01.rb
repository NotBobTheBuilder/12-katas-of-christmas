letter_map = *"a".."z"
letter_map.unshift "0"
word       = STDIN.gets.chomp.downcase
count      = word.split(//).inject(0) do |memo, char|
  memo + letter_map.index(char)
end
puts count.even?
