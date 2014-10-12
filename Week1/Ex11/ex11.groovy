 // get first card
	// get first card number (1 - 13)
println "Get first card. 1-13 (11=Jack, 12=Queen, 13=King): "
String s = System.console().readLine()
int first_card_number = Integer.parseInt(s)
	// get first card suit (S, H, D, C)
println "Get first card suit. 1-13 (S = Spades, H = Hearts, D = Diamonds, C = Clubs): "
s = System.console().readLine()
String first_card_suit = s
println "Your first card is: " + first_card_number + first_card_suit
println " "

// get second card
// get second card number (1 - 13)
println "Get second card. 1-13 (11=Jack, 12=Queen, 13=King): "
s = System.console().readLine()
int second_card_number = Integer.parseInt(s)
// get second card suit (S, H, D, C)
println "Get second card suit. 1-13 (S = Spades, H = Hearts, D = Diamonds, C = Clubs): "
s = System.console().readLine()
String second_card_suit = s
println "Your second card is: " + second_card_number + second_card_suit
println " "
	
// get third card
// get third card number (1 - 13)
println "Get third card. 1-13 (11=Jack, 12=Queen, 13=King): "
s = System.console().readLine()
int third_card_number = Integer.parseInt(s)
// get third card suit (S, H, D, C)
println "Get third card suit. 1-13 (S = Spades, H = Hearts, D = Diamonds, C = Clubs): "
s = System.console().readLine()
String third_card_suit = s
println "Your first card is: " + third_card_number + third_card_suit
println " "
	
// get fourth card
// get fourth card number (1 - 13)
println "Get fourth card. 1-13 (11=Jack, 12=Queen, 13=King): "
s = System.console().readLine()
int fourth_card_number = Integer.parseInt(s)
// get fourth card suit (S, H, D, C)
println "Get fourth card suit. 1-13 (S = Spades, H = Hearts, D = Diamonds, C = Clubs): "
s = System.console().readLine()
String fourth_card_suit = s
println "Your fourth card is: " + fourth_card_number + fourth_card_suit
println " "	

// get fifth card
// get fifth card number (1 - 13)
println "Get fifth card. 1-13 (11=Jack, 12=Queen, 13=King): "
s = System.console().readLine()
int fifth_card_number = Integer.parseInt(s)
// get firth card suit (S, H, D, C)
println "Get fifth card suit. 1-13 (S = Spades, H = Hearts, D = Diamonds, C = Clubs): "
s = System.console().readLine()
String fifth_card_suit = s
println "Your fifth card is: " + fifth_card_number + fifth_card_suit
println " "	

// if matches criteria of straight flush
boolean allsamesuit = false
if (first_card_suit == second_card_suit && second_card_suit == third_card_suit && third_card_suit == fourth_card_suit && fourth_card_suit == fifth_card_suit){
	allsamesuit = true
	println "after loop samesuit: " + allsamesuit
}


