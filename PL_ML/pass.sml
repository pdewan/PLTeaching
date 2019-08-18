(* an sml file *)
fun fact 0 = 1 | fact n =  n* fact (n -1);
val passCutoff = 60;
fun regularPass aTotal = aTotal >= passCutoff;
 
val passCutoff = 40;
val highFinalThreshold = 80;

fun highFinalPass (aTotal, aFinal) = 
	(aFinal >= highFinalThreshold) andalso
	 (aTotal >= passCutoff);
	 
fun pass (aTotal, aFinal) = 
	regularPass(aTotal) orelse 
	highFinalPass(aTotal, aFinal); 
    

