package messageEncoder;

public class SubstitutionCipher implements MessageEncoder {
	private int shift;
	private char letter;
	public SubstitutionCipher(int shift)
	{
		this.setShift(shift);
	}
	@Override
	public String encode(String plainText) {
		StringBuilder tempText = new StringBuilder("");
		for (int i=0;i<plainText.length();i++)
		{
			letter = plainText.charAt(i);
			tempText.append(shifter(letter));
		}
		plainText = tempText.toString();
		return plainText;
	}
	public int getShift() {
		return shift;
	}
	public void setShift(int shift) {
		this.shift = shift;
	}
	private char shifter(char letter)
	{
		return (char)(letter+shift);
	}

}
