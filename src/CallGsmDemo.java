
public class CallGsmDemo {

	public static void main(String[] args) {
		
		GSM gosho = new GSM();
		GSM pesho = new GSM();
		
		gosho.insertSimCard("0812345678");
		pesho.insertSimCard("0812345678");
		
//		System.out.println(gosho.outgoingCallsDuration);
		//gosho.call(pesho, 7);
//		gosho.outgoingCallsDuration = 5;
		Call newCall = new Call();
		newCall.duration = 5;
		newCall.caller = gosho;
		newCall.receiver = pesho;
		//System.out.println(newCall.duration);
		gosho.lastOutgoingCall = newCall;
		System.out.println(gosho.lastOutgoingCall.duration);
		//gosho.lastOutgoingCall.duration = newCall.duration;
		//gosho.lastOutgoingCall.receiver = pesho.simMobileNumber;
		
		//System.out.println(gosho.lastOutgoingCall.duration);
//		System.out.println(gosho.outgoingCallsDuration);
		//System.out.println(gosho.lastOutgoingCall.caller);
		//pesho.getSumForCall();
	}

}
