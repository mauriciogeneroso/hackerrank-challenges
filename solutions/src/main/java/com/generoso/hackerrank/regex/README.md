# Regex notes

Characters:
- . (dot) -> it matches any character, except a new line
- \d -> matches any digit [0-9]
- \D -> any character that is not a digit [^0-9]
- \s -> matches any whitespace character [ \r\n\t\f ]
- \S -> matches any non-white space character
- \w -> will match any word character (a-z, A-Z and 0-9) and underscores (_)
- \W -> matches any non-word character

Start and end:
- ^ -> matches the position at the start
- $ -> matches the position at the end

Character class:
- [] -> matches only one of several characters placed inside the square brackets
- [^] -> matches any character that is not in the square brackets
- [a-z] -> lowercase letters
- [A-Z] -> uppercase letters
- [0-9] -> digits

Repetitions:
- {x} -> matches x repetitions of character in the group
- {x,y} -> matches between x and y repetitions of characters in the group
- * -> zero or more repetition
- &plus; -> matches one or more repetition
- ? -> matches zero or one 

Grouping and Capturing
- () -> parentheses are grouping a sequence
- | -> alternative
- \b -> assert position at a word boundary
   - Before the first character: if the first character is a word character
   - Between two characters: where one is a word character and the other is not a word character
   - After the last character: if the last character is a word character
   - https://www.freecodecamp.org/news/what-does-b-in-regex-mean-word-boundary-and-non-word-boundary-metacharacters/

Back references:
- \group_number: matches the same text as previously matched by the capturing group
- (?|regex) -> reset group (Branch reset group is supported by Perl, PHP, Delphi and R)
- Forward reference: Forward reference creates a back reference to a regex that would appear later.
     - https://www.regular-expressions.info/backref2.html#forward

Assertions:
- regex_1(?=regex2) -> the positive lookahead (?=) asserts regex_1 to be immediately followed by regex_2.
     - The lookahead is excluded from the match string
- regex_1(?!regex2) -> negative lookahead, the opposite from positive lookahead
- (?<=regex_2)regex_1 -> positive lookbehind asserts regex_1 to be immediately proceeded by regex_1
     - The lookbehind is excluded from the match string
- (?<!regex_2)regex_1 -> negative lookbehind, the opposite from positive lookbehind