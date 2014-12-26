class DateFormatter
  MONTH_NAMES = %W{nil January February March April May June July August September October November December}

  def initialize(input_date)
    @year, @month, @day = input_date.split("-").map(&:to_i)
  end

  attr_reader :month, :day, :year

  def print_us
    print sprintf "US: %02<month>d/%02<day>d/%04<year>d ", {month: month, day: day, year: year}
  end

  def print_uk
    print sprintf "UK: %02<day>d/%02<month>d/%04<year>d ", {month: month, day: day, year: year}
  end

  def print_spoken
    print "Spoken: #{day}#{ordinal} of #{month_names} #{year} "
  end

  def print_all
    print_us
    print_uk
    print_spoken
  end

  private
  def ordinal
    case true
    when [1,21,31].include?(day)
      "st"
    when [2,22].include?(day)
      "nd"
    when [3,23].include?(day)
      "rd"
    else
      "th"
    end
  end

  def month_names
    MONTH_NAMES[month]
  end
end

DateFormatter.new(gets.chomp).print_all
