package tests;

import java.util.ArrayList;
import java.util.List;

public class BasicCopy  {
	 // Base case: when the input list is empty, return a new list with "EndCopy"
    public  List<String> copy3(List<String> input) {
        // If the input list is empty, return a list containing "EndCopy"
        if (input.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add("EndCopy");
            return result;
        }        
        // Recursive case: copy the head and recurse on the tail
        List<String> result = new ArrayList<>();
        result.add(input.get(0));  // Add the head (first element) to the result
        result.addAll(copy3(input.subList(1, input.size())));  // Recurse on the tail (rest of the list)
        return result;
    }
}
