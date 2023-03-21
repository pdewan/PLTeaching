totalCutoff(60).
regularPass(Total) :- totalCutoff(Total).
highFinalCutoff(80).
highFinalTotalCutoff(40).
highFinalPass(Total, Final) :- highFinalTotalCutoff(Total), highFinalCutoff(Final), 
		      Final >= HighFinalCutoff,
		      highFinalTotalCutoff(HighFinalTotalCutoff),		      
		      Total >= HighFinalCutoff.
pass(Total, Final) :- regularPass(Total); 
		      highFinalPass(Total,Final).
factorial(N, F) :- N = 0, F = 1.
factorial(N, F) :- N > 0, N2 is N-1, print(N2), factorial(N2, F2), print(F2), F is F2*N.

negate(Arg, Result) :- Result == Arg.		      