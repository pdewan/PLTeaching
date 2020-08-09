totalCutoff(60).
regularPass(Total) :- totalCutoff(TotalCutoff), Total >= TotalCutoff.
highFinalTotalCutoff(40).
highFinalCutoff(80).
highFinalPass(Total, Final) :- highFinalCutoff(HighFinalCutoff), 
		      Final >= HighFinalCutoff,
		      highFinalTotalCutoff(HighFinalTotalCutoff),		      
		      Total >= HighFinalCutoff.
pass(Total, Final) :- regularPass(Total); 
		      highFinalPass(Total,Final).
factorial(N, F) :- N = 0, F = 1.
factorial(N, F) :- N > 0, N2 is N-1, print(N2), factorial(N2, F2), print(F2), F is F2*N.

negate(Arg, Result) :- Result == Arg.		      