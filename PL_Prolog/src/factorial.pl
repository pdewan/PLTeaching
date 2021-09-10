factorial(0, 1).
factorial(N, F) :- 
%	N > 0, 
	N2 is N-1,factorial(N2, F2), F is F2*N.
%factorial(0, 1).

negate(Arg, Result) :- Result == Arg.

concat(S1, S2, S3) :- S3 is S1+ S2.
twice(X, 2*X).
		      