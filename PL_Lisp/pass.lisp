(setq PASS_CUTOFF 60)
(defun regularPass (total)
    (cond 
      ((>= total PASS_CUTOFF) t)
      (t nil)
    ) 
 ) 

(setq HIGH_FINAL_CUTOFF 40)
(setq HIGH_FINAL_THRESHOLD 80)

(defun highFinalPass (total final)
    (cond 
	    (
           (and 
             (>= final HIGH_FINAL_THRESHOLD)
             (>= total HIGH_FINAL_CUTOFF)
           )
           t
        )
        (t nil)
    )
  )
(defun pass (total final)
    (cond 
	    (
           (or 
             (regularPass total)
             (highFinalPass total final)
           )
           t
        )
        (t nil)
    )
  )
        
  