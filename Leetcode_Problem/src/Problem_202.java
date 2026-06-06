
public class Problem_202 {
	    public boolean isHappy(int n) {
	    
	    int num = n;
	    while(num >= 5){
	    int number =0;
	    while (num !=0){
	        int digit = num%10;
	        number = number+ digit * digit;
	        num/=10;
	    }
	     num = number;
	    }
	    return num==1?true:false;    
	    }
	}


