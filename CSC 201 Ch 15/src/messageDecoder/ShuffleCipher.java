package messageDecoder;

public class ShuffleCipher implements MessageDecoder {
	int numberOfShuffles;
	public ShuffleCipher(int numberOfShuffles)
	{
		this.numberOfShuffles=numberOfShuffles;
	}
	@Override
	public String decode(String plainText) {
		for (int i=0;i<numberOfShuffles;i++)
		{
			singleShuffle(plainText);
		}
		return null;
	}
	public String singleShuffle(String message)
	{
		String newMessage1,newMessage2;
		StringBuilder part1Message = new StringBuilder("");
		StringBuilder part2Message = new StringBuilder("");
		StringBuilder builtMessage = new StringBuilder("");
		if (message.length()%2==0)
		{
			newMessage1 = message.substring(0,message.length()/2);
			newMessage2 = message.substring(message.length()/2,message.length());
			System.out.println(newMessage1);
			System.out.println(newMessage2);
			for(int i=0;i<newMessage1.length()/2;i++)
			{
				char firstLetter1,firstLetter2,secondLetter1,secondLetter2;
				firstLetter1 = newMessage1.charAt(i);
				secondLetter1 = newMessage1.charAt(i+2);
				builtMessage.append(firstLetter1);
				builtMessage.append(secondLetter1);
				firstLetter2 = newMessage2.charAt(i);
				secondLetter2 = newMessage2.charAt(i+2);
				builtMessage.append(firstLetter2);
				builtMessage.append(secondLetter2);
			}
		}
		else
		{
			newMessage1 = message.substring(0,message.length()/2);
			newMessage2 = message.substring(message.length()/2,message.length());
			System.out.println(newMessage1);
			System.out.println(newMessage2);
			for(int j=0;j<newMessage1.length()/2;j++)
			{
				char firstLetter, secondLetter;
				firstLetter = newMessage1.charAt(j);
				secondLetter = newMessage1.charAt(j+2);
				part1Message.append(firstLetter);
				part1Message.append(secondLetter);
			}
			newMessage1=part1Message.toString();
			System.out.println(newMessage1);
			for(int k=0;k<newMessage2.length();k++)
			{
				char firstLetter, secondLetter;
				firstLetter = newMessage2.charAt(k);
				//secondLetter = newMessage2.charAt(k+2);
				part2Message.append(firstLetter);
				//part2Message.append(secondLetter);
				k++;
			}
			for(int l=0;l<newMessage2.length()/2;l++)
			{
				char firstLetter, secondLetter;
				firstLetter = newMessage2.charAt(l+1);
				part2Message.append(firstLetter);
				l++;
			}
			newMessage2=part2Message.toString();
			System.out.println(newMessage2);
			for(int i=0;i<newMessage1.length()/2;i++)
			{
				char firstLetter1,firstLetter2,secondLetter1,secondLetter2;
				firstLetter1 = newMessage1.charAt(i);
				secondLetter1 = newMessage1.charAt(i+1);
				builtMessage.append(firstLetter1);
				builtMessage.append(secondLetter1);
				firstLetter2 = newMessage2.charAt(i);
				secondLetter2 = newMessage2.charAt(i+1);
				builtMessage.append(firstLetter2);
				builtMessage.append(secondLetter2);
			}
			//builtMessage.append(newMessage1.charAt(index));
		}

		//System.out.println(newMessage1);
		//System.out.println(newMessage2);
		message = builtMessage.toString();
		return message;
	}
}
