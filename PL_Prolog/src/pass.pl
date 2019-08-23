passCutoff(60).
regularPass(Total) :- passCutoff(PassCutoff), Total >= PassCutoff.
highFinalCutoff(40).
highFinalThreshold(80).
highFinalPass(Total, Final) :- highFinalThreshold(HighFinalThreshold), 
		      Final >= HighFinalThreshold,
		      highFinalCutoff(HighFinalCutoff),		      
		      Total >= HighFinalCutoff.
pass(Total, Final) :- regularPass(Total); 
		      highFinalPass(Total,Final).