//order cards
	int first_position, second_position, third_position, fourth_position, fifth_position
	if (first_card_number > second_card_number && first_card_number > third_card_number && first_card_number > fourth_card_number && first_card_number > fifth_card_number ){
		first_position = first_card_number
	}
	else if (second_card_number > first_card_number && second_card_number > third_card_number && second_card_number > fourth_card_number && second_card_number > fifth_card_number){
		first_position = second_card_number
	}
	else if (third_card_number > first_card_number && third_card_number > second_card_number && third_card_number > fourth_card_number && third_card_number > fifth_card_number){
		first_position = third_card_number
	}
	else if(fourth_card_number > first_card_number && fourth_card_number > second_card_number && fourth_card_number > third_card_number && fourth_card_number > fifth_card_number){
		first_position = fourth_card_number
	}
	else if(fifth_card_number > first_card_number && fifth_card_number > second_card_number && fifth_card_number > third_card_number && fifth_card_number > fourth_card_number){
		first_position = fifth_card_number
	}
	println "The highest card is: " + first_position
	

	//second position first card
	if (second_card_number > first_card_number && third_card_number < first_card_number && fourth_card_number < first_card_number && fifth_card_number < first_card_number){
		second_position = first_card_number
	}
	if (third_card_number > first_card_number && second_card_number < first_card_number && fourth_card_number < first_card_number && fifth_card_number < first_card_number){
		second_position = first_card_number
	}
	if (fourth_card_number > first_card_number && second_card_number < first_card_number && third_card_number< first_card_number && fifth_card_number < first_card_number){
		second_position = first_card_number
	}
	if (fifth_card_number > first_card_number && second_card_number < first_card_number && third_card_number < first_card_number && fourth_card_number < first_card_number){
		second_position = first_card_number
	}
	
	//second position second card
	if (first_card_number > second_card_number && third_card_number < second_card_number && fourth_card_number < second_card_number && fifth_card_number < second_card_number){
		second_position = second_card_number
	}
	if (third_card_number > second_card_number && first_card_number < second_card_number && fourth_card_number < second_card_number && fifth_card_number < second_card_number){
		second_position = second_card_number
	}
	if (fourth_card_number > second_card_number && first_card_number < second_card_number && third_card_number < second_card_number && fifth_card_number < second_card_number){
		second_position = second_card_number
	}
	if (fifth_card_number > second_card_number && first_card_number < second_card_number && third_card_number < second_card_number && fourth_card_number < second_card_number){
		second_position = second_card_number
	}

	// second position third card
	if (first_card_number > third_card_number && second_card_number < third_card_number && fourth_card_number < third_card_number && fifth_card_number < third_card_number){
		second_position = third_card_number
	}
	if (second_card_number > third_card_number && first_card_number < third_card_number && fourth_card_number < third_card_number && fifth_card_number < third_card_number){
		second_position = third_card_number
	}
	if (fourth_card_number > third_card_number && first_card_number < third_card_number && second_card_number < third_card_number && fifth_card_number < third_card_number){
		second_position = third_card_number
	}
	if (fifth_card_number > third_card_number && first_card_number < third_card_number && second_card_number < third_card_number && fourth_card_number < third_card_number){
		second_position = third_card_number
	}
	//second position fourth card
	if (first_card_number > fourth_card_number && second_card_number < fourth_card_number && third_card_number < fourth_card_number && fifth_card_number < fourth_card_number){
		second_position = fourth_card_number
	}
	if (second_card_number > fourth_card_number && first_card_number < fourth_card_number && third_card_number < fourth_card_number && fifth_card_number < fourth_card_number){
		second_position = fourth_card_number
	}
	if (third_card_number > fourth_card_number && first_card_number < fourth_card_number && second_card_number < fourth_card_number && fifth_card_number < fourth_card_number){
		second_position = fourth_card_number
	}
	if (fifth_card_number > fourth_card_number && first_card_number < fourth_card_number && second_card_number < fourth_card_number && third_card_number < fourth_card_number){
		second_position = fourth_card_number
	}
	//second position fifth card
	if (first_card_number > fifth_card_number && second_card_number < fifth_card_number && third_card_number < fifth_card_number && fourth_card_number < fifth_card_number){
		second_position = fifth_card_number
	}
	if (second_card_number > fifth_card_number && first_card_number < fifth_card_number && third_card_number < fifth_card_number && fourth_card_number < fifth_card_number){
		second_position = fifth_card_number
	}
	if (third_card_number > fifth_card_number && first_card_number < fifth_card_number && second_card_number < fifth_card_number && fourth_card_number < fifth_card_number){
		second_position = fifth_card_number
	}
	if (fourth_card_number > fifth_card_number && first_card_number < fifth_card_number && second_card_number < fifth_card_number && fourth_card_number < fifth_card_number){
		second_position = fifth_card_number
	}
	println "The (FINAL) second highest card is: " + second_position

	//fourth card (using 2nd card code with flipped symbols)
	//fourth position first card
	if (second_card_number < first_card_number && third_card_number > first_card_number && fourth_card_number > first_card_number && fifth_card_number > first_card_number){
		fourth_position = first_card_number
	}
	else if (third_card_number < first_card_number && second_card_number > first_card_number && fourth_card_number > first_card_number && fifth_card_number > first_card_number){
		fourth_position = first_card_number
	}
	else if (fourth_card_number < first_card_number && second_card_number > first_card_number && third_card_number > first_card_number && fifth_card_number  > first_card_number){
		fourth_position = first_card_number
	}
	else if (fifth_card_number < first_card_number && second_card_number > first_card_number && third_card_number > first_card_number && fourth_card_number > first_card_number){
		fourth_position = first_card_number
	}
	//fourth position second card
	if (first_card_number < second_card_number && third_card_number > second_card_number && fourth_card_number > second_card_number && fifth_card_number > second_card_number){
		fourth_position = second_card_number
	}
	else if (third_card_number < second_card_number && first_card_number > second_card_number && fourth_card_number > second_card_number && fifth_card_number > second_card_number){
		fourth_position = second_card_number
	}
	else if (fourth_card_number < second_card_number && first_card_number > second_card_number && third_card_number > second_card_number && fifth_card_number > second_card_number){
		fourth_position = second_card_number
	}
	else if (fifth_card_number < second_card_number && first_card_number > second_card_number && third_card_number > second_card_number && fourth_card_number > second_card_number){
		fourth_position = second_card_number
	}
	// fourth position third card
	if (first_card_number < third_card_number && first_card_number > third_card_number  && fourth_card_number > third_card_number && fifth_card_number > third_card_number){
		fourth_position = third_card_number
	}
	else if (second_card_number < third_card_number && first_card_number > third_card_number && fourth_card_number > third_card_number && fifth_card_number > third_card_number){
		fourth_position = third_card_number
	}
	else if (fourth_card_number < third_card_number && first_card_number > third_card_number && second_card_number > third_card_number && fifth_card_number > third_card_number){
		fourth_position = third_card_number
	}
	else if (fifth_card_number < third_card_number && first_card_number > third_card_number && second_card_number > third_card_number && fourth_card_number > third_card_number){
		fourth_position = third_card_number
	}
	//fourth position fourth card
	if (first_card_number < fourth_card_number && second_card_number > fourth_card_number && third_card_number > fourth_card_number && fifth_card_number > fourth_card_number){
		fourth_position = fourth_card_number
	}
	else if (second_card_number < fourth_card_number && first_card_number > fourth_card_number && third_card_number > fourth_card_number && fifth_card_number > fourth_card_number){
		fourth_position = fourth_card_number
	}
	else if (third_card_number < fourth_card_number && first_card_number > fourth_card_number && second_card_number > fourth_card_number && fifth_card_number > fourth_card_number){
		fourth_position = fourth_card_number
	}
	else if (fifth_card_number < fourth_card_number && first_card_number > fourth_card_number && second_card_number > fourth_card_number && fifth_card_number > fourth_card_number){
		fourth_position = fourth_card_number
	}
	//fourth position fifth card
	if (first_card_number < fifth_card_number && second_card_number > fifth_card_number && third_card_number > fifth_card_number && fourth_card_number > fifth_card_number){
		fourth_position = fifth_card_number
	}
	else if (second_card_number < fifth_card_number && first_card_number > fifth_card_number && third_card_number > fifth_card_number && fourth_card_number > fifth_card_number){
		fourth_position = fifth_card_number
	}
	else if (third_card_number < fifth_card_number && first_card_number > fifth_card_number && second_card_number > fifth_card_number && fourth_card_number > fifth_card_number){
		fourth_position = fifth_card_number
	}
	else if (fourth_card_number < fifth_card_number && first_card_number > fifth_card_number && second_card_number > fifth_card_number && fourth_card_number > fifth_card_number){
		fourth_position = fifth_card_number
	}
	println "The fourth highest card is: " + fourth_position

	
	//fifth position
	
	if (first_card_number < second_card_number && first_card_number < third_card_number && first_card_number < fourth_card_number && first_card_number < fifth_card_number ){
		fifth_position = first_card_number
	}
	else if (second_card_number < first_card_number && second_card_number < third_card_number && second_card_number < fourth_card_number && second_card_number < fifth_card_number){
		fifth_position = second_card_number
	}
	else if (third_card_number < first_card_number && third_card_number < second_card_number && third_card_number < fourth_card_number && third_card_number < fifth_card_number){
		fifth_position = third_card_number
	}
	else if(fourth_card_number < first_card_number && fourth_card_number < second_card_number && fourth_card_number < third_card_number && fourth_card_number < fifth_card_number){
		fifth_position = fourth_card_number
	}
	else if(fifth_card_number < first_card_number && fifth_card_number < second_card_number && fifth_card_number < third_card_number && fifth_card_number < fourth_card_number){
		fifth_position = fifth_card_number
	}

	println "The lowest card is: " + fifth_position

	//third card = one left
	if (first_card_number != first_position && first_card_number != second_position && first_card_number != fourth_position && first_card_number != fifth_position){
		third_position = first_card_number
	}
	if (second_card_number != first_position && second_card_number != second_position && second_card_number != fourth_position && second_card_number != fifth_position){
		third_position = second_card_number
	}
	if (third_card_number != first_position && third_card_number != second_position && third_card_number != fourth_position && third_card_number != fifth_position){
		third_position = third_card_number
	}
	if (fourth_card_number != first_position && fourth_card_number != second_position && fourth_card_number != third_position && fourth_card_number != fifth_position){
		third_position = fourth_card_number
	}
	if (fifth_card_number != first_position && fourth_card_number != second_position && fourth_card_number != third_position && fourth_card_number != fifth_position){
		third_position = fifth_card_number
	}
	//else {third_position = fifth_card_number}
	println "The third highest card is: " + third_position

