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
			int count=0;
			for(index=0;index<message.length()/2;index++)
			{
				System.out.println(index);
				temp=test2[index];
				System.out.println(temp);
				test[count+1]= temp;
				//test[(test.length/2)+index+2]=temp;
				count+=2;
			}
			index=0;
			System.out.println("_____________");
			while(index<message.length())
			{

				builtMessage.append(test[index]);
				index++;
			}
			newMessage1 = builtMessage.toString();
		}
		//System.out.println(newMessage1);
		//System.out.println(newMessage2);
		message = builtMessage.toString();
		return message;
	}
}
