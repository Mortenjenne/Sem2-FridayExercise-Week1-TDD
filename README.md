# Simple Calculator

Et simpelt Java-projekt med en lommeregner, bygget med Test-Driven Development (TDD).

## Funktioner:
* `add(int a, int b)` - Læg to tal sammen
* `add(String numbers)` - Læg kommaseparerede tal sammen
* `add(int[] numbers)` - Læg array af tal sammen  
* `subtract(int a, int b)` - Træk det ene tal fra det andet
* `multiply(int a, int b)` - Gang to tal
* `divide(int a, int b)` - Divider to tal (fejl ved division med nul)

Testene er skrevet med JUnit og dækker alle metoder.

## Sådan bruges:
1. Klon projektet
2. Åbn i din Java IDE
3. Kør testene for at se om alt virker

## Git Status og Log

**Current Status**

On branch main
Your branch is up to date with 'origin/main'.
nothing to commit, working tree clean

**Commit Historie**

4cda164 (HEAD -> main, origin/main) Update README.md
218b931 (origin/feature-addIntArray, feature-addIntArray, developer) Overloaded add() with taking an int array as argument, all test passed
0dce81d Added test for adding an a array of integers in add()
4e206dc (origin/feature-AddString, feature-AddString) Overloaded add method with String as argument, all test passes
aba79d9 Added test for Addition of String
8144985 Update README.md
8647fd1 Added a README
e55ff50 (origin/feature-divide, feature-divide) Added divide method, All test passes
4144776 Test passes for divide method, with returning 5
7c7f666 Added test for divide method
e75d513 (origin/feature-multiply, feature-multiply) Added multiply method in Calculator and test passes
779fc56 Added test for multiply method
62d5fab (origin/feature-subtract, feature-subtract) Added method for subtracting and all tests passed
d41bcef Added test for subtract method
162fea5 (origin/feature-add, feature-add) Fixed expected and actual i test
402ae1a add method in Calculator completed and test passed
09d572f Add test first test passed