boolean straight_flush
if (fourth_position == fifth_position + 1 && third_position == fourth_position + 1 && second_position == third_position + 1 && first_position == second_position + 1 && allsamesuit == true){
		straight_flush = true
		println "Straight Flush!"
}
		

// else if criteria of poker
	// if four have same rank (alter above samesuit check)
boolean foursamesuit = false
boolean poker = false
if (allsamesuit == true){foursamesuit = true }
if  (first_card_suit == second_card_suit && second_card_suit == third_card_suit && third_card_suit == fourth_card_suit){
	foursamesuit = true
}
if  (first_card_suit == second_card_suit && second_card_suit == third_card_suit && third_card_suit == fifth_card_suit){
	foursamesuit = true
}
if  (first_card_suit == second_card_suit && second_card_suit == fourth_card_suit && fourth_card_suit == fifth_card_suit){
	foursamesuit = true
}
if  (first_card_suit == third_card_suit && third_card_suit == fourth_card_suit && fourth_card_suit == fifth_card_suit){
	foursamesuit = true
}
if  (second_card_suit == third_card_suit && third_card_suit == fourth_card_suit && fourth_card_suit == fifth_card_suit){
	foursamesuit = true
}
if (foursamesuit == true){
	poker = true
	println "Poker"
}

// else if full house
	// three of a kind + two of a kind
	// 123, 124, 125, 134, 135, 145, 234, 235, 245, 345 
	boolean threeofakind 
	if (first_card_number == second_card_number && second_card_number == third_card_number){
		threeofakind = true
	}
	else if (first_card_number == second_card_number && second_card_number == fourth_card_number){
		threeofakind = true
	}
	else if (first_card_number == second_card_number && second_card_number == fifth_card_number){
		threeofakind = true
	}
	else if (first_card_number == third_card_number && third_card_number == fourth_card_number){
		threeofakind = true
	}
	else if (first_card_number == third_card_number && third_card_number == fifth_card_number){
		threeofakind = true
	}
	else if (first_card_number == fourth_card_number && fourth_card_number == fifth_card_number){
		threeofakind = true
	}
	else if (second_card_number == third_card_number && third_card_number == fourth_card_number){
		threeofakind = true
	}
	else if (second_card_number == third_card_number && third_card_number == fifth_card_number){
		threeofakind = true
	}
	else if (second_card_number == fourth_card_number && fourth_card_number == fifth_card_number){
		threeofakind = true
	}
	else if (third_card_number == fourth_card_number && fourth_card_number == fifth_card_number){
		threeofakind = true
	}
	if (threeofakind == true){
		println "Three of a Kind!"
	}
