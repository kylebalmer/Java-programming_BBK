

def isprime(int num){
for (int i = 2; i < num; i++){
	if (num % i == 0 )
		return false;
	}
	return true;
	}

for (j=1; j<=1000; j++){
	//println j
	//println isprime(j)
	if (isprime(j) == true ){
		println j
	}
	
}

// was failing because of {} after if within for statement
// for(){ if() result of if } end for. no {} within {}