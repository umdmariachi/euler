/*The Fibonacci sequence is defined by the recurrence relation:

    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

Hence the first 12 terms will be:

    F1 = 1
    F2 = 1
    F3 = 2
    F4 = 3
    F5 = 5
    F6 = 8
    F7 = 13
    F8 = 21
    F9 = 34
    F10 = 55
    F11 = 89
    F12 = 144

The 12th term, F12, is the first term to contain three digits.

What is the first term in the Fibonacci sequence to contain 1000 digits?*/

def prob025(){
	term = 2
	BigInteger a = 1
	BigInteger b = 1
	BigInteger c = 2
	while (b.toString().length()<1000){
		c = a + b
		a = b
		b = c
		term++
	}
	println b
	println "Term is $term"
	term
}