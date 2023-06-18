
public class Question5
{

static String revAlternateK(String s,
							int k, int len)
{
	for (int i = 0; i < s.length();)
	{

		if (i + k > len)
			break;

		s = s.substring(0, i) + new String(new StringBuilder(
			s.substring(i, i + k)).reverse()) +
			s.substring(i + k);

		
		i += 2 * k;
	}
	return s;
}


public static void main(String[] args)
{
	String s = "abcdefg";
	int len = s.length();
	int k = 2;
	System.out.println(revAlternateK(s, k, len));
}
}

