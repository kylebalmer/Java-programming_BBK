
//create a list of prime numbers

//function to check if prime
def isprime(int num){
for (int i = 2; i < num; i++){
	if (num % i == 0 )
		return false;
	}
	return true;
	}

//run through numbers and add primes to list
def prime_list = []

for (j=1; j<=100; j++){
	//println j
	//println isprime(j)
	if (isprime(j) == true ){
		prime_list.add(j)
	}
	
}
// take user input 
println "Please give me a number: "
int user_number = Integer.parseInt(System.console().readLine())

// create a list of differences from user's number
def diff_list = []
for (i in prime_list){
	int diff = (i - user_number).abs()
	diff_list.add(diff)
	println diff_list
}

for (i in diff_list){
}

//take a number
// compare to a list of known primes
// find the smallest difference
// link the smallest difference to the prime 
// give the distance between the prime and the given number

	


