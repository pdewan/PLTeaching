%highFinalPass(60, 80).
%highFinalPass(40, 80).
%highFinalPass(60, 90).

%regularPass(60).
%regularPass(80).

father("John", "Joe").
father("Joe", "Jack").
father("Mary", "Jack").
father("Alice", "Bob").
mother("Ann", "Mary").
mother("John", "Alice").
father.
%Father("John", "Joe").
father(john, joe).

grandFather(Person, GrandFather) :- father(Person, Father), father(Father, GrandFather);
				    mother(Person, Mother), father(Mother, GrandFather). 
hpass(60, 80).
hpass(60, 80).
hpass(60, 100).
%pass(30*2).
regularPass(60).
highFinalPass(40, 80).
highFinalPass(50, 70).
pass(Total, Final):- 
    regularPass(TotalCutoff), Total >= TotalCutoff;
    highFinalPass(HighFinalTotalCutoff, HighFinalCutoff), 
    Total >= HighFinalTotalCutoff, Final >= HighFinalCutoff.
    
recursivePass(60).
recursivePass(40, 80).
recursivePass(50, 70).
recursivePass(Total, Final):- 
    recursivePass(TotalCutoff), Total >= TotalCutoff;
    recursivePass(HighFinalTotalCutoff, HighFinalCutoff), 
    Total >= HighFinalTotalCutoff, Final >= HighFinalCutoff.

directPass(Total, Final) :- Total >= 60; Total >= 40, Final >= 80.
%twice(X, 2*X).
%twice(X, Y) :- Y = 2*X.
twice(X, Y) :- Y is 2*X.

%twice(X, Y) :- TwiceX is 2*X, Y = TwiceX.
mixedquery(X, 2) :- X = 2.

pass(30*2).

%		     pass(HighFinalTotalCutoff, HighFinalCutoff), Total >= HighFinalTotalCutoff, Final > HighFinalCutoff.
%pass(60, 100).
%pass(60, 80).
%pass(70, 80).
%pass(70, 100).
%pass(60, 90).
%pass(60, 80).
%pass(60, 80).
%pass(60, 80).