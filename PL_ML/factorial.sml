fun factorial n =
    if n <= 1 then
      1
    else
      factorial (n-1) * n;
fun factorial2 1 = 1 |
     factorial2 n = factorial2 (n-1) * n;

val factorial3 = fn 1 => 1 |
									  n => factorial3 (n-1) * n;
      
 
      		 
