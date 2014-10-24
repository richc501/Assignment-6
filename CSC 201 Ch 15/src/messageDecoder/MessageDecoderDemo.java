package messageDecoder;

public class MessageDecoderDemo {
	public static void main(String[] args)
	{
	SubstitutionCipher aCipher = new SubstitutionCipher(1);
	//System.out.println(aCipher.decode("defg"));
	ShuffleCipher sCipher = new ShuffleCipher(3);
	//System.out.println(sCipher.singleShuffle("agbhcidjekf"));
	String test = null;
	test = sCipher.singleShuffle("afbgchdie");
	for(int i=-1;i<3;i++)
	{
		test = sCipher.singleShuffle(test);
	}
	System.out.println(test);
//	System.out.println(sCipher.singleShuffle("afbgchdie"));
//	System.out.println(sCipher.singleShuffle("ahfdbigec"));
//	System.out.println(sCipher.singleShuffle("aihgfedcb"));
//	System.out.println(sCipher.singleShuffle("aeidhcgbf"));
//	System.out.println(sCipher.singleShuffle("acegibdfh"));
	//System.out.println(sCipher.singleShuffle("aebfcgdh"));
	}
}
