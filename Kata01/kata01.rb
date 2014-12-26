puts gets.chomp.upcase.chars.map { |x| x.ord - 64 } .reduce(:*).even?
