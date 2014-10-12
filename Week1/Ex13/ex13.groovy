boolean prime
int num
int i

boolean checkprime(num){
	if (i % 2 == 0) {prime = false}

	for (i = 3; i < num; i = i + 2){
	
		if (num % i == 0){
			prime = false
		}
		else {prime = true}

	}
} 
println checkprime (7)
println checkprime (8)
println checkprime (9)
println checkprime (10)
println checkprime (11)
println checkprime (12)


'''
for (num = 1; num <= 1000; num++){
	if (num == 1 || num ==2){ println num}
	else if (checkprime(num) == true){
		println num
	}
}
'''