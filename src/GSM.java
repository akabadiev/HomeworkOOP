
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	void insertSimCard(String simNumber){
		if (simNumber.length()==10 && simNumber.substring(0, 2).equals("08")) {
			simMobileNumber = simNumber;
			hasSimCard = true;
		}
	}
	
	void removeSimCard(){
		hasSimCard = false;
	}
	void increaseoutgoingcallduration(int duration){
		outgoingCallsDuration+=duration;
	}
	
	//metoda ne raboti, shte se opitam da go opravq v git
	void call(GSM receiver, int duration){
		    if (duration > 0 && !(receiver.simMobileNumber.equals(simMobileNumber)) && hasSimCard && receiver.hasSimCard){
		    	
			Call newCall = new Call();
			newCall.duration = duration;
			newCall.caller = this;
			newCall.receiver = receiver;
			lastOutgoingCall = newCall;
			outgoingCallsDuration += duration;
			
			receiver.lastIncomingCall = newCall;
		    } else {
		    	System.out.println("Problem!");
		    	return;
		    }
	}
	
	static void getSumForCall(){
//		System.out.println(outgoingCallsDuration*Call.priceForAMinute);
	}
	
	void printInfoForTheLastOutgoingCall(){
		if (lastOutgoingCall!=null) {
			System.out.println("Vreme na razgovor: " + lastOutgoingCall.duration);
			System.out.println("Ti se obadi na nomer: " + lastOutgoingCall.receiver.simMobileNumber);
			//System.out.println(lastOutgoingCall.caller.simMobileNumber);
		} else {
			System.out.println("Nqma takova povikvane");
		}
		
	}
	
	void printInfoForTheLastIncomingCall(){
		if (lastIncomingCall!=null) {
			System.out.println("Vreme na razgovor: " + lastIncomingCall.duration);
			System.out.println("Obadil se e nomer: " + lastIncomingCall.caller.simMobileNumber);
		} else {
			System.out.println("Nqma takova povikvane");
		}
		
	}
	
	
}