// two of a kind : 12, 13, 14, 15, 23, 24, 25, 34, 35, 45 
	boolean twoofakind
	if (first_card_number == second_card_number){
		twoofakind = true
	}
	else if (first_card_number == third_card_number){
		twoofakind = true
	}
	else if (first_card_number == fourth_card_number){
		twoofakind = true
	}
	else if (first_card_number == fifth_card_number){
		twoofakind = true
	}
	else if (second_card_number == third_card_number){
		twoofakind = true
	}
	else if (second_card_number == fourth_card_number){
		twoofakind = true
	}
	else if (second_card_number == fifth_card_number){
		twoofakind = true
	}
	else if (third_card_number == fourth_card_number){
		twoofakind = true
	}
	else if (third_card_number == fifth_card_number){
		twoofakind = true
	}
	else if (fourth_card_number == fifth_card_number){
		twoofakind = true
	}
boolean fullhouse = false
	if (threeofakind && twoofakind == true){
		fullhouse = true
		println "Full house!"
	}

//else flush
boolean flush = false
if (allsamesuit == true){
	flush = true
}

// else if straight
boolean straight = false
if (fourth_position == fifth_position + 1 && third_position == fourth_position + 1 && second_position == third_position + 1 && first_position == second_position + 1){
		straight = true
		println "Straight"
}
		

// else if three of a kind
	// existing boolean for threeofakind

if (threeofakind == true){
	println "Three of a kind"
}


// else if pairs
boolean pair1, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10
	if (first_card_number == second_card_number){
		pair1 = true
	}
	if (first_card_number == third_card_number){
		pair2 = true
	}
	if (first_card_number == fourth_card_number){
		pair3 = true
	}
	if (first_card_number == fifth_card_number){
		pair4 = true
	}
	if (second_card_number == third_card_number){
		pair5 = true
	}
	if (second_card_number == fourth_card_number){
		pair6 = true
	}
	if (second_card_number == fifth_card_number){
		pair7 = true
	}
	if (third_card_number == fourth_card_number){
		pair8 = true
	}
	if (third_card_number == fifth_card_number){
		pair9 = true
	}
	if (fourth_card_number == fifth_card_number){
		pair10 = true
	}
