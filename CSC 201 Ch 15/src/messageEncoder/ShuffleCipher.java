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
			newMessage1 = message.substring(0,message.length()/2+1);
			newMessage2 = message.substring(message.length()/2+1,message.length());
			String newMessage = message.replace("", " ");
			newMessage = newMessage.trim();
			newMessage2 = newMessage2.replace(""," ");
			newMessage2 = newMessage2.trim();
			String temp;
			String[] test = newMessage.split("");
			String[] test2 = newMessage2.split(" ");
			System.out.println(test.length);

			//StringBuilder test12 = new StringBuilder(newMessage1);
			int index=0;
			System.out.println("_____________");
			while(index<test.length)
			{

				//test[index+2]=Character.toString(newMessage2.charAt(index));
				System.out.println(test[index]);
				index++;
			}
			System.out.println("_____________");
			int t=0;
			for(index=0;index<message.length()/2;index++)
			{
				System.out.println(index);
				temp=test2[index];
				System.out.println(temp);
				test[t+1]= temp;
				//test[(test.length/2)+index+2]=temp;
				t+=2;
			}
			index=0;
			System.out.println("_____________");
			while(index<message.length())
			{

				builtMessage.append(test[index]);
				index++;
			}
			message = builtMessage.toString();
		}
		return message;
	}
}