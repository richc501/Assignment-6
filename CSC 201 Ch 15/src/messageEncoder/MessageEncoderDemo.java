package messageEncoder;

public class MessageEncoderDemo {
	public static void main(String[] args)
	{
	SubstitutionCipher aCipher = new SubstitutionCipher(3);
	//System.out.println(aCipher.encode("abcd"));
	ShuffleCipher sCipher = new ShuffleCipher(1);
	System.out.println(sCipher.singleShuffle("abcdefghi"));
	}
}
