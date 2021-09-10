totalFinalCutoffs( 
 [
   [40, 80],
   [80, 50],
   [60, 60],
   [50, 70] 
 ]
).

totalFinalCutoffs1( 
	[
	  [20, 100],
	  [30, 90]
	 ]
       ).
 
 totalFinalCutoffs2( 
	[
	  [40, 80],
	  [50, 70]
	 ]
       ).
append([], ListToAppended, ListToAppended).
append([H|T], ListToAppended, [H|AppendedTail]) :- append(T, ListToAppended, AppendedTail).

reverse([], []).
reverse([H|T], ReversedList) :- reverse(T, ReversedTail), append(ReversedTail, [H], ReversedList).

reverseWrong([], []).
reverseWrong([H|T], [ReversedTail, H]) :- reverseWrong(T, ReversedTail).


reverse2([],Z,Z).
reverse2([H|T],Acc, Z) :- reverse2(T, [H|Acc], Z).

printTotalFinalCutoffs([[Total, Final] |Tail]) :- 
	printTotalFinalCutoff(Total, Final),
	printTotalFinalCutoffs(Tail).
printTotalFinalCutoff(Total, Final) :- 
	write("Total = "), write(Total),
	write(" Final = "), write(Final),
	nl.
printTotalGreaterThanFinalCutoff2s([[Total, Final] |Tail]) :- 
	(
	  (
	    Total > Final,
	     printTotalFinalCutoff(Total, Final)
	   );
	  (Total =< Final, true)
	),
	printTotalGreaterThanFinalCutoffs2(Tail).
		
printTotalGreaterThanFinalCutoffs([[Total, Final] |Tail]) :- 
	Total > Final,
	printTotalFinalCutoff(Total, Final),
	printTotalGreaterThanFinalCutoffs(Tail).
printTotalGreaterThanFinalCutoffs([[Total, Final]| Tail]) :- 
 	Total =< Final,	
	printTotalGreaterThanFinalCutoffs(Tail).