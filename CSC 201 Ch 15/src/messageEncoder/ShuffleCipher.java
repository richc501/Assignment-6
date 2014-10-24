package messageEncoder;

public class ShuffleCipher implements MessageEncoder {
	int numberOfShuffles;
	public ShuffleCipher(int numberOfShuffles)
	{
		this.numberOfShuffles=numberOfShuffles;
	}
	@Override
	public String encode(String plainText) {
		for (int i=0;i<numberOfShuffles;i++)
		{
			singleShuffle(plainText);
		}
		return null;
	}
	public String singleShuffle(String message)
	{
		String newMessage1,newMessage2;
		StringBuilder builtMessage = new StringBuilder("");
		if (message.length()%2==0)
		{
			newMessage1 = message.substring(0,message.length()/2);
			newMessage2 = message.substring(message.length()/2,message.length());
			for(int i=0;i<message.length()/2;i++)
			{
				char firstLetter,secondLetter;
				firstLetter = newMessage1.charAt(i);
				secondLetter = newMessage2.charAt(i);
				builtMessage.append(firstLetter);
				builtMessage.append(secondLetter);
			}
		}
		else
		{
			//newMessage1 = message.substring(0,message.length()/2+1);
			newMessage2 = message.substring(message.length()/2+1,message.length());
			String newMessage = message.replace("", " ");
			String temp;
			String[] test = newMessage.split("");
			System.out.println(test.length);
			
			//StringBuilder test12 = new StringBuilder(newMessage1);
			int index=0;
			while(index<test.length)
			{

				//test[index+2]=Character.toString(newMessage2.charAt(index));
				System.out.println(test[index]);
				index++;
			}
			index=1;
			for(index=0;index<message.length()/2;index++)
			{
				temp=[(test.length/2)+index+2];
				test[index+3]= ;
				test[(test.length/2)+index+2]=temp;
			}
			index=0;
			while(index<test.length)
			{

				//test[index+2]=Character.toString(newMessage2.charAt(index));
				System.out.println(test[index]);
				index++;
			}
			//char temp;
			/*index=0;
			do
			{
				temp = ;
				test[index+1]=test[index+5];
				test[index+1]=temp;
				index++;
			}while(index<(test.length));
			index=0;
			                  //a b c d e f g h i
			System.out.println("afbgchdie");
			System.out.println("_______________");
			do
			{
				System.out.println(test[index]);
				index++;
			}while(index<test.length);*/
			/*int index;
			newMessage1 = message.substring(0,message.length()/2+1);
			newMessage2 = message.substring(message.length()/2+1,message.length());
			for(index=0;index<message.length()/2;index++)
			{
				char firstLetter,secondLetter;
				firstLetter = newMessage1.charAt(index);
				secondLetter = newMessage2.charAt(index);
				builtMessage.append(firstLetter);
				builtMessage.append(secondLetter);
			}
			builtMessage.append(newMessage1.charAt(index));*/
		}

		//System.out.println(newMessage1);
		//System.out.println(newMessage2);
		message = builtMessage.toString();
		return message;
	}
}
