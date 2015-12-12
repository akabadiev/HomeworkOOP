
public class CallGsmDemo {

	public static void main(String[] args) {
		
		GSM gosho = new GSM();
		GSM pesho = new GSM();
		
		gosho.insertSimCard("081234567g");
		pesho.insertSimCard("081234567p");
		
		gosho.call(pesho, 3);
		gosho.call(pesho, 7);
		pesho.call(gosho, 4);
		System.out.println("Gosho e govoril: " + gosho.outgoingCallsDuration + " minuti");
		gosho.printInfoForTheLastOutgoingCall();
		System.out.println("Pesho e govoril: " + pesho.outgoingCallsDuration + " minuti");
		

		//pesho.getSumForCall();
	}

}
/*
Call newCall = new Call();
newCall.duration = 5;
newCall.caller = gosho;
newCall.receiver = pesho;
gosho.lastOutgoingCall = newCall;
System.out.println(gosho.lastOutgoingCall.duration);
*/