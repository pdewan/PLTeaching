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
      
fun tracingFactorialWrong number =
    (
	    print ("Number:"^(Int.toString number)^"\n");
	    if number <= 1 then
	      (
	      	1;
	      	print "Factorial:1\n" 
	      	
	      )
	    else  	
	      print ("Factorial:" ^ Int.toString (tracingFactorialWrong (number-1) * number^"\n"))	      
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
val PI = ("PI", 3.14);
fun father ("John", "Joe")  = true |
     father("Joe", "Jack") = true |
     father("Mary", "Jack") = true |
     father("Alice", "Bob") = true |
     father (child, father) = false;
      		 
fun grandfather ("John", "Joe")  = true;
val i = 5;
val j = i + 5;
val s = "5";
(*
val t = s + 5;
*)

val PI = "3.14";
(*
val doublePI = PI*2;
*)

val structure_1 = [3.14, 2.54];
val structure_2 = (3.14, 2.54);
val structure_3 = ("PI", 3.14);
val structure_4 = ["PI", 3.14];

val square1 = fn x => x*x;
val square2 = square1;

fun sum (x, y) = x + y;
val sum = fn (x, y) => x + y;
val x = 4;
val addToX = fn y => x + y;
val x = 5;
val subtractFromX = fn y => x - y;
subtractFromX 2;
val addToX = fn (y, z) => x + y + z;
fun  father2 (child, father) = false |
		 father2 ("John", "Joe")  = true |
     father2("Joe", "Jack") = true |
     father2("Mary", "Jack") = true |
     father2("Alice", "Bob") = true;
     

val realSquare = fn x => x*1.0*x;