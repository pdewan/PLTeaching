val TOTAL_FINAL_CUTOFFS = [
   (40, 80),
   (80, 50),
   (60, 60),
   (50, 70) 
 ];
 
 
fun printTotalFinalCutoff (total, final) =
	print ("Total = "^Int.toString total^" Final = "^Int.toString final^"\n");
 
fun   
   printTotalGreaterThanFinalCutoffs (nil) = () |
   printTotalGreaterThanFinalCutoffs ((total, final)::tailOfCutoffs) =
     (
     		if (total > final) then       
           printTotalFinalCutoff(total, final)        
     		else
     	  	();
     	  printTotalGreaterThanFinalCutoffs(tailOfCutoffs)
     )
     
 fun   
   printFinalGreaterThanTotalCutoffs (nil) = () |
   printFinalGreaterThanTotalCutoffs ((total, final)::tailOfCutoffs) =
     (
     		if (total < final) then       
           printTotalFinalCutoff(total, final)        
     		else
     	  	();
     	  printFinalGreaterThanTotalCutoffs(tailOfCutoffs)
     )
	fun foo (true, nil) = () | foo (false, nil) = () | 
	
			foo (a, (h::t)) = print("1");
   
  fun   
   printTotalGreaterThanFinalOrFinalGreaterThanTotalCutoffs (true, nil) = () |
   printTotalGreaterThanFinalOrFinalGreaterThanTotalCutoffs (false, nil) = () |
   printTotalGreaterThanFinalOrFinalGreaterThanTotalCutoffs (totalGreaterThanFinal, ((total, final)::tailOfCutoffs)) =
    
     (
     		if (
     		  (totalGreaterThanFinal andalso (total > final)) 
     			orelse (not totalGreaterThanFinal andalso (total < final)))  then       
             printTotalFinalCutoff(total, final)        
     		else
     	  	  ();
     	  printTotalGreaterThanFinalOrFinalGreaterThanTotalCutoffs(totalGreaterThanFinal, tailOfCutoffs)
     );
fun printSelectedCutoffs (_, nil) = ()  |
		printSelectedCutoffs (cutoffSelector, ((total, final)::tailOfCutoffs)) =
		(
		  if (cutoffSelector (total, final)) then
		 	  printTotalFinalCutoff(total, final)
		  else
     	  ();
		  printSelectedCutoffs(cutoffSelector, tailOfCutoffs)
		)
fun totalGreaterThanFinal (total, final) = total > final;
fun finalGreaterThanTotal (total, final) = final > total;		
(*     	  
append([], ListToAppended, ListToAppended).
append([H|T], ListToAppended, [H|AppendedTail]) :- append(T, ListToAppended, AppendedTail). 
*)

fun 
   append (nil, listToAppend) = listToAppend |
   append ((head::tail), listToAppend) = (head::append(tail, listToAppend));
(*	    
reverse([], []).
reverse([H|T], ReversedList) :- reverse(T, ReversedTail), append(ReversedTail, [H], ReversedList).
*)

fun
	reverse nil = nil |
	reverse (head::tail) = 
				append(reverse(tail), [head]);

val times = fn x => fn y => x*y;
fun times2 x y = x*y;
val twice = fn x => 2*x;
val triple = fn x => 2*x;

val times3 = fn (x, y) => x*y;
fun times4 (x, y) = x*y; 

fun product a b c = a*b*c;

fun plus(x, y) = x + y;


fun toTwoArgumentCurryableFunction tupleBasedTwoArgumentFunction a b = tupleBasedTwoArgumentFunction (a, b);
fun tupleBasedTimes (x, y) = x*y;
fun tupleBasedPlus (x, y) = x+y;
val curryableTimes = toTwoArgumentCurryableFunction tupleBasedTimes;
val curryablePlus = toTwoArgumentCurryableFunction tupleBasedPlus;
val curriedSuccessor = curryablePlus 1;
val curriedThrice = curryableTimes 3;

fun compose (function1, function2) x = function1 (function2 x);
val successorOfThrice = compose (curriedSuccessor, curriedThrice);

fun swap (x, y) = (y, x);

fun reverseNoPattern listToBeReversed =
   if (null listToBeReversed) then
       nil
   else 
      append(reverseNoPattern(tl listToBeReversed), [hd listToBeReversed])
  
  fun composeIntCalls function = (function 1, function 2);  
 
 fun makeList x = [x];
 fun identity x = x;
 (*
 fun composeIntAndBooleanCalls function = (function 1, function true); 
 *) 
(*
val composeIntAndBooleanCalls = 
    let val function = identity in (function 1, function true) end;
    *)
    
 val composeIntAndBooleanCalls = let val identity = fn x=>x in (identity 1, identity true) end;
 
 fun length list =
    if (null list) then
       0
    else 
       1 + length (tl list);
  
