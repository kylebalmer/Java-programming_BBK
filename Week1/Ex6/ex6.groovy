println "Please give me your first number: "
String s = System.console().readLine()
int x = Integer.parseInt(s)

println "Please give me your second number: "
s = System.console().readLine()
int y = Integer.parseInt(s)

int c

if (x % y == 0 ){
	while (x != 0){
		x = x - y
		println "X has been decreased by " + y + " and is at a value of " + x
		c = c + 1 
		println "Count is: " + c
		

	}
	println "Your second number divides into your first number " + c + " times."

}
else println "Not divisible"