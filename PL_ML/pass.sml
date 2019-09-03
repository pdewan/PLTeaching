val PASS_CUTOFF = 60;
fun regularPass aTotal = aTotal >= PASS_CUTOFF;
 
val PASS_CUTOFF = "40";
val HIGH_FINAL_CUTOFF = 80;

fun highFinalPass (aTotal, aFinal) = 
	 (aFinal >= HIGH_FINAL_CUTOFF) andalso
	 (aTotal >= PASS_CUTOFF);
	 
fun pass (aTotal, aFinal) = 
	regularPass(aTotal) orelse 
	highFinalPass(aTotal, aFinal); 
    

