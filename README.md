# count-words-in-matrix

Takes a matrix of characters and a word, and returns the number of
times that word appears in the matrix. The word may appear left-to-right,
right-to-left, top-to-bottom, or bottom-to-top.

### Example
* A O T D L R O W   
* L C B M U M L U   
* D R U J D B L J   
* P A Z H Z Z E F   
* B C Z E L F H W   
* R K U L V P P G   
* A L B L P O P Q   
* B E M O P P J Y

### Clojure Test Cases
* (is (= 2 (count-words-in-matrix mat &quot;HELLO&quot;)))
* (is (= 1 (count-words-in-matrix mat &quot;WORLD&quot;)))
* (is (= 2 (count-words-in-matrix mat &quot;BUZZ&quot;)))
* (is (= 0 (count-words-in-matrix mat &quot;CLOJURE&quot;)))
* (is (= 0 (count-words-in-matrix mat &quot;COWABUNGA&quot;)))

## Usage

Using "lein run" will run the test cases.

## License

Copyright © 2020 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
