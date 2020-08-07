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