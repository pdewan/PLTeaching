factorial(N, F) :- N = 0, F = 1.
factorial(N, F) :- N > 0, N2 is N-1, print(N2), factorial(N2, F2), print(F2), F is F2*N.

negate(Arg, Result) :- Result == Arg.		      