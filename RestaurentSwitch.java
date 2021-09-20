

public class RestaurentSwitch {
	public static void main(String[] args) {
		name(2);
	}

	public static void name(int food)
	{
		switch(food)
		{
		case 1:
			System.out.println("Gobi");
			break;
		case 2:
			System.out.println("Omlet");
			break;
		case 3:
			System.out.println("Mushroom");
			break;
		default :
				System.out.println("None");
		}
		

	}

}
