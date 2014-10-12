
// ask for first number, set to previous
println "Please give me your first number: "
String s = System.console().readLine()
int previous_num  = Integer.parseInt(s)
int new_num

//set boolean as true
boolean increasing = true 


//while num != -1
while (previous_num != -1){
	println "Please give me your next number: "
	s = System.console().readLine()
	new_num = Integer.parseInt(s)

	if (new_num == -1){break}
	else if (new_num > previous_num){
		previous_num = new_num
	}
	else{ increasing = false
		previous_num = new_num
	}
}
	
println increasing	


//return boolean