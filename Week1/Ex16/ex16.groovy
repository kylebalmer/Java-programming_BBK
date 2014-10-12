boolean still_in_play = true
p1_score = 0
p2_score = 0 
// while loop first to three
while (still_in_play == true){ 


	println "Please give me the results of the RPS game: "
	input = System.console().readLine()
	p1 = input.substring(0,1)
	println "Player one chose: " + input.substring(0,1)
	p2 = input.substring(1) 
	println "Player two chose: " + input.substring(1)

	// DRAW STATES
	if (p1 == "p" && p2 == "p"){
		println "A draw! Play again!" 
	}
	else if (p1 == "r" && p2 == "r"){
		println "A draw! Play again!" 
	}
	else if (p1 == "s" && p2 == "s"){
		println "A draw! Play again!" 
	}
	// P1 WIN STATES
	else if (p1 == "p" && p2 == "r"){
		println "Player 1 Wins!" 
		p1_score = p1_score + 1 
	}
	else if (p1 == "r" && p2 == "s"){
		println "Player 1 Wins!" 
		p1_score = p1_score + 1 
	}
	else if (p1 == "s" && p2 == "p"){
		println "Player 1 Wins!" 
		p1_score = p1_score + 1 
	}

	//P2 WIN STATES
	else if (p1 == "r" && p2 == "p"){
		println "Player 2 Wins!" 
		p2_score = p2_score + 1 
	}
	else if (p1 == "s" && p2 == "r"){
		println "Player 2 Wins!" 
		p2_score = p2_score + 1 
	}
	else if (p1 == "p" && p2 == "s"){
		println "Player 2 Wins!"
		p2_score = p2_score + 1  
	}


	if (p1_score == p2_score + 3){
		still_in_play = false
		println "Player 1 Victory"

	}
	if (p2_score == p1_score + 3){
		still_in_play = false
		println "Player 2 Victory"
	}
}//closing while loop
println "Final score: "
println "Player 1: " + p1_score
println "Player 2: " +p2_score