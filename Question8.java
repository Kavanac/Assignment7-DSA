
import java.util.*;

public class Question8{

static class pair
{
	int first, second;
	pair(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}

static void isStraightLinePossible(
	ArrayList<pair> arr, int n)
{
	int x0 = arr.get(0).first;
	int y0 = arr.get(0).second;

	int x1 = arr.get(1).first;
	int y1 = arr.get(1).second;

	int dx = x1 - x0, dy = y1 - y0;

	
	for(int i = 0; i < n; i++)
	{
		int x = arr.get(i).first;
		int y = arr.get(i).second;
		if (dx * (y - y1) != dy * (x - x1))
		{
			System.out.println("NO");
		}
	}
	System.out.println("YES");
}


public static void main(String[] args)
{
	
	ArrayList<pair> arr = new ArrayList<>();
	arr.add(new pair(1, 2));
	arr.add(new pair(2, 3));
	arr.add(new pair(3, 4));
	arr.add(new pair(4, 5));
	arr.add(new pair(5, 6));
	arr.add(new pair(6, 7));

	int n = 6;

	isStraightLinePossible(arr, n);
}
}


