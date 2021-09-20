class vowel
{
	public static void main(String[] args) {
		String ch = "a";
		if(ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("e")||ch.equalsIgnoreCase("i")||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("u")){
			System.out.println(ch+ "is vowel");
		}
		else
			System.out.println(ch+" "+ " is not vowel");
	}
}