// check for pair
boolean pair
if (pair1 == true || pair2 == true || pair3 == true || pair4 == true || pair5 == true || pair6 == true || pair7 == true || pair8 == true || pair9 ==true || pair10 == true){
		pair = true
		println "At least one pair!"
	}

// else if two pair  (45 combinations...go!)
	boolean twopairs
	if (pair1 && pair2 == true ){
		twopairs = true
	}	
	else if(pair1 && pair3 == true){
		twopairs = true
	}
	else if(pair1 && pair4 == true){
		twopairs = true
	}
	else if(pair1 && pair5 == true){
		twopairs = true
	}
	else if(pair1 && pair6 == true){
		twopairs = true
	}
	else if(pair1 && pair7 == true){
		twopairs = true
	}
	else if(pair1 && pair8 == true){
		twopairs = true
	}
	else if(pair1 && pair9 == true){
		twopairs = true
	}
	else if(pair1 && pair10 == true){
		twopairs = true
	}
	else if(pair2 && pair3 == true){
		twopairs = true
	}
	else if(pair2 && pair4 == true){
		twopairs = true
	}
	else if(pair2 && pair5 == true){
		twopairs = true
	}
	else if(pair2 && pair6 == true){
		twopairs = true
	}
	else if(pair2 && pair7 == true){
		twopairs = true
	}
	else if(pair2 && pair8 == true){
		twopairs = true
	}
	else if(pair2 && pair9 == true){
		twopairs = true
	}
	else if(pair2 && pair10 == true){
		twopairs = true
	}
	else if(pair3 && pair4 == true){
		twopairs = true
	}
	else if(pair3 && pair5 == true){
		twopairs = true
	}
	else if(pair3 && pair6 == true){
		twopairs = true
	}
	else if(pair3 && pair7 == true){
		twopairs = true
	}
	else if(pair3 && pair8 == true){
		twopairs = true
	}
	else if(pair3 && pair9 == true){
		twopairs = true
	}
	else if(pair3 && pair10 == true){
		twopairs = true
	}
	else if(pair4 && pair5 == true){
		twopairs = true
	}
	else if(pair4 && pair6 == true){
		twopairs = true
	}
	else if(pair4 && pair7 == true){
		twopairs = true
	}
	else if(pair4 && pair8 == true){
		twopairs = true
	}
	else if(pair4 && pair9 == true){
		twopairs = true
	}
	else if(pair4 && pair10 == true){
		twopairs = true
	}
	else if(pair5 && pair6 == true){
		twopairs = true
	}
	else if(pair5 && pair7 == true){
		twopairs = true
	}
	else if(pair5 && pair8 == true){
		twopairs = true
	}
	else if(pair5 && pair9 == true){
		twopairs = true
	}
	else if(pair5 && pair10 == true){
		twopairs = true
	}
	else if(pair6 && pair7 == true){
		twopairs = true
	}
	else if(pair6 && pair8 == true){
		twopairs = true
	}
	else if(pair6 && pair9 == true){
		twopairs = true
	}
	else if(pair6 && pair10 == true){
		twopairs = true
	}
	else if(pair7 && pair8 == true){
		twopairs = true
	}
	else if(pair7 && pair9 == true){
		twopairs = true
	}
	else if(pair7 && pair10 == true){
		twopairs = true
	}
	else if(pair8 && pair9 == true){
		twopairs = true
	}
	else if(pair8 && pair10 == true){
		twopairs = true
	}
	else if(pair9 && pair10 == true){
		twopairs = true
	}
	if (twopairs == true){
		println "Two Pairs!"
	}

// else nothing
//run through all resuslts booleans in if/else if/else nothing
	if (straight_flush == true){
		println "Result: Straight Flush"
	}
	else if (poker == true){
		println "Result: Poker"
	}
	else if (fullhouse == true){
		println "Result: Full House"
	}
	else if (flush == true){
		println "Result: Flush"
	}
	else if (straight == true){
		println "Result: Straight"
	}
	else if (threeofakind == true){
		println "Result: Three of a Kind"
	}
	else if (twopairs == true){
		println "Result: Two Pairs"
	}
	else if (pair == true){
		println "Result: Pair"
	}
	else { 
		println "Result: Nada"
	}

