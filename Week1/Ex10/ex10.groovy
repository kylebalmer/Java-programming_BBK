'''Modify your former program so that it outputs ”Yes” when the numbers are consecutive, regardless of whether they go up or down. For example, both ”2,3,4,5,6,-1” and ”10,9,8,7,-1” should now result in ”Yes”.
'''


// ask for first number, set to previous
println "Please give me your first number: "
String s = System.console().readLine()
int previous_num  = Integer.parseInt(s)

int new_num
println "Please give me your next number: "
s = System.console().readLine()
new_num = Integer.parseInt(s)


String direction = " " 

if (new_num > previous_num){
	direction = "up"
}
else if (new_num < previous_num){
	direction = "down"
}

boolean consecutive = true 

if (direction == "up"){
	while (previous_num != -1){
		println "Please give me your next number: "
		s = System.console().readLine()
		new_num = Integer.parseInt(s)

		if (new_num == -1){break}
		else if (new_num > previous_num){
			previous_num = new_num
		}
		else{ consecutive = false
			previous_num = new_num
		}
}
}
else if (direction == "down"){
	while (previous_num != -1){
		println "Please give me your next number: "
		s = System.console().readLine()
		new_num = Integer.parseInt(s)

		if (new_num == -1){break}
		else if (new_num < previous_num){
			previous_num = new_num
		}
		else{ consecutive = false
			previous_num = new_num
		}
}
}

println consecutive 	
