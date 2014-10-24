package messageDecoder;

public class MessageDecoderDemo {
	public static void main(String[] args)
	{
	SubstitutionCipher aCipher = new SubstitutionCipher(3);
	System.out.println(aCipher.decode("defg"));
	ShuffleCipher sCipher = new ShuffleCipher(1);
	//System.out.println(sCipher.singleShuffle("agbhcidjekf"));
	//System.out.println(sCipher.singleShuffle("afbgchdie"));
	//System.out.println(sCipher.singleShuffle("aebfcgdh"));
	}
}
