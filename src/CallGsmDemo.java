
public class CallGsmDemo {

	public static void main(String[] args) {
		
		GSM gosho = new GSM();
		GSM pesho = new GSM();
		
		gosho.insertSimCard("0812345678");
		pesho.insertSimCard("0812345678");
		
		System.out.println(gosho.outgoingCallsDuration);
		gosho.call(pesho, 7);
		System.out.println(gosho.outgoingCallsDuration);
		//pesho.getSumForCall();
	}

}
