# Regex notes

- . (dot) -> it matches any character, except a new line
- \d -> matches any digit [0-9]
- \D -> any character that is not a digit [^0-9]
- \s -> matches any whitespace character [ \r\n\t\f ]
- \S -> matches any non-white space character
- \w -> will match any word character (a-z, A-Z and 0-9) and underscores (_)
- \W -> matches any non-word character
- ^ -> matches the position at the start
- $ -> matches the position at the end
- () -> parentheses are grouping
- [] -> matches only one of several characters placed inside the square brackets
- [^] -> matches any character that is not in the square brackets
- {x} -> matches x repetitions of character in the group
- {x,y} -> matches between x and y repetitions of characters in the group
- * -> zero or more repetition
- &plus; -> matches one or more repetition
