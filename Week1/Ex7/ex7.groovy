println "First number: "
String s = System.console().readLine()
int x = Integer.parseInt(s)
println "Second number: "
s = System.console().readLine()
int y = Integer.parseInt(s)
println "Third number: "
s = System.console().readLine()
int z = Integer.parseInt(s)

int high, mid, low


if (x > y && x > z){
	high =x
	if (y > z){
		mid = y
		low =z
	}
	else if (z > y){
		mid = z
		low = y
	}
}

else if (y > x && y > z){
	high = y
	if (x > z){
		mid = x
		low = y
	}
	else if (z > x){
		mid = z
		low = x
	}
}

else if (z > x && z > y){
	high = z
	if (x > y){
		mid = x
		low = y
	}
	else if (y > x){
		mid = y
		low = x
	}
}
println high
println mid
println low