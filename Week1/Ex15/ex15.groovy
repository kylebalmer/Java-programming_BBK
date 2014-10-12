// generate a number "randomly"

import java.util.Random
Random rand = new Random()
int rand_num = rand.nextInt(101)

println rand
println rand_num
println "I'm thinking of a number between 1 and 100."

int count = 1
boolean correct = false
//ask for user input (loop)
while (correct == false){
println "Try to guess my number! >"
s = System.console().readLine()
int guess = Integer.parseInt(s)

if (guess > rand_num){
	println "No. My number is lower."
	count = count + 1 
}
else if (guess < rand_num){
	println "No. My number is higher."
	count = count +1
}
else if (guess == rand_num){
	println "Correct! That's the right number"
	println "You took " + count + " guesses to get my number. Good job."
	correct = true
}
}

