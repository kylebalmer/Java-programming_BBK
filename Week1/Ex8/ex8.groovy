println "Please enter your first number: "
String s = System.console().readLine()
int highest = Integer.parseInt(s)
int new_number

while (new_number != -1){
	println "Enter your next number: "
	s = System.console().readLine()
	new_number = Integer.parseInt(s)

	if (new_number > highest){
		highest = new_number
	}
}

println "Your highest number was: " + highest


//if number entered is too large NumberFormatExeception 
// int type too small?