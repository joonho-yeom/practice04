package prob2;

public class Money {
	private int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    
    
    
    public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public Money add( Money money ) {
        //더하기
    	return new Money(this.amount + money.getAmount());
    }
    public Money minus( Money money ) {
        //빼기
    	return new Money(this.amount - money.getAmount());
    }
    public Money multiply( Money money ) {
        //곱하기
    	return new Money(this.amount * money.getAmount());
    }
    public Money devide( Money money ) {
        //나누기
    	if(money.getAmount() == 0)
    	{
    		System.out.println("Err: divide by zero");
    		return new Money(0);
    	}
    	return new Money(this.amount / money.getAmount());
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
//equals 이클립스에서 만들어주는 것 써라.
}
