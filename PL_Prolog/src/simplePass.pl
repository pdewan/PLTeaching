totalCutoff(60).
regularPass(Total) :- totalCutoff(TotalCutoff), Total = TotalCutoff.
highFinalTotalCutoff(40).
highFinalThreshold(80).
highFinalPass(Total, Final) :- highFinalThreshold(HighFinalThreshold), 
		      Final = HighFinalThreshold,
		      highFinalTotalCutoff(HighFinalTotalCutoff),		      
		      Total = HighFinalTotalCutoff.
pass(Total, Final) :- regularPass(Total); 
		      highFinalPass(Total,Final).