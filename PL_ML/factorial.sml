fun factorial n =
    if n <= 1 then
      1
    else
      factorial (n-1) * n;
fun factorial2 1 = 1 |
     factorial2 n = factorial2 (n-1) * n;
val rec factorial3 = fn n =>
	 if n <= 1 then
      1
    else
      factorial3 (n-1) * n;
      
val rec factorial4 = 
		fn 
				1 => 1 |
				n => factorial4 (n-1) * n;
				
fun tracingFactorial number =
    (
	    print ("Number:"^(Int.toString number)^"\n");
	    if number <= 1 then
	      (
	      	print "Factorial:1\n"; 
	      	1
	      )
	    else    
	      let 
	         val aFactorial = tracingFactorial (number-1) * number
	      in 
	      	 (
	      	 	print ("Factorial:" ^ Int.toString aFactorial^"\n");
	      	 	aFactorial
	      	 )
	      end
      );
(*
 father("John", "Joe").
father("Joe", "Jack").
father("Mary", "Jack").
father("Alice", "Bob"). 
*)   
val JOE = "Joe";
val JACK = "Jack";

fun isJack person = person = JACK;
(*
fun  father ("John", JOE)  = true |
     father(JOE, JACK) = true |
     father("Mary", JACK) = true |
     father("Alice", "Bob") = true |
     father (child, father) = false;
*)

fun squareAndCube number = (number*number, number*number*number);

fun squareAndCube number = 
		let 
			val aSquare = number*number
			val aCube = aSquare*number
		in 
			(aSquare, aCube)
		end
     
fun father ("John", "Joe")  = true |
     father("Joe", "Jack") = true |
     father("Mary", "Jack") = true |
     father("Alice", "Bob") = true |
     father (child, father) = false;
      		 
