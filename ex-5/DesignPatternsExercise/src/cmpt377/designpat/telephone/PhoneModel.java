package cmpt377.designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();

    public void addDigit(int newDigit) {
    	System.out.println("Pressing: " + newDigit);
    	System.out.println(newDigit);    	
        digits.add(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }
    
}
