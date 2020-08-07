val PASS_CUTOFF = 60;
fun regularPass aTotal = aTotal >= PASS_CUTOFF;
 
val HIGH_FINAL_PASS_CUTOFF = 40;
val HIGH_FINAL_CUTOFF = 80;

fun highFinalPass (aTotal, aFinal) = 
	 (aFinal >= HIGH_FINAL_CUTOFF) andalso
	 (aTotal >= HIGH_FINAL_PASS_CUTOFF);
	 
fun pass (aTotal, aFinal) = 
	regularPass(aTotal) orelse 
	highFinalPass(aTotal, aFinal); 
	
		 
val pass2 = fn aTotal => fn aFinal => 
	regularPass(aTotal) orelse 
	highFinalPass(aTotal, aFinal); 
	
 val pass3 = fn (aTotal, aFinal) => 
	regularPass(aTotal) orelse 
	highFinalPass(aTotal, aFinal);
    
fun inc (x) = x;
val inc2 = fn (x, y) => x + y;
