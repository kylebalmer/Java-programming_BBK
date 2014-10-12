//get a  number to act as final
println "Please enter an end-point number: "
String s = System.console().readLine()

int end_num = Integer.parseInt(s)
println "End number = " + end_num

int i = 0
String string_i 

while ( i <= end_num){
	string_i = Integer.toString(i)
	println string_i * i
	i = i + 1
}
println "\\ldots"
