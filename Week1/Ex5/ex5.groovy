println "Please give me a first number: "
String s  = System.console().readLine()
int i = Integer.parseInt(s)

println "Please give me a second number: "
s = System.console().readLine()
int j = Integer.parseInt(s)

int c

x = i
//why cannot use c == j in for loop??
for (c = 1; c < j; c++){
	println "Count is: " + c
	i = i + x
	
}tou
println i

